package com.company.Java;
import java.util.Scanner;

public class printingFirstOddNumbers {
    public static void main(String[] args) {
        System.out.println("We are Printing First N odd numbers starting from 1");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Upper limit");
        System.out.println("List of Odd Numbers");
        int input = s.nextInt();
        int i;
        int n=0;
        for( i = 1;i<=input;i++){
            if(i%2==0){
                System.out.println(i);
                n++;
            }
        }
        System.out.println("Total odd numbers starting from 1 and "+input +" will be :" + n );


    }
}
