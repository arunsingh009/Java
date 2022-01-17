package com.company.Java;
import java.util.Scanner;

public class CheckingInteger {
    public static void main(String[] args) {
        System.out.println("We are checking here that number is Integer Or not");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        System.out.println(s.hasNextInt());
    }

}
