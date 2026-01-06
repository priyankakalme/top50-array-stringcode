package org.tcs.ioc.Array;

public class MissingNumber {
    public static void main(String[] args) {

        int num[]={1,2,3,5};
        int misnum=findMissingNum(num,5);
        System.out.println(misnum);
    }

    private static int findMissingNum(int[] num, int n) {
        int total= n *(n+1)/2;//15
        int actualsum=0;
        for(int x:num){
            actualsum =x+actualsum;
        }
        return total-actualsum;

    }
}
