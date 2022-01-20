package ru.itsjava.homeWork.hwDog;

public class Dog {
    private final String size;
    private String color;

    public Dog(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "size:" + size + " color:" + color;
    }
}
