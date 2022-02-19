package ru.itsjava.collections.lists.collectionHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private final String name;
    private int age;
    private char isMale;

    public boolean getIsMale(char м) {
        if (isMale == м){
            return true;
        }
        else return false;
    }
}
