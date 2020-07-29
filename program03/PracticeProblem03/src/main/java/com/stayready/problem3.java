package com.stayready;

//logic
//1.check to see if sorting exceeds 2
//2.return too chaotic if true
//3.initialize a variable to keep track of how many times a swap occurs


public class problem3 {
    public Integer bubbleSort(Integer[] arr){ 
        if(tooChaotic(arr)){
            System.out.println("Too chaotic");
            return 0;
        }
        //keeps track of the swaps
        int swapCount = 0;
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    swapCount++;
                } 
                return swapCount;
    } 

    public boolean tooChaotic(Integer[] arr){
        for(int i =0 ; i<arr.length; i++){
            if(arr[i] > i+3 ){
                //the element is too far out of place.
                //too many swaps
                System.out.println();
                return true;
            }
        }

        return false;
    }
}