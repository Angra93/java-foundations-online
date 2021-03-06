package ru.itsjava.collections.lists.arrayList;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) {
            return true;
        } else return false;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(obj)){
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
//            array[realSize] = o; входят if и else
//            realSize++;
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            // Копирование массива
            // for (int i = 0; i < array.length; i++) = arraycopy
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            // Вставка нашего элемента

        }
        array[realSize++] = o;
        // realSize++; можно написать инкремент выше в массиве
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        // return "MyArrayList{" + Arrays.toString(array) +'}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
