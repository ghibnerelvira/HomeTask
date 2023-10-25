package de.telran.homework9;

public class Homework1 {
    // 1.
    // Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
    // input:
    // arr1[] = {1,2,3,5}
    // out: 4

    //arr2[] = {6,1,2,8,3,4,7,10,5}
    //out: 9

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5};
        int missingElement1 = findMissingElement(arr1);
        System.out.println("Недостающий элемент в первом массиве: " + missingElement1);

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int missingElement2 = findMissingElement(arr2);
        System.out.println("Недостающий элемент во втором массиве: " + missingElement2);

    }
    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1; // Размер массива должен быть n-1, поэтому добавляем 1 для полного размера n.
        int totalSum = (n * (n + 1)) / 2; // Сумма первых n натуральных чисел.

        int sumOfArray = 0;
        for (int num : arr) {
            sumOfArray += num;
        }

        return totalSum - sumOfArray;
    }
}
