package ru.itsjava.interfaces.interfacesPracticeHW;

public interface Talkable {

    default void talk(){
        System.out.println("Муу");
    }
}
