package de.telran.homework1;

import javax.swing.*;

public class Homework1 {

    // 1.
    // В методе main инициализировать все примитивные типы.
    // -> Вывести их результат в консоль:
    //char: G
    //int: 89
    //byte: 4
    //short: 56
    //float: 4.7333436
    //double: 4.355453532
    //long: 12121

    public static void main(String[] args) {

        System.out.println();
        System.out.println(1+". Задача");

        char myChar = 'G';
        System.out.println("char: " +myChar);

        int myInt;
        myInt = 89;
        System.out.println("int: " +myInt);

        byte myByte = 4;
        System.out.println("byte: " +myByte);

        short myShort = 56;
        System.out.println("short: "+myShort);

        float myFloat = 4.7333436F;
        System.out.println("float: "+myFloat);

        double myDouble = 4.355453532;
        System.out.println("double: "+myDouble);

        long myLong = 12121;
        System.out.println("long: "+myLong);


        // 2.
        // Дано трехзначное число. -> Вывести на экран все цифры этого числа
        //Пример: 345
        //Вывод в консоль: Число 345 -> 3, 4, 5

        System.out.println();
        System.out.println(2+". Задача");

        char c1='3', c2='4', c3='5';
        System.out.println("345 -> "+(c1+", ")+(c2+", ")+(c3));

    }
}
