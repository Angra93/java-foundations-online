package ru.itsjava.interfaces.interfacesPracticeHW;

public interface Eatable {

    default void eat(){
        System.out.println("Можно есть");
    }
}
