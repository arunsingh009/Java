package com.company.Java;
import java.util.Scanner;

public class WapToPrintNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("We are printing 100 Natural Numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("Give lower Limit : ");
        int lower = s.nextInt();
        System.out.println("Give Upper Limit : ");
        int upper = s.nextInt();

        while(lower<=upper){
            System.out.println(lower++);
        }

    }
}
