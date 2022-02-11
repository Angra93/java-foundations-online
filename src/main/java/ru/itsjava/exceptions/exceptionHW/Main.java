package ru.itsjava.exceptions.exceptionHW;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Vova", 24);

  //      System.out.println("person.agePerson = " + person.agePerson(person.getAge()));
//
//        try {
//            System.out.println("person.agePerson = " + person.agePerson(176));
//        } catch (AgeNotValidException e) {
//            System.out.println("dgdfg");
//            e.printStackTrace();
//        }

        try {
            person.agePerson(person.getAge());
        } catch (AgeNotValidException age) {
            System.out.println("Вы ввели что-то не то");
            age.printStackTrace();
        }
        finally {
            System.out.println("Программа работает");
        }
    }
}
