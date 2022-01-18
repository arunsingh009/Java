package com.company.Java;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        System.out.println("We are Calculating Income Tax paid by Employee");

       Scanner s = new Scanner(System.in);
       double income = s.nextDouble();
       double amount;

       if(income<250000){
           System.out.println("You don't have to pay taxes");
       }else if(income>250000 && income<500000){
           System.out.println("Tax which will be paid is 5% ");
           amount = (income*5)/100d;
           System.out.println("Amount to be paid will be : "+amount);
       }else if(income>500000 && income<1000000){
           System.out.println("Tax which will be paid is 20%");
           amount = (income*20)/100d;
           System.out.println("Amount to be paid will be : "+amount);
       }else{
            System.out.println("Tax which will be paid is 30%");
            amount = (income*30)/100d;
            System.out.println("Amount to be paid will be : "+amount);
        }
    }
}
