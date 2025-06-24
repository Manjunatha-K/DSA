package com.logic.DSA.Arrays.Better;

public class MajorityElemetnt_II {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,5};
        int count1 = 0;
        int count2 = 0;
        int ele1=-1;
        int ele2 = -1;
        for (int i =0;i<arr.length;i++){
            if(count1 == 0 && arr[i]!=ele2){
                ele1 = arr[i];
                count1++;
            }else if(count2==0 && arr[i] != ele1){
                ele2 = arr[i];
                count2++;
            }else if( arr[i] == ele1){
                count1++;
            }else if(arr[i] == ele2){
                count2++;
            }else {
                count1--;
                count2--;
            }
        }

        if(count1>0 && count2>0)
            System.out.println("THE MAJORITY ELEMENTS ARE : "+ele1+"--"+ele2);
        else
            System.out.println("NO MAJORITY ELEMENTS");
    }
}
