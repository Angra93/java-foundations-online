package ru.itsjava.exceptions.exceptionHW;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Vova", 24);

        try {
            person.printAge();
        } catch (AgeNotValidException age) {
            System.out.println("Вы ввели что-то не то");
            age.printStackTrace();
        }
        finally {
            System.out.println("Программа работает");
        }
    }
}
