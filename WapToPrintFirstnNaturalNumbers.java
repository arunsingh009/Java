package com.company.Java;
import java.util.Scanner;

public class WapToPrintFirstnNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Printing N natural Numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("Upper limit");
        int input = s.nextInt();
        int n=1;

        do{
            System.out.println(n);
            n++;
        }while(n<=input);


    }
}
