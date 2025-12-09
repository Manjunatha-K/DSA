package com.logic.DSA.Test;


// An anagram is a word formed by rearranging the letters of another word.
// You are given an array of words, and your task is to group all anagrams together using Java 8.
// Input:  ["below", "ate", "elbow", "eat", "tea", "cat"]
// Output: [["below", "elbow"], ["ate", "eat", "tea"], ["cat"]]

import javax.smartcardio.Card;
import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("below", "ate", "elbow", "eat", "tea", "cat");

        Map<String, List<String>> map = new HashMap<>();
        for(String word : words){
           //List<Character> chars =word.chars().sorted().
         String chars = Arrays.asList(word.toCharArray()).stream().sorted().toString();
         map.put(chars, null);
        }
        for(String word : words){
            String chars = Arrays.asList(word.toCharArray()).stream().sorted().toString();
            map.forEach(Map.Entry entry ->{
                List<String> value = new ArrayList<>();
                entry.
                if(entry.getKey().equals(chars);
                map.put(entry.getKey(), )
            });

        }
    }
}


/*
Consider a scenario where you have a Products table and an Orders table.

The Products table has columns: product_id (PK), product_name, price.

The Orders table has columns: order_id (PK), product_id (FK), quantity, order_date.
You need to write a SQL query that retrieves the names of all products that have never been ordered, along with their prices. Additionally, explain how you would efficiently fetch this data from a Java application, considering potential performance implications and best practices.

  SELECT p.product_id, p.product_name, p.price
  FROM Products p
  WHERE p.product_id != (SELECT DISTINCT o.product_id
  FROM Orders o)

 */