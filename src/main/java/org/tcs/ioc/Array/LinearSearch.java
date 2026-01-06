package org.tcs.ioc.Array;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[]={2,3,4,3,4,5,6,8,9};
        int key=9;
        int index=linearSearch(arr,key);

        if(index!= -1){
            System.out.println("found at" +index);
        }
    }

    private static int linearSearch(int[] arr, int key) {
        if (arr== null) return  -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }



        }
        return  -1;
    }


}
