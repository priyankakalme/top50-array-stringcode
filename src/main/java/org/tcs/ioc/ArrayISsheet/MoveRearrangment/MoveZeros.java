package org.tcs.ioc.ArrayISsheet.MoveRearrangment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[]arr={1,2,3,0,0,0,3,5,0,2};

        int c=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[c]=arr[i];
                c++;
            }
        }
        while(c<arr.length){
            arr[c]=0;
            c++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
