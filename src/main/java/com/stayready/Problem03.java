package com.stayready;

public class Problem03 {

    /**
     * @param length length of desired array
     * @return An integer array of ordered numbers
     */
    static int[] createOrderedArray(int length){
        int[] array=new int[length];
        for (int i = 0; i <length ; i++) {
            array[i]=i+1;
        }
        return array;
    }

    /**
     * @param array Array to check for value
     * @param num Number to look for
     * @return Index of desired number
     */
    static int findIndex(int[] array,int num) {
        for (int i =0; i <array.length ; i++) {
            if(array[i]==num)
                return i;

        }
        return -1;
    }

    /**
     * @param array Array to check for value
     * @param index1 Index to swap value of
     * @param index2 Other index to swap value of
     * @return Array with the values swapped
     */
    static int[] swapValue(int[] array,int index1,int index2){
        int temp=array[index2];
        array[index2]=array[index1];
        array[index1]=temp;
        return array;
    }

    /**
     *
     * @param queue Array with valid integers
     * @return Minimum number of bribes used if valid
     */
    static String minimumBribes(int[] queue){
        String output="";
        int count=0;
        int[] orderedArray=createOrderedArray(queue.length);

        for (int i = queue.length-1; i >-0 ; i--) {
            int currentNum=orderedArray[i];
            int index=findIndex(queue,currentNum);
            if(index==i)
                continue;
            else{
                int numOfBribes=i-index;
                if(numOfBribes<=2){
                    count++;
                    orderedArray=swapValue(orderedArray,index,i);
                }
                else
                    return "Too Chaotic";
            }

        }
        return String.format("Minimum number of bribes: %d",count);
    }
}
