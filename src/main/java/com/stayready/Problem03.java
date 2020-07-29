package com.stayready;
import java.util.Arrays;
import java.util.HashMap;


public class Problem03 {

    public String minimumBribe(String input) {
        int swapCount = 0;
        HashMap<Integer, Integer> rollerCoasterRideLine = new HashMap<>();
        //converting input into a integer array
        int[] intArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int a = 0; a < intArray.length; a++) {
            rollerCoasterRideLine.put(intArray[a], 2);
        }
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                    swapCount++;
                    int secondPersonSwap = rollerCoasterRideLine.get(intArray[j + 1]) - 1;
                    rollerCoasterRideLine.put(intArray[j + 1], secondPersonSwap);
                }
            }
        }
        if (rollerCoasterRideLine.containsValue(-1) || rollerCoasterRideLine.containsValue(-2)) {
            return "Too Chaotic";
        } else {
            return String.valueOf(swapCount);
        }


    }


}
