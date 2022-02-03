package ru.itsjava.interfaces.interfacesHW;

public class Main {
    public static void main(String[] args) {
//        Man vova = new Man();
//        Dog bobik = new Dog();
        Cat murzik = new Cat();
        Bird bird = new Bird();

        Runnable vova = new Man();
        Runnable bobik = new Dog();



        System.out.println("Vova: ");
        vova.walk();
        System.out.println("Bobik: ");
        bobik.walk();
        System.out.println("Murzik");
        murzik.walk();
        System.out.println("Bird");
        bird.fly();
        System.out.println(bird.flyMaxDistance());
        System.out.println("Vova: ");
        vova.run();
        System.out.println("Bobik: ");
        bobik.run();
        System.out.println(bobik.maxRunDistance());
        System.out.println("Murzik");
        murzik.run();
        System.out.println(murzik.maxRunDistance());


    }
}
