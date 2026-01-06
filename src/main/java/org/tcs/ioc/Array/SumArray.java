package org.tcs.ioc.Array;

public class SumArray {

    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7,8,9};
        int sum=0;
        for (int i=0;i<arr.length-1;i++){

            sum=arr[i] +sum;
        }
        System.out.println("sum is:" + sum);
    }
}
