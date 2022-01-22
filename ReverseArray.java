package com.company.Java;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("We are printing array elements in revers order");

        int[] marks = {1, 2, 3, 4, 5, 6};
        for (int i = 5; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }
}
