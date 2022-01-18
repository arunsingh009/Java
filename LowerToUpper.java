package com.company.Java;
import java.util.Locale;
import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        System.out.println("Here we are converting string from lower case to Upper case");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string in lowercase");
        String name = s.nextLine();

        String upper = name.toUpperCase();
        System.out.println("String in upper case will be : " + upper);

    }
}
