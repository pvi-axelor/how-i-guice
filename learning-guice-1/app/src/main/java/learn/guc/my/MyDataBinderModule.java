package learn.guc.my;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyDataBinderModule extends AbstractModule {
	
	protected void configure() {
	
		bind(String.class).annotatedWith(Names.named("MyName")).toInstance("Prerit Vishal");
		bind(Integer.class).annotatedWith(Names.named("MyAge")).toInstance(24);
		bind(String.class).annotatedWith(Names.named("MyGender")).toInstance("Male");
	
	}
	
}