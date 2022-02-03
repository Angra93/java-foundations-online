package ru.itsjava.interfaces.interfacesHW;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Небо моя обитель");
    }

    @Override
    public String flyMaxDistance() {
        return "чик-чирик";
    }
}
