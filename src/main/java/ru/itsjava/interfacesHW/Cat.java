package ru.itsjava.interfacesHW;

public class Cat implements Walkable, Runnable{
    @Override
    public void walk() {
        System.out.println("Пройдусь в поисках приключений");
    }

    @Override
    public void run() {
        System.out.println("Хоть бы не догнал");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }
}
