package org.example.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();
    {
        songs.add("Hungarian Rhapsody");
        songs.add("In The Morning");
        songs.add("Last Resort");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
