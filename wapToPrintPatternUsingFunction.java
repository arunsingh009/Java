package com.company.Java;
import java.util.Scanner;
public class wapToPrintPatternUsingFunction {
    static void pattern(int a){
       for(int i=1;i<=a;i++){
           for(int j=a;j>=i;j--){
               System.out.print("* ");
           }
           System.out.print("\n");
       }
    }

    public static void main(String[] args) {
        System.out.println("We are printing pattern using function");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter height of pattern : ");
        int n = s.nextInt();
        System.out.println("patter for height "+n+ " Will be : ");
        pattern(n);
    }
}
