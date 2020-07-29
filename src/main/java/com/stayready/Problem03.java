package com.stayready;

import java.util.*;
 /*
/ Use the Queue interface
/ Use PriorityQueue
/ sort the arr in ascending order
/ number with the highest value has the priority to move first
/ the number with the highest value can only move twice
/ then the following highest number has the priority to move next
  */
public class Problem03 {

    public String entanglement(Integer[] arrInteger){
        // sort the in ascending order
        Arrays.sort(arrInteger);

        Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(arrInteger));

        String order = "";
        // starts fom the end
        for(int index = arrInteger.length-1;index >= 0; index--){
            order += queue.poll();
        }
        return order;
    }
}
