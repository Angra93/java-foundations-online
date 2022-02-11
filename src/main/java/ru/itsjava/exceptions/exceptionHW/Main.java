package ru.itsjava.exceptions.exceptionHW;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Vova", 15);

        System.out.println("person.agePerson(15) = " + person.agePerson(person.getAge()));

        try {
            System.out.println("person.agePerson = " + person.agePerson(176));
        } catch (AgeNotValidException e) {
            System.out.println("dgdfg");
            e.printStackTrace();
        }

    }
}
