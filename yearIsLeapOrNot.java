package com.company.Java;
import  java.util.Scanner;

public class yearIsLeapOrNot {
    public static void main(String[] args) {
        System.out.println("We are checking that Year is leap or not");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = s.nextInt();

        if(year%400 == 0 || year%100==0 || year%4==0){
            System.out.println(year+" is leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
}
