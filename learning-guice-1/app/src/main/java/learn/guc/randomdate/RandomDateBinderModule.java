package learn.guc.randomdate;

import java.util.Random;

import org.checkerframework.framework.qual.Unused;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class RandomDateBinderModule extends AbstractModule {

	@Override
	public void configure() {
		bind(RandomDateInterface.class).toProvider(RandomDateProviderInterface.class);
	}

//  used a provider interface implemented class
//	@Provides
//	public RandomDateInterface randomDate() {
//
//		Random random = new Random();
//		return new RandomDateImplementation(random.nextInt(1, 31), random.nextInt(1, 12), random.nextInt(1900, 2100));
//	}
}
