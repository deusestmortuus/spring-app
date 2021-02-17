package ru.kuznetsov.spring;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Player {
    private Music rockMusic;
    private Music classicMusic;

    @Autowired
    public Player(Music rockMusic, Music classicMusic) {
        this.rockMusic = rockMusic;
        this.classicMusic = classicMusic;
    }

    public void play(Type type) {
        
        String[] music = new String[3];
        if (type.equals(Type.CLASSICAL)) {
            music = classicMusic.playMusic();
        } else if (type.equals(Type.ROCK)) {
            music = rockMusic.playMusic();   
        }

        Random random = new Random();
        int songNumber = random.nextInt(3);
        System.out.println(music[songNumber]);
    }
}
