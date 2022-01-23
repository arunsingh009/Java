package com.company.Java;

public class findingMaxElementFromArray {
    public static void main(String[] args) {
        System.out.println("We are Finding Max element from the array");
        int[] arr = {1, 2, 3, 11, 5, 6, 7, 8, 9, 10};
        int max=arr[0];
        int i;
        System.out.println("Array elements are : ");
        for( i =0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
        System.out.print("\n");
        for(i=0;i<arr.length;i++) {
            if (arr[i] >max){
                max=arr[i];
            }
        }
        System.out.println("largest element of the array : " + max);



    }
}
