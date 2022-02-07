package ru.itsjava.interfaces.interfacesPracticeHW;

public class Main {
    public static void main(String[] args) {

        Talkable talk = new Cow();
        talk.talk();
        Talkable talk1 = new Man();
        talk1.talk();

        Eatable eat = new Plant();
        eat.eat();
        Eatable eat1 = new Cow();
        eat1.eat();



    }
}
