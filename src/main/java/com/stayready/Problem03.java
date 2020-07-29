package com.stayready;

import java.util.Arrays;

public class Problem03 {
    /*
        1. Have a sorted array to compare the input array to
        2. Compare from the sorted array end to the current value in input array
        3. If the current position is greater than 2, return "Too Chaotic"
        4. If the current positon is less than 2, count the swap
    */

 /*  int ans = 0; //bribes
    for(int i=q.length-1;i>=0;i--){//for loop starts at the end of the queue and back tracks
        int ch_pos = q[i]-(i+1);//2-1=1, number of bribes
        if(ch_pos>2) { //if no. of bribes is greater than 2 then
            System.out.println("Too chaotic");
        }
        else{
            int st = Math.max(0,q[i]-2);//the max of the params is outputted
            for(int j=st;j<i;j++){//j=max
                if(q[j]>q[i]) ans++;
            }
        }

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
