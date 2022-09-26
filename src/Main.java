public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");

        int deposit = 15_000;
        int sum = 0;
        int month = 1;
        while (sum < 2_459_000) {
            sum += deposit + sum * 0.01;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            month++;
        }

        // Задание 2
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        float birth = (float) 17 / 1000;
        float death = (float) 8 / 1000;
        for (; i < 11; i++) {
            population = population + Math.round(population * birth) - Math.round(population * death);
            System.out.println("Год - " + i + " Население: " + population);
        }

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1
        System.out.println("Задание 1");

        int Month = 1;
        int Deposit = 15_000;
        while (Deposit < 12_000_000) {
            Deposit += Deposit * 0.07;
            System.out.println("Месяц " + Month + " , сумма накоплений равна " + Deposit + " рублей");
            Month++;
        }
// Задание 2
        System.out.println("Задание 2");
        int months = 1;
        int deposits = 15_000;
        while (deposits < 12_000_000) {
            deposits += deposits * 0.07;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " , сумма накоплений равна " + deposits + " рублей");

            }
            months++;
        }
// Задание 3
        System.out.println("Задание 3");
        int monthes = 1;
        int deposites = 15_000;
        while (monthes <= 9 * 12) {
            deposites += deposites * 0.07;
            if (monthes % 6 == 0) {
                System.out.println("Месяц " + monthes + " , сумма накоплений равна " + deposites + " рублей");
            }
            monthes++;
        }

        // Задание 3
        System.out.println("Задание 3");
        int lastDayInMonth = 31;
        int friday = 2;
        while (friday <= lastDayInMonth) {
            System.out.println("Сегодня пятница: " + friday);
            friday += 7;
        }
// Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1
        System.out.println("Задание 1");

        int currentYear = 2022;
        int starPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        for (int i = starPeriod; i <= endPeriod; i++) {
            if (i % 79 == 0) {
                System.out.println("i");
            }
            // Задание 2
            System.out.println("Задание 2");
            for (int i = 1; i<= 10; i++) {
                System.out.println("2*" + i + " = " + 2 * i);
            }
        }

    }
}