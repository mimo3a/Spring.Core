package ua.bis.mimoza.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {

	String[] classicAlbum = { "ClassicSong 1", "ClassicSong 2", "ClassicSong 3" };

	@Override
	public String[] getSong() {

		return classicAlbum;
	}

}
