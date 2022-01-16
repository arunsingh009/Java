package com.company.Java;
import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        System.out.println("We are going to add three numbers here");
        Scanner s = new Scanner(System.in); // scanner ka method banaya hai

        //taking Input
        System.out.println("Enter first number");
        byte a = s.nextByte();
        System.out.println("Enter Second number");
        byte b = s.nextByte();
        System.out.println("Enter Third number");
        byte c = s.nextByte();

        int sum = a+b+c;
        System.out.println("Sum of three Numbers will be " + sum);






    }
}
