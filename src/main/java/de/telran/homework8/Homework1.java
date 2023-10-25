package de.telran.homework8;

import java.util.Random;

public class Homework1 {
    // 1.
    // Создайте массив из 8 случайных целых чисел из интервала [1;50]
    // Выведите массив на консоль в строку.
    // Замените каждый элемент с нечетным индексом на ноль.
    // Снова выведете массив на консоль в отдельной строке.
    public static void main(String[] args) {

        int[] numbers = new int[8];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
        }

        // Вывод исходного массива на консоль
        System.out.print("Исходный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Замена каждого элемента с нечетным индексом на ноль
        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }

        // Вывод измененного массива на консоль
        System.out.print("Массив с нулями на нечетных индексах: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
