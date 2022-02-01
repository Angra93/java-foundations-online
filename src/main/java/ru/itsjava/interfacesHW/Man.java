package ru.itsjava.interfacesHW;

public class Man implements Walkable, Runnable{
    @Override
    public void walk() {
        System.out.println("Прогуливаюсь по парку");
    }

    @Override
    public void run() {
        System.out.println("Убежала сабака бегу за ней");
    }

    @Override
    public int maxRunDistance() {
        return 30;
    }
}
