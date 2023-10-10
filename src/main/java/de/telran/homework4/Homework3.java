package de.telran.homework4;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        // 1.
        // -> Программа запрашивает у пользователя сумму в Евро для конвертации
        // -> Реализовать метод, который конвертирует полученную сумму в сумму в долларах США

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в евро: € ");
        double amountInEuro = scanner.nextDouble();

        // Задаем фиксированный курс обмена
        double exchangeRate = 1.19; // Пример: 1 евро = 1.19 доллара

        // Вызываем метод для конвертации и выводим результат
        double amountInUSD = convertToUSD(amountInEuro, exchangeRate);
        System.out.println("Сумма в долларах США: $ " + amountInUSD);
    }

    // Метод для конвертации суммы из евро в доллары
    public static double convertToUSD(double amountInEuro, double exchangeRate) {
        return amountInEuro * exchangeRate;
    }
}
