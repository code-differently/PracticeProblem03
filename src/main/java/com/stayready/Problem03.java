package com.stayready;

public class Problem03 {
    public Boolean bribeCheck(Integer[] array, Integer numOfBribes)
    //Inspect scenarios for bribes, if any
    {
        Boolean tooMuchChaos = true;
        for (int i = 0; i < array.lenght; i++)
        {
            if (array[i] -i -1 > numOfBribes)
            {
                tooMuchChaos = false;
            }
        }
        return tooMuchChaos;
    }

//Count the number of bribes and thus, the number of times a number switched places with another number
    public Integer countSwaps(Integer[] array)
    {
        if(bribeCheck(array, 2)== false)
        {
        return -1;
        }
        Integer bribes = 0;
        for (int i = 0; i < array.length; i++)
        {
            bribes++;
        }
        return bribes;
    }


}
