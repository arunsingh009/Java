package com.company.Java;
import java.util.Scanner;

public class PrintingPatternUsingPattern {
    static void pattern(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("We are printing pattern here using function");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);

    }
}
