package com.company.Java;
import java.util.Scanner;

public class FindingIntegerInArray {
    public static void main(String[] args) {
        System.out.println("In this we are checking that integer is present in array or not");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Integer You are looking for");
        int in = s.nextInt();
        int n = 0;
        String a = "d";
        String b;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (n < arr.length) {
            if (in == arr[n]) {
                a="yes";

            } else {
               b="no";
            }
            n++;
        }
        if(a =="yes") {
            System.out.println("Entered no is present in array");
        }else{
            System.out.println("Entered no is not present in array");
        }
    }
}






