package com.company.Java;
import java.util.Scanner;

public class PrintingSumOfEvenNumbersUsingForLoop {
    public static void main(String[] args) {
        System.out.println("We are printing sum of even numbers using for loop");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Upper Limit : ");
        int input = s.nextInt();
        int sum =0;
        System.out.println("Numbers are :");

        for(int i = 1 ; i<=input;i++){
            if(i%2==0){
                System.out.print(i + " ");
                sum = sum +i;
            }
        }
        System.out.println(" ");
        System.out.println("Sum is equal to :"+sum);

    }
}
