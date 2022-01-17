package com.company.Java;
import java.util.Scanner;
public class ComparisonOperator {
    public static void main(String[] args) {
        System.out.println("We are comparing user number with predefined number");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number between 1 to 10");
        byte a = 6;
        byte b = s.nextByte();
        if(b>a || b<a){
            System.out.println("Number is smaller/grater than the predefined Number");
        }else if(a==b){
            System.out.println("Number is equal to the given number");
        }
    }
}
