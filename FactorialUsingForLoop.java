package com.company.Java;
import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        System.out.println("We are printing Factorial using For loop");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter YOur number");
        int input = s.nextInt();
        int fact = 1;
        for(int i = input; i >=1;i--){
          fact = i*fact;
        }
        System.out.println("Factorial of given number will be " + fact);
//


    }
}
