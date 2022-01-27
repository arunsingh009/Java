package com.company.Java;
import java.util.Scanner;

public class TableUsingMethod {
    static void table(int a){
        int out=0;
        for(int i=1;i<=10;i++){
            out = a*i;
            System.out.println(a+"*"+i+"="+out);
        }

    }
    public static void main(String[] args) {
        System.out.println("We are getting table of particular number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        table(n);


    }


}
