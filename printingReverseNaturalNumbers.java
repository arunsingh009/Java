package com.company.Java;
import java.util.Scanner;

public class printingReverseNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("We are printing Reverse natural number using for loop");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter upper Limit");
        int input = s.nextInt();
        int i=0;
        System.out.println("list of natural numbers");
        for (i=input;i>=0;i--){
            System.out.println(i);
        }
    }

}
