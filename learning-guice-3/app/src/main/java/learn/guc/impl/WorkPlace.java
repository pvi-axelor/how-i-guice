package learn.guc.impl;

import com.google.inject.Inject;

public class WorkPlace {

	public int staff;
	public int managers;
	
	@Inject
	public WorkPlace(int s, int m) {
		staff = s;
		managers = m;
	}
}
