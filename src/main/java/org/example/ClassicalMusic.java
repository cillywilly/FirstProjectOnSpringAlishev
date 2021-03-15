package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    public static ClassicalMusic getClassicalMusicfabr() {
        return new ClassicalMusic();
    }
    
    @Override
    public List<String> getSongList() {
        return new ArrayList<>(Arrays.asList("Hungarian Rhapsody","Classic Song1","Song of Classic")) ;
    }
}
