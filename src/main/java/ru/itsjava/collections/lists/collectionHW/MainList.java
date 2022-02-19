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

        books.add(new Book("Java", "Book", 123));
        books.add(new Book("Java 2", "Book", 123));
        books.add(new Book("Java 3", "Book", 123));


        int num = 0;
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
        System.out.println("Получить 1й элемент, и последний");
        System.out.println("books.get(1) = " + books.get(1));
        System.out.println("books.get(books.size()-1) = " + books.get(books.size() - 1));
        System.out.println();

        System.out.println("Удалить по имени и индексу: ");
        System.out.println("books.remove(theWonderfulWizardOfOz) = " + books.remove(theWonderfulWizardOfOz));
        System.out.println("books.remove(5) = " + books.remove(4));
        int num3 = 0;
        for (Book bookList : books) {
            System.out.print(num3 + " ");
            System.out.println(bookList);
            num3++;
        }
        System.out.println();
        System.out.println("Проверяет на наличе элемента: ");
        System.out.println("books.contains(thinkingInJava) = " + books.contains(thinkingInJava));

        System.out.println();
        System.out.println("Вывести список на экран в формате: List: ");
        System.out.println(books);
        System.out.println();

//        6. Отфильтровать список вернуть записи по некоторому условию:
        System.out.println("Условие на индекс: Индекс делится на 3");
        for (int i = 0; i < books.size() - 1; i++) {
            if (i % 3 == 0) {
                System.out.println(books.get(i));
            }
        }

        System.out.println("\n" + "Условие на значение: Вернуть количество книг, которые равны \"Java\"");
        int num4 = 0;
        for (Book list : books) {
            if (list.getTitle().contains("Java")) {
                System.out.println(list);
                num4++;
            }
        }
        System.out.println(num4 + "\n");

        // 7. Пропустить несколько первых элементов
        System.out.println(("Пропустить первые 3 книги в списке."));
        for (int i = 3; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        // Пропускаем элементы, которые удовлетворяют некоторому условию
        System.out.println(("\n" + "Пропустить первые 2 книги, которые равные \"Java\""));
        for (int i = 2; i < books.size(); i++) {
            if (books.get(i).getTitle().contains("Java"))
                System.out.println(books.get(i));
            //      Не получается правильно составить логику. Не уверен то правильно сделал
        }

        // 8. Вернуть первый подходящий элемент:
        System.out.println("\n" + "Возвращаем первую книгу, длина автора которого делится на 3");
        for (int i = 0; i < books.size(); i++) {//
            if (books.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(books.get(i));
                break;
            }
        }
        // 9. Возвращаем все элементы удовлетворяющие условию:
        System.out.println(("\n" + "Возвращаем все книги, длина автора которых делится на 3"));
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(books.get(i));
            }
        }
    }
}
