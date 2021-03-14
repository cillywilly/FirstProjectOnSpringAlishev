package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//        musicPlayer musicPlayer = new musicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparsion = firstMusicPlayer == secondMusicPlayer;
        System.out.println("ravni? " + comparsion);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.playMusicList();
        firstMusicPlayer.setVolume(65);
        System.out.println("name : " + firstMusicPlayer.getName());
        System.out.println("first volume : " + firstMusicPlayer.getVolume());
        System.out.println("second volume : " + secondMusicPlayer.getVolume());

        Music music = context.getBean("classssicalMusic", Music.class);
        System.out.println(music.getSong());

        context.close();
    }
}
