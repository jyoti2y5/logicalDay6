package com.logical.java;

public class ReverseNumber {
    public static void main(String[] args){
        int num=12345;
        int reverse=0;
        while(num!=0) {
             int temp = num%10;
              reverse = reverse*10+temp;
              num/=10;
        }
        System.out.println(("Revresed no:"+reverse));


    }

}
