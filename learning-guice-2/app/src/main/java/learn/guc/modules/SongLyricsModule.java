package learn.guc.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import learn.guc.impl.SongLyricsImpl;
import learn.guc.service.SongLyrics;

public class SongLyricsModule extends AbstractModule {
	@Override
	public void configure() {
		try {
			bind(SongLyrics.class).toConstructor(SongLyricsImpl.class.getConstructor(String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		bind(String.class).toInstance("\nTell me why...\nAin't nothing but heart-ache!");
		bind(String.class).annotatedWith(Names.named("RickRoll")).toInstance(
				"\nNever gonna give you up!\nNever gonna let you down!\nNever gonna run around and desert you!");

	}
}
