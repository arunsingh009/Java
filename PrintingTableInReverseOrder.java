package com.company.Java;
import java.util.Scanner;

public class PrintingTableInReverseOrder {
    public static void main(String[] args) {
        System.out.println("We are Printing table of given number");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int input = s.nextInt();
        int out;
        int n = 10;
        do{
            out = (input*n);
            System.out.println(input+" * " +n+" = "+out);
            n--;
        }while(n>=1);

    }
}
