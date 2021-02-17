package ru.kuznetsov.spring;

public class RapMusic implements Music{

    @Override
    public String[] playMusic() {
        String[] music = new String[3];
        for (int i = 0; i < 3; i++) {
            music[i] = "Рэп " + i;
        }
        return music;
    }
}
