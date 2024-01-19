package learn.guc.module;


import com.google.inject.AbstractModule;
import learn.guc.impl.WorkPlace;

public class WorkPlaceModule extends AbstractModule {
	@Override
	public void configure() {
		bind(WorkPlace.class).toProvider(WorkPlaceProvider.class);
	}
}
