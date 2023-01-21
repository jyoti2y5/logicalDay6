package com.logical.java;

public class FibonacciSeries {
    public static void main(String[] args) {
        // 20
        // 1 1 2 3 5 8 ....
        int l1 = 1;
        int l2 = 1;

        System.out.println(1);
        System.out.println(1);

        for (int i = 1; i <= 18; i++) {
            // sum of last two value
            int sum = l1 + l2;
            System.out.println(sum);

            // l1 with l2
            l1 = l2;

            // l2 with l1 + l2
            l2 = sum;
        }
    }
}