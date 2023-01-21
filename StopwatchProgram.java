package com.logical.java;

import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n1,n2;
        long start,end;
        double time;
        System.out.println("Type any number to start the stopwatch");

        char z=sc.next().charAt(0);
       // n1 = sc.nextInt();
        start=System.currentTimeMillis();
        System.out.println("Type any number to stop the stopwatch");

        char m=sc.next().charAt(0);
        //n2 = sc.nextInt();
        end=System.currentTimeMillis();
        time=(end-start)/1000.0;
        System.out.println(time);

    }
}
