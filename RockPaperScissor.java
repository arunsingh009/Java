package com.company.Java;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner s = new Scanner(System.in);
        //Taking Name From User
        System.out.println("Enter Your Name");
        String name = s.nextLine();
        System.out.println("We Welcome You " + name);
        //Printing Instructions
        System.out.println("""
                Instructions :\s
                 1.Press 1 for Rock.\s
                 2.Press 2 for Paper\s
                 3.Press 3 for Scissor\s
                 If Tie Both will get One Point""");
        int n = 0;
        while (n < 5) {

            int var = s.nextInt();
            System.out.println(name + " Selected : ");
            switch (var) {
                case 1 -> System.out.println("Rock");
                case 2 -> System.out.println("Paper");
                case 3 -> System.out.println("Scissor");
                default -> System.out.println("Invalid Option");
            }


            // Creating Random Choice For Computer
            Random r = new Random();
            int upperbound = 3;
            int random = r.nextInt(upperbound);
            System.out.println("Computer Selected");
            if (random == 0) {
                System.out.println("Rock");
            } else if (random == 1) {
                System.out.println("Paper");
            } else {
                System.out.println("Scissor");
            }
            String Result;

            if (random == 0 && var == 1 || random == 1 && var == 2 || random == 2 && var == 3) {
                Result = "Tie";
                System.out.println(Result);
            } else if (random == 0 && var == 2) {
                Result = name + " wins";
                System.out.println(Result);

            } else if (random == 0 && var == 3) {
                Result = "Computer Wins";
                System.out.println(Result);
            } else if (random == 1 && var == 1) {
                Result = "Computer Wins";
                System.out.println(Result);
            } else if (random == 1 && var == 3) {
                Result = name + " wins";
                System.out.println(Result);
            } else if (random == 2 && var == 2) {
                Result = "Computer Wins";
                System.out.println(Result);
            } else if (random == 2 && var == 1) {
                Result = name + " wins";
                System.out.println(Result);
            } else {
                Result = "Computer Wins";
                System.out.println(Result);
            }


            //Score prediction
            int i = 0;
            int j = 0;

            if (Result.equals("Tie")) {
                i++;
                j++;
            } else if (Result.equals("Computer Wins")) {
                j++;
            } else if (Result.equals(name + " wins")) {
                i++;
            }

            System.out.println(name + " score : " + i);
            System.out.println("Computer score : " + j);

            //Printing default Statement
            if (n < 4) {
                System.out.println("Make your Choice Again");

            }
            n++;


        }


    }
}
