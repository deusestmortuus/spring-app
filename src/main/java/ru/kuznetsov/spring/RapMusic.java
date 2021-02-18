package ru.kuznetsov.spring;

public class RapMusic implements Music{

    @Override
    public String playMusic() {
        return "Играет рэп";
    }
}
