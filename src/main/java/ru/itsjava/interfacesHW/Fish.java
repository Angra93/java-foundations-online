package ru.itsjava.interfacesHW;

public class Fish implements Swimable{
    @Override
    public void swim() {
        System.out.println("Плыву я сквозь волны и ветер к единственной маме на свете");
    }

    @Override
    public double maxSwimSpeed() {
        return 100.0;
    }
}
