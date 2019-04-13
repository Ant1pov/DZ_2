package DZ_2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Culkul {
    private static final String ROOT_ONE = " x1: ";
    private static final String ROOT_TWO = " x2: ";
    private static final String NO_RESULTS = "No results";

    public String viet(int a, int b, int c) {
        System.out.println("Теорема Виета");
        int first = b / a;
        int second = c / a;
        int n1 = 1;
        int n2 = 1;

        if (second < 0) {
            n1 = -1;
        } else if ((second > 0) && (first > 0)) {
            n1 = -1;
            n2 = -1;
        }

        second = Math.abs(second);

        double[] results = getAllVariables(second);

        int length = 0;
        double x1;
        double x2;
        while (length < results.length) {
            double variable = results[length];
            x1 = variable * n1;
            x2 = second / variable * n2;
            if (x1 + x2 == -first) {
                return ROOT_ONE + x1 + ROOT_TWO + x2;
            }
            length++;

        }
        return NO_RESULTS;
    }

    private double[] getAllVariables(final int numbersLimit) {
        double[] result = new double[numbersLimit];

        int limit = (int) Math.sqrt(numbersLimit);

        for (int firstIndex = 1; firstIndex <= limit; firstIndex++) {
            if (numbersLimit % firstIndex == 0) {
                if (numbersLimit / firstIndex != firstIndex) {
                    result[firstIndex] = numbersLimit / (double) firstIndex;
                }
                result[firstIndex] = firstIndex;
            }
        }
        return result;
    }


    public void fibo() {
        System.out.println("Числа фибоначи: ");
        int n1 = 0;
        int n2 = 1;
        int k;
        System.out.print(n1 + " " + n2 + " ");
        for (int z = 1; z <= 10; z++) {
            k = n1 + n2;
            System.out.print(k + " ");
            n1 = n2;
            n2 = k;
        }
    }

    public void tabl() {
        {
            System.out.println("Таблица умножения: ");
        }
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                int first = a * b;
                System.out.printf("%5d", first);
            }
            System.out.println();
        }
    }

    public void elka1() {
        System.out.println("Ёлка из звезд: ");
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void elka2() {
        System.out.println("Елка из звезд 2: ");
        for (int a = 0; a < 6; a++) {
            for (int b = 5; b >= a; b--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void vremya(int hour) {
        System.out.println("Время суток:");
        if (hour >= 22 && hour <= 24) {
        } else if (hour >= 4 && hour <= 11) {
            System.out.println("Доброе утро");
        } else if (hour >= 12 && hour <= 18) {
            System.out.println("Добрый день");
        } else if (hour >= 19 && hour <= 21) {
            System.out.println("Добрый вечер");
        } else if (hour >= 22 && hour <= 3) {
            System.out.println("доброй ночи");
        } else {
            System.out.println("Нет такого времени");
        }
    }

    public void bilet() {
        System.out.println("Лотырейний билет");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое число: ");
        int randomNumber = (int) (Math.random() * 20);
        boolean ura = true;
        while (ura) {
            int number = scanner.nextInt();
            if (number == randomNumber) {
                ura = false;
                System.out.println("Ты выграл!");
            } else {
                System.out.println("Попробуй еще...");
            }
        }
    }

    public void chisla1(int first, int second) {
        System.out.println("Все нечетные числа:");
        do {
            if (first % 2 != 0) {
                System.out.println(first + " ");
            }
            first++;
        }
        while (first < second);
    }

    public void chisla2(int first, int second) {
        System.out.println("Все четные числа:");
        do {
            if (first % 2 == 0) {
                System.out.println(first + " ");
            }
            first++;
        }
        while (first < second);
    }
}






