package com.company.Java;
import java.util.Scanner;

public class ProgramToCalculateSumOfTable {
    public static void main(String[] args) {
        System.out.println("We are printing sum of table of given no : ");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number :");
        int n = s.nextInt();
        int m=1;
        int sum = 0;

        while(m<=10){
            sum = sum + (n*m);
            m++;
        }
        System.out.println("Sum is equal to : " + sum);


    }
}
