package ru.itsjava.comparable.hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person vova = new Person("Vova", "Volkov", 16);
        Person dasha = new Person("Dasha", "Smernova", 18);
        Person misha = new Person("Misha", "Ivanov", 14);
        Person anna = new Person("Anna", "Smernova", 15);

        Person vova2 = (Person) vova.clone();
        Person dasha2 = (Person) dasha.clone();
        System.out.println("vova2 = " + vova2);
        System.out.println("dasha2 = " + dasha2);
        System.out.println();

        Person[] persons = {vova, dasha, misha, anna};
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
        System.out.println();
        Arrays.sort(persons);
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
    }
}
