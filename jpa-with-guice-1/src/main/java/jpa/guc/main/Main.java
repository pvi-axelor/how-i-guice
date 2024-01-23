package jpa.guc.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.persist.jpa.JpaPersistOptions;

import jpa.guc.entity.Student;
import jpa.guc.res.Name;

public class Main {
    public static void main(String[] args) {
//    	Injector injector = Guice.createInjector(new JpaPersistModule("jpa_guc_1"),  new CustomModule());
//    	MyInitilizer myInitilizer = injector.getInstance(MyInitilizer.class);
//    	MyService service = injector.getInstance(MyService.class);
//    	service.createNewStudent();
    	
    	
//    	Let's go back to old ways
    	
//    	EntityManager entityManager = null;
//    	EntityManagerFactory entityManagerFactory = null;
//    	
//    	try {
//    		entityManagerFactory = Persistence.createEntityManagerFactory("jpaguc");
//    		
//    		entityManager = entityManagerFactory.createEntityManager();
//    		
//    		Student me = new Student();
//    		
//    		entityManager.getTransaction().begin();
//    		
//    		entityManager.persist(me);
//    		
//    		entityManager.getTransaction().commit();
//    		
//    	} catch (Exception e) {
//    		e.printStackTrace();
//    	}
//    	
//    	It's working fine, so time to switch to new mode
//    	first, lets create a new module which will have all my custom bindings
//    	Injector injector = Guice.createInjector(new JpaPersistModule("jpaguc"),  new CustomModule());
//    	I don't need a custom module
//    	Injector injector = Guice.createInjector(new JpaPersistModule("jpaguc"));
    	
    	
//    	first, create the option for setting auto-begining the work, then pass it on while creating the JpaPersistModule
    	JpaPersistOptions options = JpaPersistOptions.builder().setAutoBeginWorkOnEntityManagerCreation(true).build();
    	JpaPersistModule jpaPersistModule = new JpaPersistModule("jpaguc", options);
//    	install(jpaPersistModule.options(options));
//    	don't need this one as of now

//    	create the injector
    	Injector injector = Guice.createInjector(jpaPersistModule);
    	
//    	now, I need to have a class to start the Persistence services, a pre-built interface is given, named PersistServices
//    	I'll create a new class for initialization, similar to my Action class, and an interface to implement the start and stop services
    	MyInitilizer myInitilizer = injector.getInstance(MyInitilizer.class);
//    	binding is not required !
    	
//    	A service class to perform all the work
    	MyService service = injector.getInstance(MyService.class);
    	
//    	Student student = new Student(new Name("Prerit", "Vishal"), 24, "Male", "PIET");
    	
//    	service.create(student);
//    	service.delete(new Student(5));
    	
//    	Student student = new Student();
//    	service.create(student);
//    	student = (Student)service.read(student, student.getStudentId());
//    	System.out.println(student);
    	
    	
    	Student student = new Student();
    	service.create(student);
    	
    	student.setAge(55);
    	
    	service.update(student, student.getStudentId());
    	
    	
    	
	}
}
