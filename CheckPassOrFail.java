package com.company.Java;
import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckPassOrFail {
    public static void main(String[] args) {
        System.out.println("We are Checking student is pass or not. Note:33% marks is compulsory to pass the subject");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks(3 subjects)");
        float first = s.nextFloat();
        float second = s.nextFloat();
        float third = s.nextFloat();
        float sum = ( first+second+third);

        float percentage =  ((sum/300)*100.0f);

        if (first>33 && second>33 && third>33 && percentage>=40.0){
            System.out.printf("Student has passed his test with %.2f",percentage );
            System.out.println("% marks");
        }else{
            System.out.printf("Failed the test with %.2f",percentage);
            System.out.println("% marks");
        }
    }
}
