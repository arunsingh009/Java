package com.company.Java;
import java.util.Scanner;

public class writingExpression {
    public static void main(String[] args) {
        System.out.println("In this we are writing Third Equation of motion in Java");
        System.out.println("Expression : v^2-u^2 / 2*a*s");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of v");
        float a = s.nextFloat();
        System.out.println("Enter value of u");
        float b = s.nextFloat();
        System.out.println("Enter value of a");
        float c = s.nextFloat();
        System.out.println("Enter value of s");
        float d = s.nextFloat();

        float output = ((a*a)-(b*b))/(2*c*d);
        System.out.println("Output will be : " + output);


    }
}
