package ru.itsjava.exceptions.exceptionHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public void printAge() throws AgeNotValidException {

//        if (age > 150) {
//            throw new AgeNotValidException ("Слишком большой возраст");
//        }
//        if (age < 0) {
//            throw new AgeNotValidException ("Возраст не должен быть меньше 0");
//        }

        if ((age < 0) || (age > 150)) {
            throw new AgeNotValidException("Возраст введен не корректно");
        }
        System.out.println(age);
    }
}

