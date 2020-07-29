package com.stayready;

public class Problem03 
{
    public Integer bubbleSort(Integer[] arr)
    { 
        if(chaotic(arr))
        {
            return 0;
        }

        int swapCount = 0;
        int n = arr.length; 
        
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                    swapCount++;
                } 
            }
        }
        return swapCount;
    } 

    public boolean chaotic(Integer[] arr)
    {
        for(int i =0 ; i<arr.length; i++)
        {
            if(arr[i] > i+3 )
            {
                return true;
            }
        }
        return false;
    }
} 