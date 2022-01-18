package com.company.Java;
import java.util.Scanner;

public class replacing {
    public static void main(String[] args) {
        System.out.println("Here we are replacing space  with underscore");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence with spaces");
        String inputs = s.nextLine();

        System.out.println("Sentences with undersore in place of spaces are : ");
        String outputs = inputs.replace(" ","_");
        System.out.println(outputs);



    }
}
