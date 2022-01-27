package com.company.Java;

import java.util.Scanner;

public class PrintingPatternUsingRecursionMethod {
        static void pattern(int a){
            if(a>0){
                pattern(a-1);
                for(int i =a;i>0;i--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {
            System.out.print("We are Printing : \nx\nxx\nxxx\nxxxx\nxxxxx\n ");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Number for height of tree : ");
            int n = s.nextInt();
            pattern(n);
        }
    }

