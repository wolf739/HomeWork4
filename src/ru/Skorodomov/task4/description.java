package ru.Skorodomov.task4;

import java.util.Scanner;

public class description {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        while (true) {
            if (scan.hasNextInt()) {
                int numb = scan.nextInt();
                String ver1, ver2;
                ver1 = (numb > 0) ? " положительное " : " отрицательное ";
                ver2 = (numb % 2 == 0) ? " четное " : " нечетное ";
                System.out.println("число " + numb + ver1 + ver2);
                break;
            }
            else {
                System.out.println("введите целое число");
                scan.next();
            }

        }
    }
}
