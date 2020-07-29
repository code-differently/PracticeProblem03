package com.stayready;


import java.util.Arrays;
import java.util.Scanner;

public class Problem03 {
    private Integer [] q;
    private int bribes;


    public static void main(String [] args) {

        String queue = "2 1 5 3 4";
        Problem03 test = new Problem03(queue);
        System.out.println(test.minimumBrides());
    }

    private void toIntArry(String x) {

        String[] nums = x.split(" ");
        q = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
        {

            q[i] = Integer.parseInt(nums[i]);
        }

    }

    public Problem03(String x) {
        toIntArry(x);
        bribes = 0;
    }


    public String minimumBrides() {

        String ans = "";
        Integer n = 0, len = 0;

        len = q.length;
        for (int i = len; i > 1; i--) {

            if( (i - 3 > 0) ) {

                if(i == q[(len/2)]){

                    bribes += 2;
                }else if (i == q[(len/2) + bribes]) {

                    bribes++;

                } else if(i == q[i-1]) {


                } else {

                    return "Too Chaotic";
                }

            } else {

                if ( i == q[i-1]) {

                    bribes ++;

                }

            }

        }

        ans += bribes;
        return ans;
    }

    public Integer[] getQ() {

        return q;
    }


}
