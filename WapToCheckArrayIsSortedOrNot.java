package com.company.Java;

public class WapToCheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        System.out.println("We are checking here array is sorted or not");
        //Unsorted array
        int[] arr ={100,101,102,103,30,40,106,107,108,110};
        String a ="d";
        String b ="c";
        //Sorted array
        //int[] arr ={100,101,102,103,104,105,106,107,108,109};
        int st = arr[0];
        for (int j : arr) {
            if (st > j) {
                a = "true";
            } else {
                b = "false";
            }
        }
        if(a.equals("true")){
            System.out.println("Array is not in sorted manner");
        }else{
            System.out.println("array is sorted");
        }

    }
}
