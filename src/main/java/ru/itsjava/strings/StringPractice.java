package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
//        String name = "Angra";
//        String copyName = "Angra";
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Angra");
//        System.out.println("(constructorName == name =) " + (constructorName == name));
//        String internConstructorName = constructorName.intern();
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        String str = "Я строка";
        System.out.println("str.length() = " + str.length()); // <- длина строки
        System.out.println("str.isEmpty() = " + str.isEmpty()); // <- проверяет пустая ли строка
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строка")); // <- сравнивает строки
        System.out.println("str.equals(\"Я строкА\") = " +
                "" + str.equalsIgnoreCase("Я строкА")); // <- сравнивает строки игнорируя регистр

        String[] strs = str.split(" ");      // <- можно разбить строку на 2 части
        System.out.println("strs[0] = " + strs[0]);
        System.out.println("strs[1] = " + strs[1]);

//        for (int i = 0; i < 1_000_000; i++) { // <- долгий способ, создает множество новых объектов
//            str = str + "!";
//        }
//        System.out.println(str);

        StringBuilder builderStr = new StringBuilder(str);  // <- изменяет состояние 1го объекта много раз
        for (int i = 0; i < 1; i++) {
            builderStr.append("!");
        }
        System.out.println(builderStr);
    }

}
