package com.company.Java;
import java.util.Scanner;

public class factorialUsingRecursion {
    static int fact(int a){
        int fa=1;
        if(a==0||a==1){
             return fa;
        }else {
            for(int i=1;i<=a;i++) {
                fa = i * fact(a - 1);
            }
        }
        return fa;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("We are printing factorial of number using recursion : ");
        System.out.println("Enter no For which you are finding recursion");
        int n=s.nextInt();
        System.out.println("Factorial of "+n+" is :"+fact(n));
    }
}
