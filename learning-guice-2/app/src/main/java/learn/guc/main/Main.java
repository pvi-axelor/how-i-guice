package learn.guc.main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import learn.guc.modules.SongLyricsModule;
import learn.guc.service.SongLyrics;

public class Main {
    public static void main(String[] args) {
    	
    	Injector injector = Guice.createInjector(new SongLyricsModule());
    	SongLyrics songLyrics = injector.getInstance(SongLyrics.class);
    	songLyrics.getLyrics();

    }
}
