package com.logical.java;

import java.util.Scanner;

public class DistinctCoupon {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // isCollected[i] = true if card i has been collected
        boolean[] isCollected = new boolean[n];

        int count = 0;
        int distinct = 0;


        while (distinct < n) {
            int value = (int) (Math.random() * n);
            count++;
            // we collected one more card
            System.out.println(value);
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }

        // print the total number of cards collected
        System.out.println(count);
    }
}
