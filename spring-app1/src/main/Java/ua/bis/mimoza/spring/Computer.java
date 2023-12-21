package ua.bis.mimoza.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
	
	private int id;
	private MusicPlayer musicPlayer;
	
	
	public Computer(MusicPlayer musicPlayer) {
		super();
		this.musicPlayer = musicPlayer;
		id = 1;
	}

	public void player() {
		musicPlayer.playMusic();
	}
	
	

}
