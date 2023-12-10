package ua.bis.mimoza.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music rockMusic = context.getBean("rockMusic", Music.class);

        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);

        rockMusicPlayer.playMusic();
        
        Music classicMusic = context.getBean("classicMusic", Music.class);

        MusicPlayer classicMusicPlayer = new MusicPlayer(classicMusic);

        classicMusicPlayer.playMusic();
        

        context.close();
    }
}
