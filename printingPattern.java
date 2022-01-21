package com.company.Java;
import  java.util.Scanner;

public class printingPattern {
    public static void main(String[] args) {
        System.out.print("We have to print the following pattern \nxxxxx\nxxxx\nxxx\nxx\nx\n");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number for Height of pattern");
        int input = s.nextInt();
//        System.out.println(input);
        int i;
        int j;
        for(i=input;i>0;i--){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
