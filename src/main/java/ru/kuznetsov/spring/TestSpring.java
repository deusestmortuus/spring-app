package ru.kuznetsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Player player = context.getBean("player", Player.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        player.play(Type.CLASSICAL);
    }
}
