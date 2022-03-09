package ru.itsjava.collections.lists.arrayList;

import java.util.List;

public class MyArrayListPractice {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        System.out.println("\n" + "list.size = " + list.size() + "\n");

        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления 2х элементов размер = " + list.size());

        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("После добавления еще 8ми элементов размер = " + list.size());

        list.add("Пока");
        System.out.println("list.size() = " + list.size());

        System.out.println("\n" + "toString = " + list);

        System.out.println("\n" + "list.isEmpty() = " + list.isEmpty());

        System.out.println("\n" + "list.contains() = " + list.contains("Пока"));

        list.clear();
        System.out.println("\n" + "list.size = " + list.size());


    }
}
