package learn.guc.randomdate;

import java.util.Random;

import com.google.inject.Provider;

public class RandomDateProviderInterface implements Provider<RandomDateInterface> {
	
	@Override
	public RandomDateInterface get() {
		
		Random random = new Random();
		return new RandomDateImplementation(random.nextInt(1, 31), random.nextInt(1, 12), random.nextInt(1900, 2100));
	}

}
