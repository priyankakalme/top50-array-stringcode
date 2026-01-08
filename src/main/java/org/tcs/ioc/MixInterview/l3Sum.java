package org.tcs.ioc.MixInterview;

import java.util.Arrays;

public class l3Sum {
    public static void main(String[] args) {

        int[] arr={12,3,4,1,6,9};
        int target=24;

        boolean found= thripletsum(arr,target);
        if(!found){
            System.out.println("not found");
        }
    }

    private static boolean thripletsum(int[] arr, int target) {

        Arrays.sort(arr);
        int n= arr.length;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;

            while (l<r){
                int sum= arr[i] +arr[l] +arr[r];

                if(sum==target){
                    System.out.printf(" triplate: (%d %d %d)%n",arr[i],arr[l] ,arr[r]);
                    return  true;
                }else  if(sum<target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return  false;
    }

}
