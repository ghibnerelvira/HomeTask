package de.telran.homework7;

import java.util.Scanner;

public class Homework1 {
    // 1.
    // Представим, что у нас есть устройство, в котором две колбы.
    // Прибор работает корректно, если температура первой колбы выше 100 градусов,
    // а температура второй колбы меньше 100 градусов.
    // -> Вы должны написать метод, который проверяет это устройство.
    // -> Ваша программа должна иметь переменные temperature1 и temperature2.
    // -> В результате метод возвращает true или false.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру первой колбы: ");
        int temperature1 = scanner.nextInt();
        System.out.print("Введите температуру второй колбы: ");
        int temperature2 = scanner.nextInt();
        scanner.close();

        boolean isWorking = isDeviceWorking(temperature1, temperature2);

        if (isWorking) {
            System.out.println("Устройство работает корректно. -> " + isWorking);
        } else {
            System.out.println("Устройство не работает корректно. -> "+isWorking);
        }

    }
    public static boolean isDeviceWorking(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }

}
