package ru.itsjava.exceptions.exceptionHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public void agePerson(int age) throws AgeNotValidException {
//        try {
//            if (age > 150){
//            //    throw new Exception("Слишком большой возраст");
//                return "Слишком большой возраст";
//            }
//            if (age < 0){
//             //   throw new Exception("Возраст не должен быть меньше 0");
//                return "Возраст не должен быть меньше 0";
//            }
//        } catch (Exception e) {
//        //    e.printStackTrace();
//            throw new AgeNotValidException("sdf");
//        }
//         return "Программа завершена";

        if (age > 150) {
            System.out.println("Слишком большой возраст");
        }
        if (age < 0) {
            System.out.println("Возраст не должен быть меньше 0");
        }
        else System.out.println(age);
    }
}

