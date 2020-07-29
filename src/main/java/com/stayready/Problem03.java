package com.stayready;
import java.util.Arrays;

public class Problem03 {

    public String minimumBribe(String input){
        int swapCount = 0;
        int [] intArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < intArray.length-1; i++) {
            for (int j = 0; j < intArray.length- i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;

                    swapCount++;
                }
            }
        }
        if(swapCount > 3){
            return "Too Chaotic";
        }else{
            return String.valueOf(swapCount);
        }



    }


}
