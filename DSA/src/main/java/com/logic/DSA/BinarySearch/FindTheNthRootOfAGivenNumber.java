package com.logic.DSA.BinarySearch;

public class FindTheNthRootOfAGivenNumber {
    private static void findNthRoot(int num, int root) {
        int low = 1;
        int high = num;
        double ans =-.01;
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            ans = findRoot(root,mid,num);
            if(ans == -1)
                low = mid+1;
            else if (ans == 1)
                high = mid-1;
            else if(ans == 0) {
                System.out.println("The root is : " + mid);
                return;
            }
        }
        System.out.println("No Nth Root ");
    }

    private static Integer findRoot(int root,int mid, int num) {
        int rootAns = 1;
        for(int i =1;i<=root;i++){
            rootAns = rootAns*mid;
            if(rootAns>num)
                return 1;
        }
        if(rootAns == num)
            return 0;
        else
            return  -1;
    }

    public static void main(String[] args) {
        int num = 525;
        int root = 3;
        findNthRoot(num,root);
    }


}
