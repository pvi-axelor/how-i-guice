package learn.guc.module;

import com.google.inject.AbstractModule;

import learn.guc.impl.TheOfficeImpl;
import learn.guc.impl.WorkPlace;
import learn.guc.service.TheOffice;

public class TheOfficeModule extends AbstractModule {
	@Override
	public void configure() {
		try {
//			won't be required as annotation been used
//			bind(TheOffice.class).toConstructor(TheOfficeImpl.class.getConstructor(WorkPlace.class));
//			bind(WorkPlace.class).toProvider(WorkPlaceProvider.class);
		} catch(Exception e) {} finally {}
		
	}
}
