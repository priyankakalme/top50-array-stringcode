package org.tcs.ioc.Array;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int arr1[]={2,3,4,5};
        int arr2[]={9,10,12,11};
        int[] mergerd=new int[arr1.length +arr2.length];
        System.arraycopy(arr1,0,mergerd,0,arr1.length);
        System.arraycopy(arr2,0,mergerd,arr1.length,arr2.length);
        System.out.println(Arrays.toString(mergerd));
    }
}
