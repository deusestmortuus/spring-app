package ru.kuznetsov.spring;

public class ClassicMusic implements Music{

    @Override
    public String playMusic() {
        return "Играет классическая музыка";
    }
}
