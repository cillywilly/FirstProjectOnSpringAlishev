package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public void initMusicPlayer() {
        System.out.println("sozdal musicPLayer");
    }

    public void destroyMusicPlayer() {
        System.out.println("ydalil musicPlayer");//не вызывается у бина со скоупом прототайп
    }
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

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void playMusicList() {
        musicList.forEach(i-> System.out.println(i.getSong()));
    }

}
