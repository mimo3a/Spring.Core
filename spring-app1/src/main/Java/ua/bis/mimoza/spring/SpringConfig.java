package ua.bis.mimoza.spring;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("ua.bis.mimoza.spring")
@PropertySource("classpath:musicPlayer.properties")


public class SpringConfig {
	
	@Bean
	public ClassicMusic classicMusic() {
		return new ClassicMusic();
	}
	
	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	
	@Bean
	public RapMusic rapMusic() {
		return new RapMusic();
	}
	
	
	
	@Bean
	public ArrayList<Music> janreList() {
		ArrayList <Music> janre = new ArrayList<Music>();
		janre.add(classicMusic());
		janre.add(rockMusic());
		janre.add(rapMusic());
		return janre;	
		
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(janreList());
	}
	
	
	@Bean 
	public Computer computer() {
		return new Computer(musicPlayer());
	}

}
