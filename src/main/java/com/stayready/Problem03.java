package com.stayready;
  /*
  Get the initial position which will be the size of the queue in order

   case 1: don't bribe, stay at the ith position
          if(arr[i] != i + 1){ go to case 2a}
   case 2: bribe and move ahead 
        (a) At ith initial position, valid current position after bribe can be (i-1)th pos
                if(arr[i-1] == (i+1)){
                  swap++;
                  swap(arr, i, i-1);
                }
        (b) At ith initial position, valid current position after bribe can be (i-2)th pos
                if(arr[i-2] == (i+1)){
                  swap += 2;
                  swap(arr, i-2, i-1);
                  swap(arr, i-1, i);
                }
        (c) Too chaotic (trying to bribe more than 2 people ahead of you)
                if(arr[i-1] !- (i+1) && arr[1-2] != i+1){
                  print "Too Chaotic";
                  return;
                }

  */
public class Problem03 {
  //in order to test, my method returns -1 if too chaotic
  public int countMinSwaps(int[] array){
    int minSwaps = 0;
    for(int i = array.length - 1; i >= 0; i --){
      if(array[i] != i+1){
        if(array[i-1] == (i + 1) && (i-1) >= 0){ //must be a positive index
          minSwaps++;
          swap(array, i, i-1);
        } else if (array[i-2] == (i + 1) && (i-2) >= 0){ //must be a positive index
          minSwaps += 2;
          swap(array, i-2, i-1);
          swap(array, i-1, i); 
        } else {
          System.out.println("Too chaotic");
          return -1;
        }
      }
    }
    return minSwaps;

  }

  public void swap(int[] arr, int indexStart, int indexFinish){
    int temp = arr[indexStart]; 
    arr[indexStart] = arr[indexFinish];
    arr[indexFinish] = temp; 

  }



}
