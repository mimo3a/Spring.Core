package ua.bis.mimoza.spring;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
    			SpringConfig.class);
    	
    	MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
    	player.playMusic();
    	
        

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        RockMusic music = context.getBean("rockMusic", RockMusic.class);
        music.getSong();
        		
       

        context.close();
    }
}
