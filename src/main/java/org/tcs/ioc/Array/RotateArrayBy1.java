package org.tcs.ioc.Array;

import java.util.Arrays;

public class RotateArrayBy1 {

    public static void main(String[] args) {

        int arr[]={2,3,4,5,6};
         rotatebyright(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotatebyright(int[] arr) {


        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
}
