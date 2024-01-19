package learn.guc.service;

import com.google.inject.ImplementedBy;

import learn.guc.impl.CustomSingletonImpl;

@ImplementedBy (CustomSingletonImpl.class)
public interface CustomSingleton {
	public void printHashCode();
}
