package learn.guc.module;

import com.google.inject.AbstractModule;

import learn.guc.service.RickRoll;

public class RickRollModule extends AbstractModule {
	@Override
	public void configure() {
		bindConstant().annotatedWith(RickRoll.class).to("Never gonna give you up!");
	}
}
