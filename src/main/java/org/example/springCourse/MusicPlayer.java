package org.example.springCourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private final List<Music> genre;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> genre) {
        this.genre = genre;
    }

    public String playMusic() {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        return "Playing: " + genre.get(random.nextInt(genre.size())).getSong().get(randomNumber);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
