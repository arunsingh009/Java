package com.company.Java;
import java.util.Scanner;

public class SpaceDetector {
    public static void main(String[] args) {
        System.out.println("Here we are detecting double and triple space from string");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        System.out.println(input.indexOf("  "));
        System.out.println(input.indexOf("   "));
    }
}
