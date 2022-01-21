package com.company.Java;
import java.util.Scanner;

public class PrintingPatternUsingLoop {
    public static void main(String[] args) {
        System.out.print("We have to print the following pattern \nxxxxx\nxxxx\nxxx\nxx\nx\n");
        Scanner s =new Scanner(System.in);
        System.out.println("Enter No for Height of Patten");
        int n = s.nextInt();

        int m =1;

        while(m<=n){
            int j=n;
            while( j>=m){
                System.out.print("*");
                j--;
            }
            System.out.print("\n");
            m++;
        }
    }
}
