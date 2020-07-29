package com.stayready;

public class Problem03 {

    public int minimumBribes(int[] intArr){
        if(isChaotic(intArr)){
            System.out.println("Too Chaotic");
            return 0;  //returns 0, since it is too chaotic
        }

        int swaps = getNumSwaps(intArr);
        return swaps;
    }

    public int getNumSwaps(int[] arr){
        int numSwaps = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int current = arr[j];
                    
                    arr[j] = arr[i];
                    arr[i] = current;

                    numSwaps++;
                }
            }
        }

        return numSwaps;
    }

    public boolean isChaotic(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if((arr[i] - i - 1) > 2)
                return true;
        }

        return false;
    }
}
