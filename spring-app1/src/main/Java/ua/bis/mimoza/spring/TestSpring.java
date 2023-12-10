package ua.bis.mimoza.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);	
		ClassicMusic classicMusic = context.getBean("classicMusicBean",ClassicMusic.class);
		System.out.println(classicMusic.getSong());

		 

		MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
		MusicPlayer player2 = context.getBean("musicPlayerBean", MusicPlayer.class);
		
		boolean comp = player == player2;
		
		System.out.println(comp);
		
		System.out.println(player);
		System.out.println(player2);
		
		player.setVolume(5);
		System.out.println(player.getVolume());
		System.out.println(player2.getVolume());
		
         player.playMusic();
         System.out.println(player.getName());
         System.out.println(player.getVolume());
         
		
		
		context.close();

	}
	
	

}
