package org.example.springCourse;

public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

//    @Override
//    public String toString() {
//        return "Computer " + id + " " + musicPlayer.playMusic(Genre.CLASSICAL);
//    }
}
