package com.company.Java;

public class FindingMinimumArrayElement {
    public static void main(String[] args) {
        System.out.println("We are Finding Minimum Elements from the array");

        int[] arr = {100,27,3,40,5,88,7,8,9,10};
        int i;
        int min = arr[0];
        System.out.println("Array elements are : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        for(i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }
        }
        System.out.println("Minimum element from array will be " + min);


    }
}
