package ru.itsjava.homeWork.hwBirds;

public class Main {
    public static void main(String[] args) {

        Birds birds = new Parrot();

        System.out.println("Parrot " + birds.toString());
        System.out.println();

        Birds birds1 = new Crows();

        System.out.println("Crows " + birds1.toString());
    }
}
