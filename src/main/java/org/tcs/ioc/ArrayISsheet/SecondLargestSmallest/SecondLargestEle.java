package org.tcs.ioc.ArrayISsheet.SecondLargestSmallest;

public class SecondLargestEle {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9,10};

        int secEle= secondlargeele(arr);
        System.out.println(secEle);
    }

    private static int secondlargeele(int[] arr) {
int largest=-1;
int sec=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sec=largest;
                largest=arr[i];
            }
        }
        return sec;
    }
}
