package com.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheNumberThatAppearsOneOthersTwice {

    private static void findUsingOptimal(int[] arr) {
        int xor =0;
        for(int i =0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        System.out.println("Single element using optimal is : "+xor);
    }

    private static void findUsingBetter(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] temp = new int[max+1];

        for(int i =0;i<arr.length;i++){
            temp[arr[i]]++;
        }

        for(int j =0;j<temp.length;j++){
            if(temp[j] ==1){
                System.out.println("Single element using better is : "+ j);
                break;
            }
        }
    }

    private static void findUsingBrute(int[] arr) {

        int count ;
        for(int i =0;i<arr.length;i++){
            count =0;
            for(int j =0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Single element using brute is : "+arr[i]);
                break;
            }
        }
    }

    private static void findUsingStreams(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Single element using streams is : "+ map.entrySet().stream()
                .filter(entry-> entry.getValue() == 1).limit(1).toList());
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        findUsingBrute(arr);
        findUsingBetter(arr);
        findUsingOptimal(arr);
        findUsingStreams(arr);
    }


}
