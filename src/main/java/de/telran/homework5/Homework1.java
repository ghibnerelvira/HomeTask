package de.telran.homework5;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        // 1.
        // -> Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        // -> Числа могут быть, как целочисленные, так и дробные.
        // Например :
        // ввод : m=10.5, n=10.45
        // вывод: Число 10.45 ближе к 10.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (m): ");
        double m = scanner.nextDouble();

        System.out.print("Введите второе число (n): ");
        double n = scanner.nextDouble();

        // Вызываем метод для определения ближайшего числа и выводим результат
        double closestNumber = findClosestToTen(m, n);
        System.out.println("Ближайшее число к 10: " + closestNumber);
    }

    // Метод для определения ближайшего числа к 10
    public static double findClosestToTen(double m, double n) {
        double distanceToTenM = Math.abs(10 - m);
        double distanceToTenN = Math.abs(10 - n);

        if (distanceToTenM < distanceToTenN) {
            return m;
        } else if (distanceToTenN < distanceToTenM) {
            return n;
        } else {
            return m; // Если расстояния равны, можно вернуть любое из чисел
        }




    }
}
