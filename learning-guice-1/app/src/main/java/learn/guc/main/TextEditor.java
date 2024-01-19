package learn.guc.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TextEditor {
	
	@BindingAnnotation @Target ({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD}) @Retention (RetentionPolicy.RUNTIME)
	@interface binderInterface {}
	
	private SpellCheckerInterface spellCheckerInterface;

	@Inject
	public TextEditor(@binderInterface SpellCheckerInterface spellCheckerInterface) {
		super();
		this.spellCheckerInterface = spellCheckerInterface;
	}
	
	public void makeSpellCheck() {
		spellCheckerInterface.checkSpelling();
	}
	
}

class WordEditor {
	private SpellCheckerInterface spellCheckerInterface;

	@Inject
	public WordEditor(@Named("WordEditorClass") SpellCheckerInterface spellCheckerInterface) {
		super();
		this.spellCheckerInterface = spellCheckerInterface;
	}
	
	public void makeSpellCheck() {
		spellCheckerInterface.checkSpelling();
	}
}