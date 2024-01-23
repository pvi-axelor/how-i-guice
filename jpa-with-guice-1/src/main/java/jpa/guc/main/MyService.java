package jpa.guc.main;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import jakarta.persistence.EntityManager;
import jpa.guc.entity.Student;

@Transactional
public class MyService {
	
	@Inject
	EntityManager entityManager;
	
//	@Transactional, no need as the annotation at class will make
//	sure every public method is treated as transactional
	public void create(Object object) {
		entityManager.persist(object);
	}
	
//	@Transactional
	public Object read(Object object, int pKey) {
		object = entityManager.find(object.getClass(), pKey);
//		uncomment it to print the output
//		System.out.println(object);
		return object;
	}
	
	public void update(Object object, int pKey) {
//		var temp = entityManager.find(object.getClass(), pKey);
//		temp = object;
//		can simply use merge to find and update the value
		entityManager.merge(object);
		
	}
	
	
//	@Transactional
	public void delete(Object object) {
//		can't simply remove it, have to merge it first else it'll throw a illegal args exception for detached entity 
		entityManager.remove(entityManager.merge(object));
	}
	
}
