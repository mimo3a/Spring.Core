package ua.bis.mimoza.spring;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

	ArrayList<Music> janre = new ArrayList<Music>();

//	private Music music1;
//	private Music music2;

	@Value("${musicPlayer.name}")
	private String name;

	@Value("${musicPlayer.volume}")
	private int volume;

	public MusicPlayer(ArrayList<Music> janre) {
		super();
		this.janre = janre;
	}

	public void playMusic() {
		System.out.println("Playing");

		Random random = new Random();
		int number = random.nextInt(janre.size());
		System.out.println(number);

		System.out.println(janre.get(number).getSong() + " Volum " + this.volume);

	}

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

}
