package com.company.Java;
import java.util.Scanner;

public class greetMessage {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("\" Dear " + name + ", Thanks a lot!\" ");

    }
}

