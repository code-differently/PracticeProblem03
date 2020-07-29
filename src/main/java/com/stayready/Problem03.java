package com.stayready;

/*
Step 1: Create a method that takes in an String argument
Step 1.5: Turn String into a char array.
Step 2: Create an integer to count how many moves are made
Step 3: Go through iteration of array
Step 4: Compare the number with the index.
Step 5: Return the if chaotic or not.
 */
public class Problem03 {


    public static String swap(String s) {
        s = s.replaceAll(" ", "");
        char [] str = s.toCharArray();
        int swapAmount = 0;
        for(int i= 0; i < str.length-1;i++){
            if((str[i]-48)-(i+1) > 2) {
                return "Too Chaotic";
            } else if(str[i+1] != str[i]+1){
                swapAmount++;
            }
        }
        return "" +swapAmount;
    }
}
