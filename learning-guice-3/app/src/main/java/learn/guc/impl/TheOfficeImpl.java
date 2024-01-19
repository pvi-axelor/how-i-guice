package learn.guc.impl;

import com.google.inject.Inject;

import learn.guc.service.TheOffice;

public class TheOfficeImpl implements TheOffice {
	
	private WorkPlace workPlace;
	
	@Inject
	public TheOfficeImpl(WorkPlace workPlace) {
		this.workPlace = workPlace;
	}

	@Override
	public boolean hasStaff() {
		
		return workPlace.staff > 0 ? true : false;
	}

	@Override
	public int getNumberOfStaff() {
		
		return workPlace.staff;
	}

	@Override
	public int getNumberOfManagers() {
		
		return workPlace.managers;
	}

}
