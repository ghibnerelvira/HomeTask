package de.telran.homework2;

public class Homework1 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(1+". Задача");

        // 1
        // Создать строку через new - I study Basic Java!
        String myString = new String("I study Basic Java!");

        // -> Распечатать пред-последний символ строки. Используем метод String.charAt().
        char symbol = myString.charAt(0);
        symbol = myString.charAt(myString.length()-2);
        System.out.println("- Пред-последний символ строки = "+ symbol);
        // -> Распечатать последний символ строки. Используем метод String.charAt().
        symbol = myString.charAt(myString.length()-1);
        System.out.println("- Последний символ строки  = "+ symbol);

        // -> Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        //System.out.println("Содержит ли строка подстроку Java "+myString.contains("Java= "));
        boolean containsJava = myString.contains("Java");
        System.out.println("- Содержит подстроку 'Java'= " + containsJava);

        // -> Вырезать строку Java c помощью метода String.substring().
        String subStr = myString.substring(0,14)+ myString.substring(18);
        System.out.println("- Вырезанная подстрока 'Java' = "+ subStr);

        // -> Заменить все символы “а” на “о”.
        System.out.println("- Замененные символы 'а' на 'о' = "+myString.replace('a','o'));

        // -> Преобразовать строку к верхнему регистру.
        System.out.println("- Строка с верхним регистром =  "+myString.toUpperCase());

        // -> Преобразовать строку к нижнему регистру.
        System.out.println("- Строка с нижним регистром = "+myString.toLowerCase());

    }
}
