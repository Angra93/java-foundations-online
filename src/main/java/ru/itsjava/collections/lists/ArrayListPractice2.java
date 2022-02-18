package ru.itsjava.collections.lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko, dmitriySeiko, valentinOmega));
        System.out.println("Наши часы: " + watches);
        System.out.println();


        System.out.println("Вывести все часы у которых фирма Saiko");
        // Пробегаемся по Watch
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();
        System.out.println("Вывести все часы у которых цена > 25_000");
        for (Watch watch : watches) {
            if (watch.getPrice() > 25_000.0) {
                System.out.print(watch + " ");
            }
        }
        System.out.println();
        System.out.println("Вывести одни часы у которых цена > 25_000");
        for (Watch watch : watches) {
            if (watch.getPrice() > 25_000) {
                System.out.println(watch + " ");
                break;
            }
        }
        System.out.println();
        System.out.println("Пропустить первые два элемента фирмы Seiko");
        // Пробегаемся от начала до конца массива
        int seikoCount = 0;
        for (int i = 0; i < watches.size(); i++) {
// Берется каждый раз 1 элемент, берем фирму, с Seiko
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }
        System.out.println();
    }
}
