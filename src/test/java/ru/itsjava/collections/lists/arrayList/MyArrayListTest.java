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
        String str = "Hello";
        actualList.add(str);

        assertTrue(actualList.contains(str));

    }
    @DisplayName(" Корректно проверяет на добавление объекта")
    @Test
    public void shouldHaveCorrectAdd(){
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.add(arrayList));
    }
    @DisplayName(" Корректно проверяет на очистку массива")
    @Test
    public void shouldHaveCorrectCleaner(){
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Hello");
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }
}