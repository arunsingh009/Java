package com.company.Java;
import java.util.Scanner;

public class SumOfNNumbersUsingFunction {
    static void sum(int a){
        int sum =0;
        for(int i=0;i<=a;i++){
            sum=sum+i;
        }
        System.out.println("Sum will be : "+sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter Upper Limit for printing sum of natural numbers :");
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        sum(n);

    }
}
