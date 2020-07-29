package com.stayready;

import java.util.HashMap;

public class SwapPositionsHelper implements Swap{
    private HashMap<Character, Integer> maxBribesPerPosition;
    private boolean exceededLimit;
    private int bribingPosition;
    private int numBribes;
    private int fixedIndex;
    private int changingIndex;

    public SwapPositionsHelper(SwapPositionsDetail detail) {
        maxBribesPerPosition= detail.maxBribesPerPosition;
        exceededLimit = detail.exceededLimit;
        bribingPosition = detail.bribingPosition;
        numBribes = detail.numBribes;
        fixedIndex = detail.fixedIndex;
        changingIndex = detail.changingIndex;
    }

    public String updateBribeQueueValues(String bribeQueue, char fixedValueInLine, char valueToPotentiallySwapWith) {
        if(fixedValueInLine > valueToPotentiallySwapWith) {
            bribingPosition = changingIndex - 1;
            maxBribesPerPosition.merge(bribeQueue.charAt(bribingPosition), 1, Integer::sum);
            exceededLimit = maxBribesPerPosition.get(bribeQueue.charAt(bribingPosition)) > 2;
            bribeQueue = swapPositions(bribeQueue, bribingPosition, changingIndex);
            numBribes++;
            changingIndex = fixedIndex + 1;
        }
        else {
            changingIndex++;
        }
        return bribeQueue;
    }

    public String swapPositions(String input, int before, int after) {
        char[] positionArray = input.toCharArray();
        Character tempPosition = positionArray[before];
        positionArray[before] = positionArray[after];
        positionArray[after] = tempPosition;
        return String.valueOf(positionArray);
    }

    public HashMap<Character, Integer> getMaxBribesPerPosition() {
        return maxBribesPerPosition;
    }

    public boolean hasExceededLimit() {
        return exceededLimit;
    }

    public int getBribingPosition() {
        return bribingPosition;
    }

    public int getNumBribes() {
        return numBribes;
    }

    public int getFixedIndex() {
        return fixedIndex;
    }

    public void setFixedIndex(int newIndex) {this.fixedIndex = newIndex;}

    public int getChangingIndex() {
        return changingIndex;
    }

    @Override
    public String toString() {
        return "total number of bribes per position: " + maxBribesPerPosition.size() + " exceededLimit: " + exceededLimit + " bribing position: " + bribingPosition + " number of bribes: " + numBribes + " fixed index: " + fixedIndex + " changing index: " + changingIndex;
    }
}
