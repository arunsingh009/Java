package com.company.Java;

public class SumofFloatsinArray {
    public static void main(String[] args) {
        System.out.println("We are printing sum of float value which is present in array : ");
        float[] marks = {10.0f,20.4f,45.3f,34.6f,46.0f};
        float sum =0;
        for(int i=0;i<marks.length;i++){
            sum = sum+ marks[i];
        }
        System.out.println("Sum of the given array will be : "+sum);
    }
}
