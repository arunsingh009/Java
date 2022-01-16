package com.company.Java;
import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        System.out.println("Welcoming our User");

        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String a = s.nextLine();
        System.out.println("Hello "+a+" Welcome Back");
    }
}
