package com.stayready;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Problem03 {

    public static int[] convertFromStringToIntArray(String input){

        int[] result = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        return result;
    }

    public static String minimumBribes(String queue) {
        int numberOfSwaps = 0;
        Map<Integer, Integer> personsInRollerCoasterLine = new HashMap<>();
        int [] arr = convertFromStringToIntArray(queue);
        for(int a = 0; a < arr.length; a++){
            personsInRollerCoasterLine.put(arr[a], 2);
        }
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numberOfSwaps++;
                    int swapper = personsInRollerCoasterLine.get(arr[j+1]) - 1;
                    personsInRollerCoasterLine.put(arr[j+1],swapper);
                }
            }
        }

        if(personsInRollerCoasterLine.containsValue(-1) || personsInRollerCoasterLine.containsValue(-2)){
            return "Too Chaotic";
        }
        else {
            return String.valueOf(numberOfSwaps);
        }
    }


}
