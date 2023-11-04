package org.example.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final Music music1;
    private final Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre.equals(Genre.CLASSICAL)) {
            System.out.println("Playing: " + music1.getSong().get(randomNumber));
        }
        if (genre.equals(Genre.ROCK)) {
            System.out.println("Playing: " + music2.getSong().get(randomNumber));
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
