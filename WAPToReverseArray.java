package com.company.Java;

public class WAPToReverseArray {
    public static void main(String[] args) {
        System.out.println("Reversing Array");

        int[] arr = new int[5];
        System.out.println("Normal Array");
        arr[0]=101;arr[1]=102;arr[2]=103;arr[3]=104;arr[4]=105;
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        System.out.println("Reverse of the given array will be");
        for(int j=arr.length-1; j>=0; j--) {
            System.out.print(arr[j]+" ");
        }
    }


}
