package com.company.Java;
import java.util.Scanner;

public class CalcualteAvgmarksFromArray {
    public static void main(String[] args) {
        System.out.println("We are Calculating avg marks from array ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int i = s.nextInt();
        int[] marks = new int[i];
        int sum=0;
        float avg;

        for(int j=0;j<marks.length;j++){
            System.out.println("Enter marks of student "+j);
            marks[j]=s.nextInt();
        }
        System.out.println("Marks of students are ");
        for(int j=0;j<marks.length;j++){
            /* System.out.println("Enter marks of student "+i);
           mark=s.nextInt();*/
            System.out.print(marks[j]+",");
            sum = sum +marks[j];
        }
        System.out.print("\n");
        avg=(float)(sum*100)/(i*100);

        System.out.println("Avg of the marks is equal to : "+avg);





    }
}
