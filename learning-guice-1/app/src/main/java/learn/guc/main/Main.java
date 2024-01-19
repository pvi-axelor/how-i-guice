package learn.guc.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import learn.guc.my.*;
import learn.guc.randomdate.RandomDateBinderModule;
import learn.guc.randomdate.RandomDateInterface;
import learn.guc.songlyrics.SongLyricsBindingModule;
import learn.guc.songlyrics.SongLyricsInterface;

public class Main {

	public static void main(String[] args) {
//		Injector injector = Guice.createInjector(new BindindModule());
//		
//		TextEditor textEditor = injector.getInstance(TextEditor.class);
//		textEditor.makeSpellCheck();
//		
//		WordEditor wordEditor = injector.getInstance(WordEditor.class);
//		wordEditor.makeSpellCheck();
//	}
	
	// printing my data, binding it to a constant data
	
//		Injector injector = Guice.createInjector(new MyDataBinderModule());
//		MyDataImplementation myDataImplementation = injector.getInstance(MyDataImplementation.class);
//
//		myDataImplementation.printMyData();
		
		// printing the data using @Provides annotation
		
//		Injector injector = Guice.createInjector(new RandomDateBinderModule());
//		RandomDateInterface randomDateInterface = injector.getInstance(RandomDateInterface.class);
//		randomDateInterface.getARandomDate();
		
//		Injector injector = Guice.createInjector(new RandomDateBinderModule());
//		RandomDateInterface randomDateInterface = injector.getInstance(RandomDateInterface.class);
//		randomDateInterface.getARandomDate();
		
		Injector injector = Guice.createInjector(new SongLyricsBindingModule());
		SongLyricsInterface songLyricsInterface = injector.getInstance(SongLyricsInterface.class);
		songLyricsInterface.getLyrics();
		
	}
}
