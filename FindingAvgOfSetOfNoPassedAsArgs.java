package com.company.Java;

public class FindingAvgOfSetOfNoPassedAsArgs {
    static void arr(int ...a){
        int sum =0;
        float avg;
        System.out.println("Set of no are : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            sum =sum+a[i];
        }
        System.out.print("\n");
        avg=(float)sum/a.length;
        System.out.println("avg of the given set of numbers will be : "+avg);


    }

    public static void main(String[] args) {
        System.out.println("Enter numbers  : ");
        arr(1,2,3,4,5,6,7);
    }
}
