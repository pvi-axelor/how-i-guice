package learn.guc.songlyrics;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SongLyricsImplementation implements SongLyricsInterface {

	private String lyric;

	@Inject
	public SongLyricsImplementation() {
		this.lyric = "no lyrics :(";
	}

	@Inject
	public SongLyricsImplementation(@Named("ActualLyrics") String lyric) {
		this.lyric = lyric;
	}
	
	@Override
	public void getLyrics() {
		System.out.println(lyric);
	}

}
