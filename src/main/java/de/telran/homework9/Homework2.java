package de.telran.homework9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework2 {

    // 2.
    // Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
    // 1) Берем исходную строку с данными из cars
    // {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "city", "Berlin", "year", null, "active", true}
    // -> Если значение второго параметра равно null с каждой пары, то параметр не должен попадать
    // в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
    // -> Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
    // Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';

    public static void main(String[] args) {
        String[] data = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "city", "Berlin", "year", null, "active", String.valueOf(true)};
        StringBuilder queryBuilder = new StringBuilder("SELECT * FROM cars WHERE ");

        Set<String> usedKeys = new HashSet<>(); // Для отслеживания уже использованных ключей

        for (int i = 0; i < data.length; i += 2) {
            String key = data[i];
            String value = data[i + 1];

            // Проверяем, что значение не равно null и ключ не был использован ранее
            if (value != null && !usedKeys.contains(key)) {
                if (value instanceof String) {
                    // Если значение - строка, заключаем его в одинарные кавычки
                    queryBuilder.append(key).append(" = '").append(value).append("' AND ");
                } else {
                    // Значение не является строкой (например, числом или булевым), не заключаем в кавычки
                    queryBuilder.append(key).append(" = ").append(value).append(" AND ");
                }

                usedKeys.add(key); // Помечаем ключ как использованный
            }
        }

        // Удаляем последний "AND" из запроса
        int length = queryBuilder.length();
        if (length >= 5) {
            queryBuilder.delete(length - 5, length);
        }

        System.out.println(queryBuilder.toString());
    }

}
