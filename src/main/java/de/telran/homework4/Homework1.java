package de.telran.homework4;

public class Homework1 {
    public static void main(String[] args) {

        // 1.
        // -> Переведите число 333 из 16-ричной в 10-ричную
        // -> Переведите число 819 из 10-ричной в 16-ричную
        // -> 101101 в двоичной, переведите в 10-ричную
        // -> 124 в десятичной, переведите в 2-ичную

        String hexNumber = "333";
        int decimalNumber = Integer.parseInt(hexNumber,16);
        System.out.println("Число 333 в 10-ричной системе: " + decimalNumber);

        int decimalNumber1 = 819;
        String hexNumber1 = Integer.toHexString(decimalNumber1);
        System.out.println("Число 819 в 16-ричной системе: " + hexNumber1);

        String binaryNumber2 = "101101";
        int decimalNumber2 = Integer.parseInt(binaryNumber2, 2);
        System.out.println("Число 101101 в 10-ричной системе: " + decimalNumber2);

        int decimalNumber3 = 124;
        String binaryNumber = Integer.toBinaryString(decimalNumber3);
        System.out.println("Число 124 в 2-ичной системе: " + binaryNumber);

    }
}
