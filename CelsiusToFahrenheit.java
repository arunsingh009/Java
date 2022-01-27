package com.company.Java;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    static void far(int a){
        float fahr;
        fahr = ((float)a*9/5)+32;
        System.out.println("Temperature in fahrenheit will be : "+fahr);
    }

    public static void main(String[] args) {
        System.out.println("Enter Temperature in celsius : ");
        Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       far(n);

    }
}
