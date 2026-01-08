package org.tcs.ioc.ArrayISsheet.SecondLargestSmallest;

public class SecondSmallestEle {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int smallest=Integer.MAX_VALUE;
        int secsmallest=Integer.MAX_VALUE;

        for(int x:arr){
            if(x<smallest){
                secsmallest=smallest;
                smallest=x;
            } else if (x>smallest&& x<secsmallest) {
                secsmallest=x;

            }
        }
        System.out.println(smallest);
        System.out.println(secsmallest);
    }
}
