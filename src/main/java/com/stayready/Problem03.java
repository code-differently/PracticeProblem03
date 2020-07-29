package com.stayready;

public class Problem03 {

    public Integer[] parseInt(String queue){
        String[] digit = queue.split(" ");
        Integer[] numbers = new Integer[digit.length];
        for (int i= numbers.length-1 ; i >= 1; i--) {
            numbers[i] = Integer.parseInt(digit[i]);//change your string to int
        }
        return numbers;
    }

    public Boolean checkBribes(String queue) {
        Integer[] numbers= parseInt(queue);
        Integer bribes = 0;
        Boolean check = false;
        for (int i= numbers.length-1 ; i >= 1; i--) {
            bribes = Math.abs(numbers[i] - (i+1));
            if (bribes >= 3) {
                check = false;
                System.out.print("Too chaotic");
                break;
            } else if (bribes <= 2) {
                check = true;
            }
        }
        return check;
    }

    public Integer minSwap(String queue){
        Integer[] numbers= parseInt(queue);
        Integer swap=0;
       // if(checkBribes(queue)){}
        //get min swaps
        //for loop transeverse trough array( back to front)
        //check if number<number--1
        //if yes swap count number of swaps
        return swap;
        }

    }



