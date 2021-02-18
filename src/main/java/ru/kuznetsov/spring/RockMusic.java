package ru.kuznetsov.spring;

public class RockMusic implements Music {
    @Override
    public String playMusic() {
        return "Играет рок";
    }
}
