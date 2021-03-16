package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    @Override
    public List<String> getSongList() {
        return new ArrayList<>(Arrays.asList("Wind cries Mary","Rock Song1","Song of Rock-and-Roll")) ;
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
