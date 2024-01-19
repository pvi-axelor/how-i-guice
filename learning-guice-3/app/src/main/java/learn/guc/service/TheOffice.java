package learn.guc.service;

import com.google.inject.ImplementedBy;

import learn.guc.impl.TheOfficeImpl;

@ImplementedBy (TheOfficeImpl.class)
public interface TheOffice {
	public boolean hasStaff();
	public int getNumberOfStaff();
	public int getNumberOfManagers();
}
