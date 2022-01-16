package com.company.Java;
import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        System.out.println("We are going to calculate cgpa from three subjects");

        Scanner s = new Scanner(System.in);
        System.out.println("Marks in First subject");
        int a = s.nextInt();
        System.out.println("Marks in First subject");
        int b = s.nextInt();
        System.out.println("Marks in First subject");
        int c = s.nextInt();

        float percentage = ((a+b+c)*100)/300;
        float cgpa = percentage/9.5f;

        System.out.println("CGPA of Student will be " + cgpa);

    }
}
