package org.tcs.ioc.ArrayISsheet.Lineartravarsal;

public class CheckIfArrySorted {

    public static void main(String[] args) {

        int[ ] arr={2,3,4,5,6,7};

       if(isSorted(arr)){
           System.out.println("arrayis sorted");
       }else{
           System.out.println("not sorted");
       }
    }

    private static boolean isSorted(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return  false;
            }
        }
        return  true;

    }
}
