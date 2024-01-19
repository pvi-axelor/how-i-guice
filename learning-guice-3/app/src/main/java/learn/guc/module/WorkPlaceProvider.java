package learn.guc.module;

import java.util.Random;

import com.google.inject.Provider;
import com.google.inject.Provides;

import learn.guc.impl.WorkPlace;

public class WorkPlaceProvider implements Provider<WorkPlace> {

	@Override
	@Provides
	public WorkPlace get() {
		return new WorkPlace((new Random().nextInt(0, 100)), (new Random().nextInt(0, 100)));
	}

}
