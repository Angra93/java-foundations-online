package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private String brand;
    private String colour;
    private static int price = 100_000;

    public String getCar() {
        return brand + ", " + colour + ", " + price;

    }
}
