package com.company.Java;
import java.util.Scanner;

public class RecursiveFunctionForCalculationSumOfFirstNaturalNumbers {
    static int sum(int a){
        int sol=0;
        if(a>0) {
            sol = a + sum(a - 1);

        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.println("We are printing sum of Natural Numbers : ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Upper limit : ");
        int n = s.nextInt();
        System.out.println("Sum will be equal to : " + sum(n));


    }
}
