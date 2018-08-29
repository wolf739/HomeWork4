package ru.Skorodomov.task4;

import java.util.Scanner;

public class progression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Введите коэффициент прогрессии, для выхода введите ноль");
            if (scan.hasNextInt()) {
                if (scan.hasNextInt()) {
                    int coefficient = scan.nextInt();
                    if (coefficient == 0) {
                        System.out.println("Работа прекращена");
                        break;
                    }
                    System.out.println("Введите кол-во элементов прогрессии");
                    int count = scan.nextInt();
                    int num1 = 1;
                    int N = num1 + (count) * coefficient;
                    int[] g = new int[count];
                    int count2 = 0;
                    for (int i = 1; i < N; i = i + coefficient) {
                        g[count2] = i;
                        System.out.print(g[count2] + " ");
                        System.out.println();
                    }
                } else {
                    System.out.println("Вы ввели символ");
                    scan.next();
                }
            } else {
                System.out.println("Вы ввели символ");
                scan.next();
            }
        }
        while (true);
    }


}

