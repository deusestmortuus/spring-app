package ru.kuznetsov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Player player = context.getBean("player", Player.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        player.play();
    }
}
