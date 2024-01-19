package learn.guc.impl;

import com.google.inject.Singleton;

import learn.guc.service.CustomSingleton;

@Singleton
public class CustomSingletonImpl implements CustomSingleton {
	
	@Override
	public void printHashCode() {
		System.out.println("Current hashcode : " + this.hashCode());
	}

	

}
