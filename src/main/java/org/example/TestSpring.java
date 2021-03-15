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
//        System.out.println(firstMusicPlayer);
        firstMusicPlayer.playMusicList(MusicType.POP_MUSIC);
        firstMusicPlayer.playMusicList(MusicType.CLASSIC_MUSIC);
        firstMusicPlayer.playMusicList(MusicType.ROCK_MUSIC);
//        firstMusicPlayer.setVolume(65);
//        System.out.println("first volume : " + firstMusicPlayer.getVolume());

//        Music music = context.getBean("classicalMusic", Music.class);
//        System.out.println(music.getSongList());

        context.close();
    }
}
