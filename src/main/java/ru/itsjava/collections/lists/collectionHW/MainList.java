package ru.itsjava.collections.lists.collectionHW;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<Book> voidBookList = new ArrayList<>();  // <- а). Создать пустой список книг
        System.out.println(voidBookList);

        List<Book> books = new ArrayList<>(20); // Создать список размером 20

        //  Добавить подряд 5 элементов.
        Book harryPotter = new Book("Harry Potter", "J.K.Rowling", 432);
        Book thinkingInJava = new Book("Thinking in Java", "Bruce Eckel", 1168);
        Book littlePrince = new Book("Little Prince", "Antoine de Saint-Exupéry", 112);
        Book masterAndMargarita = new Book("The Master and Margarita", "Mikhail Bulgakov", 512);
        Book grokkingAlgorithms = new Book("Grokking Algorithms", "Aditya Bhargava", 288);

        books.add(harryPotter);
        books.add(thinkingInJava);
        books.add(littlePrince);
        books.add(masterAndMargarita);
        books.add(grokkingAlgorithms);

        int num = 1;
        for (Book bookList : books) {
            System.out.print(num + " ");
            System.out.println(bookList);
            num++;
        }

        // Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        Book theWonderfulWizardOfOz = new Book("The Wonderful Wizard of Oz", "L. FRANK BAUM", 176);
        Book sharpObjects = new Book(" Sharp Objects", " Gillian Flynn", 342);
        books.add(3, theWonderfulWizardOfOz);
        books.add(1, sharpObjects);
        System.out.println();

        int num2 = 0;
        for (Book bookList : books) {
            System.out.print(num2 + " ");
            System.out.println(bookList);
            num2++;
        }
        System.out.println();
        System.out.println("books.get(1) = " + books.get(1));
        System.out.println("books.get(books.size()-1) = " + books.get(books.size() - 1));
        System.out.println();

        System.out.println("books.remove(theWonderfulWizardOfOz) = " + books.remove(theWonderfulWizardOfOz));
        System.out.println("books.remove(masterAndMargarita) = " + books.remove(masterAndMargarita));
        int num3 = 0;
        for (Book bookList : books) {
            System.out.print(num3 + " ");
            System.out.println(bookList);
            num3++;
        }
        System.out.println("books.contains(thinkingInJava) = " + books.contains(thinkingInJava));
        System.out.println();
        System.out.println(books);
    }
}
