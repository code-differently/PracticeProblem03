package com.stayready;

import java.util.Arrays;

public class Problem03 {
    /*
       1. Compare from the sorted array end to the current value in input array
       2. If the current position is greater than 2, return "Too Chaotic"
       3. If the current positon is less than 2, count the swap
    */


    public String isChaotic(int [] queue){
        Integer bribes = 0;

        for(int i =queue.length-1; i>=0; i-- ){
            int currentPosition = queue[i] - (i+1);
            if(currentPosition >2){
                return "Too Chaotic";
            }else{
              int swaps = Math.max(0, queue[i]-2);
              for(int j=swaps; j<i; j++){
                  if(queue[j] > queue[i]){
                      bribes++;
                  }
              }
            }
        }
        return bribes.toString();
    }
}
