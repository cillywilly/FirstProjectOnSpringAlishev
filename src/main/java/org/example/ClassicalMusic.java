package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {

    public static ClassicalMusic getClassicalMusicfabr() {
        return new ClassicalMusic();
    }
    
    @Override
    public List<String> getSongList() {
        return new ArrayList<>(Arrays.asList("Hungarian Rhapsody","Classic Song1","Song of Classic")) ;
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
