package learn.guc.main;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import learn.guc.main.TextEditor.binderInterface;

public class BindindModule extends AbstractModule {

	@Override
	protected void configure() {
//		bind(SpellCheckerInterface.class).to(SpellCheckerImplementation.class);
		bind(SpellCheckerInterface.class).annotatedWith(binderInterface.class).to(WordCheckerImplementation.class);
		bind(SpellCheckerInterface.class).annotatedWith(Names.named("WordEditorClass"))
				.to(SpellCheckerImplementation.class);
	}
}