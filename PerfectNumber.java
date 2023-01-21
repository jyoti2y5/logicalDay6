package com.logical.java;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0) {
                sum = sum + i;
            }
        }if(n==sum){
            System.out.println(n+" is perfect number.");
        }else
            System.out.println(n+" is not a perfect number");


    }
}
