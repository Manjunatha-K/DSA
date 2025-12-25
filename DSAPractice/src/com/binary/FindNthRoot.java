package com.binary;

public class FindNthRoot {
    private static void findNthRoot(int x, int n) {
        int low =0;
        int high = x;
        while (low<=high){
            int mid = low+(high-low)/2;
            int root = findRoot(mid,x,n);
            if(root == 2)
                high = mid-1;
            else if(root == 1){
                System.out.println("Nth root is : "+ mid );
                return;
            }else{
                low = mid+1;
            }
        }
        System.out.println("No Nth root");
    }

    private static int findRoot(int mid, int x, int n) {
        int multi = 1;
        for(int i =1;i<=n;i++){
            multi*=mid;
            if(multi>x){
                return 2;
            }
        }
        if(multi == x)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args){
        int x = 81;
        int n = 4;
        findNthRoot(x, n);
    }


}
