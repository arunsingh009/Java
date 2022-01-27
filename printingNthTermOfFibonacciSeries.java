package com.company.Java;
import java.util.Scanner;

public class printingNthTermOfFibonacciSeries {
    static void fib(int a){
        int n=0;
        int m=1;
        int o;
        int p=0;
        int q=0;
        while(p<a) {
            o = n + m;
//            System.out.print(o+",");
            q=o;
            n = m;
            m = o;
            p++;
        }
        System.out.println(q);
    }

    public static void main(String[] args) {
        System.out.println("We are nth term of fibonacci series  printing Fibonacci series : ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number for printing the value from sequence");
        int n=s.nextInt();
        System.out.println(n+"th term of fibonacci series will be : ");
        fib(n-2);

    }
    }

