package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PopMusic implements Music {
    @Override
    public List<String> getSongList() {
        return new ArrayList<>(Arrays.asList("Fade","Pop Song1","Song of PopularMusic")) ;
    }
}
