package de.telran.homework3;

import java.util.Locale;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // 1.
        // Ввести 2 слова, воспользоватся сканером, состоящие из четного количества букв (проверьте количество букв в слове).
        // Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
        // Например:
        // -> ввод - mama, papa
        // -> вывод - mapa

        Scanner scannerStr = new Scanner(System.in);
        scannerStr.useLocale(Locale.GERMANY);
        System.out.print("Ввoд: ");
        String myStr1  = scannerStr.next();
        String myStr2 = scannerStr.next();
        // Вариант 1
        String subStr = myStr1.substring(0,2)+ myStr2.substring(2);
        System.out.println("Результат 1: "+subStr);


        // Вариант 2
        // Получаем первую половину первого слова
        String half1 = myStr1.substring(0, myStr1.length() / 2);

        // Получаем вторую половину второго слова
        String half2 = myStr2.substring(myStr2.length() / 2);

        // Объединяем половины и выводим результат
        String result = half1 + half2;
        System.out.println("Результат 2: " + result);







    }
}
