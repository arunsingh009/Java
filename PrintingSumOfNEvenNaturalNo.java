package com.company.Java;
import java.util.Scanner;

public class PrintingSumOfNEvenNaturalNo {
    public static void main(String[] args) {
        System.out.println("Printing sum of first n natural numbers using while loop");
        Scanner s = new Scanner(System.in);
        System.out.println("Give Upper Limit");
        int input = s.nextInt();
        int i=1;
        int n=0;
        int out = 0;
        System.out.println("Numbers are : ");
           while(n<input){
               if(i%2==0 && i<=input){
                   System.out.print(i+" ");
                   out = out +i;
               }
               i++;
               n++;
           }
        System.out.println(" ");
        System.out.println("Sum of first N natural even numbers is equal to "+out);


    }

}
