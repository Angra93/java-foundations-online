package ru.itsjava.interfaces.interfacesPracticeHW;

public class Cow implements Talkable, Eatable {

    @Override
    public void eat() {
        System.out.println("Можно если осторожно");
    }
}
