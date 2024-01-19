package learn.guc.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import learn.guc.impl.StudentDetailsImpl;
import learn.guc.service.StudentDetails;

public class StudentDetailsModule extends AbstractModule {

	@Override
	public void configure() {
		
		bindConstant().annotatedWith(Names.named("StudentName")).to("Prerit");
		bindConstant().annotatedWith(Names.named("StudentAge")).to(24);
	}
}
