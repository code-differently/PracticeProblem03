package com.stayready;

/*
1. Create the function minimumBrides to represent the minimum number of bribes, or Too Chaotic if it exceeds
the number of brides.
2. Change the string queue to an array q.
3. Make a for loop to see if array q exceeds the minimum number of brides.
    - if it exceeds the number of brides print too chaotic
    - if it doesn't exceed the number print out the new swapped array



 */
public class Problem03 {
    private Integer [] q;
    private int bribes;
    private String ans;
    public static void main(String [] args) {
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
        for (int i = q.length-1; i > 0; i--) {
            if( (i - 2 > 0) ) {                                 //if less than 0 it's outside array

                if ((i + 1) == q[i - 2]) {                            //accessing the value at the index
                    bribes += 2;                                //bribes = 2
                    i--;                                        //setting i to i-1

                } else if ((i + 1) == q[i - 1]) {
                    bribes++;                                  //update bribes and moves array location
                    i--;

                } else if ((i + 1) == q[i]) {
                    i--;
                } else {
                    return "Too chaotic";                       //if it doesn't fit any condition
                }

                }else {
                    if((i+1) == q[i-1]){
                        bribes ++;
                        i -= 2;
                    }
                }
            }
        ans += bribes;                                          //adding integer to a string
        return ans;
        }

    public Integer[] getQ(){
        return q;
    }
}
