package org.example.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Look at me");
        songs.add("Cause you happy");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
