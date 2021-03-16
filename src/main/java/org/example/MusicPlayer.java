package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Random;

public class MusicPlayer {
    private Music rockMusic;
    private Music clasMusic;
    private Music popMusic;
    private ArrayList<Music> musicWawes;

    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music clasMusic,
                       @Qualifier("popMusic") Music popMusic) {
        this.rockMusic = rockMusic;
        this.clasMusic = clasMusic;
        this.popMusic = popMusic;
    }

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(ArrayList<Music> musicWawes) {
        this.musicWawes=musicWawes;
    }

//    public void initMusicPlayer() {
//        System.out.println("sozdal musicPLayer");
//    }

    //    public void destroyMusicPlayer() {
//        System.out.println("ydalil musicPlayer");//не вызывается у бина со скоупом прототайп
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

////    @Autowired-----------------------------------и тут можно
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
////    @Autowired-----------------------------------и тут можно
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public List<Music> getMusicList() {
//        return musicList;
//    }

    public void playMusicWawe(ArrayList<Music> musicWawes) {
        int randomInt = new Random().nextInt(3);
        System.out.println(musicWawes.get(randomInt).getSong());
    }

    public void playMusicList(MusicType musicType) {
        int randomInt = new Random().nextInt(3);
        switch (musicType) {
            case POP_MUSIC:
                popMusic = new PopMusic();
                System.out.println(popMusic.getSongList().get(randomInt));
                break;
            case ROCK_MUSIC:
                rockMusic = new RockMusic();
                System.out.println(rockMusic.getSongList().get(randomInt));
                break;
            case CLASSIC_MUSIC:
                clasMusic = new ClassicalMusic();
                System.out.println(clasMusic.getSongList().get(randomInt));
                break;
        }
    }

}
