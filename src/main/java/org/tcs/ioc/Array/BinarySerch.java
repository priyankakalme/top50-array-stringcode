package org.tcs.ioc.Array;


public class BinarySerch {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,4,5,6,8,9};
     int key=9;

         int index= binarySearchm(arr,key);
         if(index!=-1){
             System.out.println("found :" +index);
         }else{
             System.out.println("not found");
         }
    }

    private static int binarySearchm(int[] arr, int key) {

        if(arr== null || arr.length==0) return  -1;
         int low=0;
         int high= arr.length-1;
         while(low<=high){
             int mid=low+(high-low)/2;

             if(arr[mid]==key){
                 return  mid;
             }else  if (arr[mid]<key){
                 low=mid+1;
             }else  if (arr[mid]>key){
                 high=mid-1;
             }
         }
         return -1;
    }
}
