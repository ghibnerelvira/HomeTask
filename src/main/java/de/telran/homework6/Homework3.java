package de.telran.homework6;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        // 3. Реализуйте программу, которая попросит пользователя
        // ввести три целых числа (используйте сканер).
        // -> Напишите метод getMax, который принимает эти 3 параметра
        // и возвращает наибольший из них.
        // -> Напечатает максимум из трех чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа: ");

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int maxNumber= getMax(num1, num2, num3);

        System.out.println("Максимальное число: " + maxNumber);
        scanner.close();


    }

    public static int getMax(int a, int b, int c){
      int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;

    }
}

// 2. Вариант
//        main
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите три целых числа:");
//
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//
//
//        System.out.println("Максимальное число: " + getMax(num1, num2, num3));
//        scanner.close();
//    }
//
//        public static int getMax(int a, int b, int c) {
//          return Math.max(Math.max(a, b), c);
//     }
