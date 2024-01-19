package learn.guc.impl;

import com.google.inject.Inject;

import learn.guc.service.RandomNumber;

public class WorkPlace {

	public int staff;
	public int managers;
	
	@Inject
	public WorkPlace(int s, int m) {
		staff = s;
		managers = m;
	}
}
