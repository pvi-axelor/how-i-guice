package learn.guc.songlyrics;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class SongLyricsBindingModule extends AbstractModule{
	
	@Override
	public void configure() {
		
		try {
			bind(SongLyricsInterface.class).toConstructor(SongLyricsImplementation.class.getConstructor(String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("some error happened!");
		}
		
		bind(String.class).toInstance("Just chiyaon chiyao, just chiyao");
		bind(String.class).annotatedWith(Names.named("ActualLyrics")).toInstance("Just chill chill, just chill");
		
	}
}
