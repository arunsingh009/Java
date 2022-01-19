package com.company.Java;
import java.util.Scanner;

public class usingSwitch {
    public static void main(String[] args) {
        System.out.println("try 1,2,3,4,5,6,7 to print Weekdays : ");
        Scanner s = new Scanner(System.in);
        int var = s.nextInt();

        switch (var) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter correct option");
        }


        }



    }
