package ru.itsjava.comparable.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {

//        if (name.equals(person.name)) {
//            return name.compareTo(person.name);
//        }
//        else if (surname.equals(person.surname)) {
//            return (surname.compareTo(person.surname));
//        }
//        return (int) (age - person.age);

       return name.compareTo(person.name);
//       if (name.equals(person.name)){
//           return surname.compareTo(surname);
//       }
//       else return   (age - person.age);
    }
}
