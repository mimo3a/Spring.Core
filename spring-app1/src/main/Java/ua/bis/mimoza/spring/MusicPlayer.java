package ua.bis.mimoza.spring;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//	so

//@Autowired	
//@Qualifier("classicMusic")
//private Music music1;
//@Autowired	
//@Qualifier("rockMusic")
//private Music music2;

//	oder so

	private Music music1;
	private Music music2;

	@Autowired
	public MusicPlayer(@Qualifier("classicMusic") Music music1, @Qualifier("rockMusic") Music music2) {
		super();
		this.music1 = music1;
		this.music2 = music2;
	}

	public void playMusic(MusicJanre janre) {
		
		Random random =  new Random();
		int number = random.nextInt(3);		

		switch (janre) {
		case CLASSICAL:
			System.out.println(music1.getSong()[number]);
			break;
		case ROCK:
			System.out.println(music2.getSong()[number]);
			break;
		default:
			break;
		}

	}

	

}
