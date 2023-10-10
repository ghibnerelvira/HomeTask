package de.telran.homework3;

import java.util.Scanner;

public class Homework2 {

    // 1.
    // Реализовать программу, выводящую на экран результаты:
    // -> Сложения двух чисел
    // -> Вычитания двух чисел
    // -> Умножения двух чисел
    // -> Деления двух чисел
    // -> Каждая из арифметических операций должна быть реализована как отдельный метод.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int  sum1 = (int) scanner.nextDouble();
        System.out.print("Введите второе число: ");
        int sum2 = (int) scanner.nextDouble();



        int res1 = addition(sum1, sum2);
        System.out.println("Сложения = "+res1);

        int res2 = subtraction(sum1, sum2);
        System.out.println("Вычитания = "+res2);

        int res3 = multiplication(sum1, sum2);
        System.out.println("Умножения = "+res3);


        int res4 = division1 (sum1, sum2);
        System.out.println("Деления = "+res4);

        // 2. вариант
        division(sum1, sum2);


    }

    static int addition(int sum1, int sum2){
        int result = sum1 + sum2;
        return result;
    }
    static int subtraction(int sum1, int sum2){
        int result = sum1 - sum2;
        return result;
    }
    static int multiplication(int sum1, int sum2){
        int result = sum1 * sum2;
        return result;
    }
    static int division1(int sum1, int sum2){

        if(sum2 == 0){
         return Integer.MIN_VALUE; // возврашает минимальное значение
        }
        int result = sum1 / sum2;
        return result;
    }

    // 2. вариант -> чтобы было лучше результат
    public static void division(int sum1, int sum2) {
        if (sum2 != 0) {
            double result = (double) sum1 / sum2; // Приводим к double для точного деления
            System.out.println("Деление (2.вариант) = " + result);
        } else {
            System.out.println("Деление (2.вариант) = Деление на ноль невозможно.");
        }
    }

}
