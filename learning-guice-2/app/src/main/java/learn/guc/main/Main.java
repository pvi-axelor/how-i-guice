package learn.guc.main;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import learn.guc.modules.SongLyricsModule;
import learn.guc.modules.StudentDetailsModule;
import learn.guc.service.CustomSingleton;
import learn.guc.service.SongLyrics;
import learn.guc.service.StudentDetails;

public class Main {
    public static void main(String[] args) {
    	
//    	Constructor binding
    	
//    	Injector injector = Guice.createInjector(new SongLyricsModule());
//    	SongLyrics songLyrics = injector.getInstance(SongLyrics.class);
//    	songLyrics.getLyrics();
    	
//    	Method Binding and Field binding
    	
    	Injector injector = Guice.createInjector(new StudentDetailsModule());
    	StudentDetails studentDetails = injector.getInstance(StudentDetails.class);
    	
    	StudentDetails studentDetails2 = injector.getInstance(StudentDetails.class);
    	
    	studentDetails.print();
    	studentDetails2.print();
    	
    	
//    	Singleton
    	
//    	Injector injector1 = Guice.createInjector(new AbstractModule() {});
//    	
//    	CustomSingleton customSingleton1 = injector1.getInstance(CustomSingleton.class);
//    	CustomSingleton customSingleton2 = injector1.getInstance(CustomSingleton.class);
//    	
//    	customSingleton1.printHashCode();
//    	customSingleton2.printHashCode();
    	
    	

    }
}
