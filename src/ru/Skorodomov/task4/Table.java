package ru.Skorodomov.task4;

import java.util.Scanner;

public class Table{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        while (true) {
            if (scan.hasNextDouble()) {
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                double result = (a < b) ? a : b;
                System.out.println(" Число " + result + " является наименьшим числом ");
                return;
            } else {
                System.out.println("Вы ввели число c недопустимыми знаками");
                scan.next();
            }
        }
    }
}
