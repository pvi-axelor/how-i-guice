package learn.guc.module;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;

import learn.guc.impl.AppleJuiceBlocker;
import learn.guc.impl.Juice;

public class FruitModule extends AbstractModule {
	
	@Override
	public void configure() {
		bindConstant().annotatedWith(Names.named("newFruit1")).to("Pineapple");
		bindConstant().annotatedWith(Names.named("newFruit2")).to("Apple");
		
		bind(Juice.class).annotatedWith(Names.named("newJuiceInstance")).toInstance(new Juice());
		
		bindInterceptor(Matchers.any(),
				Matchers.annotatedWith(Names.named("NoMoreAppleJuice")),
				new AppleJuiceBlocker());
		
	}
}
