package com.company.Java;
import java.util.Scanner;

public class printingTable {
    public static void main(String[] args) {
        System.out.println("We are Printing table of given number");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int input = s.nextInt();
        int out;
        int n = 1;
        while(n<=10){
            out = (input*n);
            System.out.println(input+" * " +n+" = "+out);
            n++;
        }
    }
}
