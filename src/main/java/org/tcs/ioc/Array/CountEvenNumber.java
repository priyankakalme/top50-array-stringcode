package org.tcs.ioc.Array;

public class CountEvenNumber {
    public static void main(String[] args) {

        int arr[]= {2,3,4,5,6,8,9,10,7};

        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] % 2==0)
                count ++;
        }
        System.out.println(count);
    }
}
