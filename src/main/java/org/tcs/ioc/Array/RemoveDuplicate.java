package org.tcs.ioc.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Integer arr[]={2,3,4,5,6,7,8,3,5,6,7};

        //convert array to set

        Set<Integer> setn= new HashSet<>(Arrays.asList(arr));

        Integer unarry[]= setn.toArray(new Integer[0]);

        System.out.println(Arrays.toString(unarry));
    }
}
