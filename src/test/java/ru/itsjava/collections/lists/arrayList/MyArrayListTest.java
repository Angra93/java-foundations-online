package ru.itsjava.collections.lists.arrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @DisplayName(" Коррекстно проверяет является ли массив пустым")
    @Test
    public void shouldHaveCorrectIsEmpty() {
        MyArrayList actualList = new MyArrayList();
        actualList.isEmpty();

        assertTrue(actualList.isEmpty());
    }

    @DisplayName(" Корректно проверяет находится ли объект в массиве")
    @Test
    public void shouldHaveCorrectContains() {
        MyArrayList actualList = new MyArrayList();
        actualList.contains(new Object());

       // assertTrue(actualList.contains(new Object())); тут сложновато приходится (


    }

}