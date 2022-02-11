package ru.itsjava.exceptions.exceptionHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public String agePerson(int age) {
//        if (age > 150) {
//            System.out.println("Ошибка");
//        } else if (age < 0) {
//            System.out.println("Ошибка");
//        } else {
//            System.out.println("Все ок");
//        }

        try {
            if (age > 150){
            //    throw new Exception("Слишком большой возраст");
                return "Слишком большой возраст";
            }
            if (age < 0){
             //   throw new Exception("Возраст не должен быть меньше 0");
                return "Возраст не должен быть меньше 0";
            }
        } catch (Exception e) {
        //    e.printStackTrace();
            throw new AgeNotValidException("sdf");
        }
         return "Программа завершена";
    }
}

