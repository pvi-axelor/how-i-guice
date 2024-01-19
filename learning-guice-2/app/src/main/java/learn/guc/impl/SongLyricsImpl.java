package learn.guc.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import learn.guc.service.SongLyrics;

public class SongLyricsImpl implements SongLyrics {

	private String lyrics;
	
	public SongLyricsImpl() {
		super();
		this.lyrics = "no lyrics :(";
	}

	@Inject
	public SongLyricsImpl(@Named("RickRoll") String lyrics) {
		super();
		this.lyrics = lyrics;
	}

	@Override
	public void getLyrics() {
		System.out.println(this.lyrics);
	}

}
