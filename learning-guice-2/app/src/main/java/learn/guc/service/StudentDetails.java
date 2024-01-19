package learn.guc.service;

import com.google.inject.ImplementedBy;

import learn.guc.impl.StudentDetailsImpl;

@ImplementedBy(StudentDetailsImpl.class)
public interface StudentDetails {
	
	public void print();
	
}
