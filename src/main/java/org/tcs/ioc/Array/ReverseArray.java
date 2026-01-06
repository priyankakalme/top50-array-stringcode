package org.tcs.ioc.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7,8,9};
        //start index
        int i=0;
        //end index
        int j= arr.length-1;
        //swap
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for (int a:arr){
            System.out.println(a);
        }
        System.out.println(Arrays.toString(arr));
    }
}
