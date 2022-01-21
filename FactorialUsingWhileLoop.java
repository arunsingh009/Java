package com.company.Java;
import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        System.out.println("We Are printing factorial of number using while loop");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Number : ");

        int n;
        n = s.nextInt();
        int fact =1;
        while(n>=1){
            fact=n*fact;
            n--;
        }
        System.out.println(fact);

    }
}
