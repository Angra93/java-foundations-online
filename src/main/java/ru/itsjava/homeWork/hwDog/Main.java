package ru.itsjava.homeWork.hwDog;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Dog dog = new WhiteTerrier();

        System.out.println("WhiteTerrier " + dog);
        System.out.println();

        Dog dog1 = new Doberman();

        System.out.println("Doberman " + dog1);
    }
}
