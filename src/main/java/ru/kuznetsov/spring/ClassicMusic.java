package ru.kuznetsov.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    @Override
    public String[] playMusic() {
        String[] music = new String[3];
        for (int i = 0; i < 3; i++) {
            music[i] = "Классика " + i;
        }
        return music;
    }
}
