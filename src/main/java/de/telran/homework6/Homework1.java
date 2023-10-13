package de.telran.homework6;

import java.time.LocalTime;

public class Homework1 {
    public static void main(String[] args) {

        // 1.
        // -> Создайте две переменные isEdekaOpen и isReweOpen,
        // значения которых зависят от того, открыты магазины или нет.
        // -> Реализует логический метод canBuy,  возвращающий boolean
        // -> Значение этой переменной должно быть true, если хотя бы
        // один магазин открыт, иначе false.
        // -> Отобразите строку «Я могу купить еду, это ……» и значение.
        // От себяб я ещё добавила время роботы -> время считается в ностояшие время

        // две переменные -> isEdekaOpen и isReweOpen определяются как true, если магазины открыты, иначе false.
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        // Укажем время работы магазинов
        LocalTime openingTime = LocalTime.of(9, 0); // Например, 9:00 утра
        LocalTime closingTime = LocalTime.of(18, 0); // Например, 6:00 вечера

        // Получим текущее время
        LocalTime currentTime = LocalTime.now();

        // Проверим, открыт ли магазин в текущее время
        boolean isOpen = isStoreOpen(currentTime, openingTime, closingTime);

        // логический метод,  возвращающий boolean
        boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это -> "+canBuy);

        // результат
        System.out.println("Магазин открыт: " + isOpen);

    }

    private static boolean canBuyFood (boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen; // Возвращаем true, если хотя бы один из магазинов открыт

    }
    // Метод для проверки, открыт ли магазин в заданное время
    private static boolean isStoreOpen(LocalTime currentTime, LocalTime openingTime, LocalTime closingTime) {
        return (!currentTime.isBefore(openingTime)) && (!currentTime.isAfter(closingTime));
    }
}
