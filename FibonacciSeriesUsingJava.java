package com.company.Java;

import java.util.Scanner;

public class FibonacciSeriesUsingJava {
    static void fib(int a){
        int n=0;
        int m=1;
        int o;
        for(int i=2;i<a;++i){
           o=n+m;
           System.out.print(","+o);
           n=m;
           m=o;
        }

    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("We are printing Fibonacci Series of particular number given by user : ");
        System.out.println("Enter number up to you want sequence :");
        int n= s.nextInt();
        System.out.println("Sequence Will be : ");
        System.out.print(0+","+1);
        fib(n);
    }

}
