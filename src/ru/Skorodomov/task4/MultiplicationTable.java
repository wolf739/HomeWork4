package ru.Skorodomov.task4;

public class MultiplicationTable {
    public static void main (String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int num : nums) {
            for (int num2 : nums) {
                System.out.printf("%4d", + (num * num2));
            }
            System.out.println();

        }
    }
}
