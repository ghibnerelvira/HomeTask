package de.telran.homework6;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static java.time.Year.isLeap;

public class Homework2 {
    public static void main(String[] args) {

        // 2. Реализуйте программу, которая попросит пользователя ввести год
        // и напечатать этот год. Метод (isLeap()) проверяет високосный год или нет.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int getYear = scanner.nextInt();

        System.out.println("Введенный год: " + getYear); // потвержденниеб для пользователя что он ввел правельно

        if (isLeap(getYear)){
            System.out.println(getYear+" - високосный год.");
        } else {
            System.out.println(getYear+" - не високосный год.");
        }


    }
}
