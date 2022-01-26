package ru.itsjava.oop;

public class OOPPractice {
    public static void main(String[] args) {

        Telephone phone = new IPhone();

        Telephone telephone = new Telephone("IPhone", true);

        System.out.println("phone.toString() = " + phone.toString());

        Telephone phone2 = new IPhone();
        System.out.println("phone2.toString() = " + phone2.toString());

        System.out.println("phone.getBrand() = " + phone.getBrand());

        System.out.println("telephone = " + telephone);
    }
}
