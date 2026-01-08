package org.tcs.ioc.ArrayISsheet.FreqCounting;

import java.util.HashMap;
import java.util.Map;

public class FreqElement {

    public static void main(String[] args) {

         int[] arr={2,3,4,5,2,3,2,3};

         Map<Integer,Integer> freq= new HashMap<>();

         for(int x:arr){
             freq.put(x,freq.getOrDefault(freq,0)+1);
         }
        System.out.println(freq);
    }
}
