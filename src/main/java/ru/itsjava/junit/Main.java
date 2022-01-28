package ru.itsjava.junit;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Vova", 23);

        person.birthday();

        System.out.println("person.takeBeer() = " + person.takeBeer());

    }
}
