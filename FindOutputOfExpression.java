package com.company.Java;
import java.util.Scanner;

public class FindOutputOfExpression {
    public static void main(String[] args) {
        System.out.println("we are here finding the output of given Expression");
        Scanner s = new Scanner(System.in);
        System.out.println("Given Expression is a=7/4*9/2");
        System.out.println("Enter your Answer");
        float a = s.nextFloat();

        float b = 7/4.0f * 9/2.0f; // yaha pe associativity ki wjh se ye left to right Evaluate karega
        System.out.println("Output Will be "+b);
    }
}
