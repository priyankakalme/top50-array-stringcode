package org.tcs.ioc.RandomArray;

public class UniqueNumber {

    public static void main(String[] args) {

        int arr[] ={1,2,2,3,1,3,7};
        int uniNumber= uniqueNumber(arr);
        System.out.println(uniNumber);
    }

    private static int uniqueNumber(int[] arr) {

        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
}
