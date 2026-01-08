package org.tcs.ioc.ArrayISsheet.Lineartravarsal;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestElement {
    public static void main(String[] args) {

        int arr[] ={4,5,6,7,8,9,10};

        int largestele= largestEle(arr);
        System.out.println(largestele);

        OptionalInt max= Arrays.stream(arr)
                .max();
        System.out.println(max);
    }

    private static int largestEle(int[] arr) {

        int num=arr[0];
        for(int i=0;i<arr.length;i++){
            if(num<arr[i]){
                num=arr[i];
            }
        }
        return num;
    }
}
