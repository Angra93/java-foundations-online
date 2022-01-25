package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Telephone {

    private final String brand;
    private boolean isHomey;

    public Telephone(String brand) {
        this.brand = brand;
    }
//
//    public Telephone(String brand, boolean isHomey) {
//        // В equals сравнивается brand с brand
//        this.brand = brand;
//        // В equals сравнивается isHomey с isHomey
//        this.isHomey = isHomey;
//    }
//
//    public String toString() {
//        return "{ brand:" + brand + " isHomey:" + isHomey + "}";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        // если ссылка на 1 и тот же объект то true, заканчивается проверка
//        if (this == o) return true;
//        // если объект равен null или другому классу то false
//        if (o == null || getClass() != o.getClass()) return false;
//
//        // Класс Telephone работает с объктом Telephone
//        Telephone telephone = (Telephone) o;
//
//        // Проверяется isHomey если не равны то false
//        if (isHomey != telephone.isHomey) return false;
//        // В ином случае возвращается и сравнивает brand
//        return brand.equals(telephone.brand);
//    }
//
//    @Override
//    public int hashCode() {
//        // возвращает хэшкод brand
//        return brand.hashCode();
//    }
}
