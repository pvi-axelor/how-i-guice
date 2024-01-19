package learn.guc.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import learn.guc.service.StudentDetails;

public class StudentDetailsImpl implements StudentDetails {

	@Inject
	@Named("StudentName")
	private String name;
	
	private int age;
	
	@Inject
	public void setAge(@Named("StudentAge") int age) {
		this.age = age / 2 + 1;
	}
	
// no need of default constructor
// as it is created implicitly and just-in-time binding happens
	
	@Override
	public void print() {
		System.out.println(String.format("Name: %s, Age: %s", this.name, this.age));
		System.out.println("Current hashcode: " + this.hashCode());
	}

}
