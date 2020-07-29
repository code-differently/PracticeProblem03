package com.stayready;

public class Problem03 {
    

    public int findBribeCount(int[] queue){
        int firstChoice = 1;
        int secondChoice = 2;
        int thirdChoice = 3;

        int bribeCount = 0;
        //
        for(int i =0; i<queue.length; i++){
            if(queue[i] == firstChoice){
                firstChoice = secondChoice;
                secondChoice = thirdChoice;
                thirdChoice++;
            }
            else if(queue[i] == secondChoice){
                secondChoice = thirdChoice;
                thirdChoice++;
                bribeCount++;
            }
            else if(queue[i] == thirdChoice){
                thirdChoice++;
                bribeCount+=2;
            }
            else{
                System.out.println("Too chaotic");
                return 0;
            }
        }
        

        return bribeCount;
    }
}
