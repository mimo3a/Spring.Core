package ua.bis.mimoza.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	String[] rockAlbum = { "RockSong 1", "RockSong 2", "RockSong 3" };

	@Override
	public String[] getSong() {

		return rockAlbum;
	}

}
