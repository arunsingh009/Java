package com.company.Java;
import java.util.Scanner;

public class EncryptAndDecryptGrade {
    public static void main(String[] args) {
        System.out.println("Here We are encrypting our Grade and after that Decrypting Our Grade");
        Scanner s = new Scanner(System.in);
        // for grades
        //encrypting
        /*
        char grade = 'A';
        grade = (char)(grade+8);
        System.out.println(grade);
        //decrypting
        grade = (char)(grade-8);
        System.out.println(grade);
        */
        // For marks in number
        System.out.println("Enter Your Marks for encyption");
        int a = s.nextInt();
        a = a+8;
        System.out.println("Encrypted Marks " + a);
        //decryption
        System.out.println("Enter key For Decryption");
        int p = s.nextInt();
        if (p == 0){
            a=a-8;
            System.out.println("Original Marks " + a);
        }else{
            System.out.println("wrong password");
        }






    }
}
