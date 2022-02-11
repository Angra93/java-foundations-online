package ru.itsjava.exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {

        // throw new RuntimeException("My runtime exception"); // <- RuntimeException не проверяемые исключения

//        try {                     // <- try catch блок - это механизм поимки исключений, исключительных ситуаций
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!! Exception. Be careful. !!!");
////            e.printStackTrace();
//        }
//
//        try {
//            System.out.println("Begin"); //<- проверяемые исключения
//            throw new Exception();    //<- Зашли в begin, поймали ошибку обработали ее в catch, finally реализовался
//        } catch (Exception e) {
//            System.out.println("CATCH");
////            e.printStackTrace();
//        }finally {
//            System.out.println("FINALLY");
//        }
//        System.out.println("END");

//        try {       // <- Не проверяемые исключения с помощью catch вполне ловятся
//            throw new RuntimeException();
//        } catch (Throwable throwable) {
//            System.out.println("Throwable");
//        }

//        try {
//            throw new RuntimeException();        // Throwable не будет обработан потому что был обрабобтан 1м catch
//        } catch (RuntimeException runtimeException) {
//            System.out.println("Runtime exception");
//        } catch (Throwable throwable) {
//            System.out.println("Throwable");
//        }

        Calculator calculator = new Calculator();
        System.out.println("calculator.division(5, 3) = " + calculator.division(5, 3));

        try {
            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));
        } catch (CalculatorException ce) {
            System.out.println("Вы ввели что-то не то");
            ce.printStackTrace();
        }
    }
}

