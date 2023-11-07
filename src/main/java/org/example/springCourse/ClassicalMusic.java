package org.example.springCourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

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
