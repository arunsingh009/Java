package com.company.Java;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("We are converting km into miles");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Kilometre you want to Convert Into Miles");
        int a = s.nextInt();
        float b = a*0.621371f;
        System.out.println(a+" km after conversion will become "+b+" miles");
    }
}
