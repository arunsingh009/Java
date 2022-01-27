package com.company.Java;
import java.util.Scanner;

public class PrintingPatternUsingRecursion {
    static void pattern(int a){
       if(a>0){
           for(int i =a;i>0;i--){
               System.out.print("* ");
           }
           System.out.println();
           pattern(a-1);
       }

    }

    public static void main(String[] args) {
        System.out.print("We are Printing : xxxx\nxxx\nxx\nxx\nx ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number for height of tree : ");
        int n = s.nextInt();
        pattern(n);
    }
}
