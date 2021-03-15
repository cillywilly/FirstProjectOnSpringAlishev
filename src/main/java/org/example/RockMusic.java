package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSongList() {
        return new ArrayList<>(Arrays.asList("Wind cries Mary","Rock Song1","Song of Rock-and-Roll")) ;
    }
}
