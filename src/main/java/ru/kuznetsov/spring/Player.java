package ru.kuznetsov.spring;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class Player {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    public Player(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void play() {
        Random random = new Random();
        int randomMusic = random.nextInt(3);
        System.out.println(musicList.get(randomMusic).playMusic());
    }
}
