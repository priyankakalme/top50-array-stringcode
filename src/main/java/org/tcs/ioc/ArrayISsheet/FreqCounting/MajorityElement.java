package org.tcs.ioc.ArrayISsheet.FreqCounting;

public class MajorityElement {

    public static void main(String[] args) {

        int [] arr={2,2,1,1,1,2,1};

        int num= majorityElement(arr);
        System.out.println("majority element : " +num);
        int mjo= majoelementcout(arr);
        System.out.println(mjo);
    }

    private static int majoelementcout(int[] arr) {

        //morrs

        int result=0;
        int count=0;

        for(int num:arr){
            if(count==0){
                result=num;
            }
            if(num==result){
                count++;

            }else{
                count --;
            }
        }
        return  result;
    }

    private static int majorityElement(int[] arr) {
         //bruite force
        //>n/2 times
        //counting fre
        int num=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>arr.length/2) return arr[i];
            arr[i]=num;
        }
 return num;
    }
}
