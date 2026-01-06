package org.tcs.ioc.Array;

public class FindDuplicate {

    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7,8,4,5,6};

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length-1;j++)  {
                if (arr[i]==arr[j]){
                    System.out.println("duplicate found : "+ arr[i]);
                }
            }
        }
    }
}
