package com.stayready;

import java.util.HashMap;

public interface Swap {
    String updateBribeQueueValues(String bribeQueue, char fixedValueInLine, char valueToPotentiallySwapWith);
    String swapPositions(String input, int before, int after);

    public HashMap<Character, Integer> getMaxBribesPerPosition();
    public boolean hasExceededLimit();
    public int getBribingPosition();
    public int getNumBribes();
    public int getFixedIndex();
    public void setFixedIndex(int newIndex);
    public int getChangingIndex();
}
