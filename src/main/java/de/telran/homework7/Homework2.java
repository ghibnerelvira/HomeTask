package de.telran.homework7;

import javax.imageio.stream.ImageInputStream;

public class Homework2 {
    // 2.
    // У вас на банковском счету N долларов.
    // Вы хотите снять все, но банк разрешает снять только сумму, которая является
    // делителем текущей суммы на счету и меньше текущей суммы.
    // Если вы снимаете максимально возможную сумму каждый день, сколько дней
    // вам понадобится, чтобы забрать все свои деньги из банка?
    // -> Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
    // Ввод:  N = 21
    // Выход:  7
    // Объяснение:  N = 21
    // Снято 7, осталось = 14
    // Снято 7, осталось = 7
    // Снято 1, осталось = 6
    // Снято 3, осталось = 3
    // Снято 1, осталось = 2
    // Снято 1, Осталось = 1
    // Снято 1, осталось = 0

    public static void main(String[] args) {
        int N = 21;
        int days = daysToWithdrawAll(N);
        System.out.println("Для снятия всех денег потребуется " + days + " дней.");


    }

    public static int daysToWithdrawAll(int N) {
        int days = 0;

        while (N > 0) {
            int maxWithdrawal = 1;

            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    maxWithdrawal = i;
                    break;
                }
            }

            N -= maxWithdrawal;
            days++;
        }

        return days;
    }
}
