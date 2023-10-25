package de.telran.homework8;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    // 2.
    // Создайте массив из 5 случайных целых чисел из интервала [10;99]
    // Выведите его на консоль в строку.
    // Определите и выведите на экран сообщение о том, является ли массив строго
    // возрастающей последовательностью (1,2,3,4,5...)
    // не строго возрастающей последовательностью (22, 35, 50, 60..)
    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(90) + 10; // интервала [10;99]
        }
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));


        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println("Создаем копию массива:  "+Arrays.toString(arrayCopy));

        Arrays.sort(arrayCopy);
        System.out.println("Сортируем копию массива:  "+Arrays.toString(arrayCopy));

        // Проверяем, является ли копия массива строго возрастающей последовательностью.
        boolean isIncreasing = Arrays.equals(array, arrayCopy);

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }


    }
}
