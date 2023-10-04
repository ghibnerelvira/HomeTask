package de.telran.homework2;

public class Homework2 {

        //2.
        // Создать методы с математическими операциями +, -, *, /
        // -> Каждый метод принимает два числа в параметрах и возвращает результат
        // -> Вызовать все методы в main
        // -> Результат распечатайте в консоль

        // Метод сложения
        public static double add(double a, double b) {
            return a + b;
        }

        // Метод вычитания
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Метод умножения
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Метод деления
        public static double divide(double a, double b) {
            // Проверка деления на ноль
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Ошибка: деление на ноль.");
                return Double.NaN; // Возврат NaN (Not a Number) в случае ошибки
            }
        }

        public static void main(String[] args) {
            // Примеры использования методов
            double num1 = 10;
            double num2 = 5;
            System.out.println();
            System.out.println(2+". Задача");

            System.out.println("Сложение: " + add(num1, num2));
            System.out.println("Вычитание: " + subtract(num1, num2));
            System.out.println("Умножение: " + multiply(num1, num2));
            System.out.println("Деление: " + divide(num1, num2));
        }


}
