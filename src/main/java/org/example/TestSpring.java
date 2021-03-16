package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
//        Music music = context.getBean("musicBean", Music.class);
//        musicPlayer musicPlayer = new musicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMysicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        ArrayList musicArrayList = context.getBean("musicWawes", ArrayList.class);
        System.out.println(firstMusicPlayer == secondMysicPlayer);
//        System.out.println(firstMusicPlayer);
        firstMusicPlayer.playMusicWawe(musicArrayList);
//        firstMusicPlayer.playMusicList(MusicType.POP_MUSIC);
//        firstMusicPlayer.playMusicList(MusicType.CLASSIC_MUSIC);
//        firstMusicPlayer.playMusicList(MusicType.ROCK_MUSIC);
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());

        //        firstMusicPlayer.setVolume(65);
//        System.out.println("first volume : " + firstMusicPlayer.getVolume());

//        Music music = context.getBean("classicalMusic", Music.class);
//        System.out.println(music.getSongList());

        context.close();
    }
}
