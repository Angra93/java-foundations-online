package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Dog {
    private final String nickname;
    private int pawsCount;

//    public Dog(String nickname, int pawsCount) {   <-- @AllArgsConstructor заменяет этот конструктор
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }

//    @Override
//    public boolean equals(Object o) {
//        // если ссылка на 1 и тот же объект то true, заканчивается проверка
//        if (this == o) return true;
//        // если объект равен null или другому классу то false
//        if (o == null || getClass() != o.getClass()) return false;
////     Класс Dog работает с объктом Dog
//        Dog dog = (Dog) o;
////     проверяется количечство лап, если не совпадает то false
//        if (pawsCount != dog.pawsCount) return false;
//        // Сравнивается имена
//        return nickname.equals(dog.nickname);
//    }
//
//    @Override
//    public int hashCode() {
//        // возвращает хэшкод имени
//        return nickname.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{nickname: " + nickname +
//                ", paws: " + pawsCount + "}";
//
//    }
}
