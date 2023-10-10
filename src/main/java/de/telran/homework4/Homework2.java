package de.telran.homework4;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        // 1.
        // -> Напишите программу, которая вычисляет, сколько лишних калорий будет,
        // если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
        // -> Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите диаметр первой пиццы (в см): ");
        double diameter1 = scanner.nextDouble();

        System.out.print("Введите диаметр второй пиццы (в см): ");
        double diameter2 = scanner.nextDouble();

        System.out.print("Введите количество калорий на единицу площади (ккал/см²): ");
        double caloriesPerSquareCm = scanner.nextDouble();

        // Вычисляем площади пицц
        double area1 = calculatePizzaArea(diameter1);
        double area2 = calculatePizzaArea(diameter2);

        // Вычисляем количество лишних калорий
        double extraCalories = Math.abs(area2 - area1) * caloriesPerSquareCm;

        System.out.println("Количество лишних калорий: " + extraCalories);
    }

    // Метод для вычисления площади пиццы по диаметру
    public static double calculatePizzaArea(double diameter) {
        double radius = diameter / 2;
        return Math.PI * Math.pow(radius, 2); // площадь круга (π * r²).


    }
}
