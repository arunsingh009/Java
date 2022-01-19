package com.company.Java;
import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        System.out.println("We are finding the type of website by their Domain name try .com,.in,.gov etc directly");
        Scanner s = new Scanner(System.in);
        String var = s.nextLine();

        switch (var){
            case ".com":
                System.out.println("Commercial Website");
                break;
            case ".in":
                System.out.println("Indian Website");
                break;
            case ".org":
                System.out.println("Organisational Website");
                break;
            case ".gov":
                System.out.println("Government Website");
                break;
            default:
                System.out.println("Sorry! we don't have information about this domain");
        }

    }
}
