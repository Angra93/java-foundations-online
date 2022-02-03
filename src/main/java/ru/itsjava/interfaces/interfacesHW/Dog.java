package ru.itsjava.interfaces.interfacesHW;

public class Dog implements Walkable, Runnable{
    @Override
    public void walk() {
        System.out.println("Прогуливают по парку");
    }

    @Override
    public void run() {
        System.out.println("Бегу за котом, с ним поиграю");
    }

    @Override
    public int maxRunDistance() {
        return 60;
    }
}
