package org.example.springCourse;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Something pop");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
