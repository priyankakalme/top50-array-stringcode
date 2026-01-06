package org.tcs.ioc.Array;

public class SecondLargesrElement {

    public static void main(String[] args) {

        int arr[]= {2,3,4,5,6,8,9,10,7};

        int largest=-1;
        int second=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
        }
        System.out.println("second :" +second);
    }
}
