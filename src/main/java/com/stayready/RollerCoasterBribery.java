package com.stayready;

public class RollerCoasterBribery {
    public String minimumBribes(String q) {
        String qWithoutSpaces = q.replaceAll(" ", "");
        int queueLength = qWithoutSpaces.length();
        String originalOrder = computeOriginalOrdering(queueLength);

        String minimumBribes = qWithoutSpaces.equals(originalOrder) ? "0" : changeBribeQueueUntilItMatchesOriginalQueue(qWithoutSpaces, originalOrder);
        return minimumBribes;
    }

    private static String computeOriginalOrdering(int lengthOfQueue) {
        StringBuilder originalOrdering = new StringBuilder();
        for(int index = 1; index <= lengthOfQueue; index++) {
            originalOrdering.append(index);
        }
        return originalOrdering.toString();
    }

    private static String changeBribeQueueUntilItMatchesOriginalQueue(String bribeQueue, String originalQueue) {
        SwapPositionsDetail detail = new SwapPositionsDetail();
        Swap swapPositionsHelper = new SwapPositionsHelper(detail);
        char fixedValueInLine = bribeQueue.charAt(swapPositionsHelper.getFixedIndex());
        char valueToPotentiallySwapWith = bribeQueue.charAt(swapPositionsHelper.getChangingIndex());
        int fixedIndex = swapPositionsHelper.getFixedIndex();

        while(!bribeQueue.equals(originalQueue) && !swapPositionsHelper.hasExceededLimit()) {
            bribeQueue = swapPositionsHelper.updateBribeQueueValues(bribeQueue, fixedValueInLine, valueToPotentiallySwapWith);
            //only advance the fixed index if the element at the fixed index matches the original index
            fixedIndex = bribeQueue.charAt(fixedIndex) == originalQueue.charAt(fixedIndex) ? swapPositionsHelper.getFixedIndex() + 1 : swapPositionsHelper.getFixedIndex();
            swapPositionsHelper.setFixedIndex(fixedIndex);
            valueToPotentiallySwapWith = bribeQueue.charAt(swapPositionsHelper.getChangingIndex());
            fixedValueInLine = bribeQueue.charAt(fixedIndex);
        }
        return swapPositionsHelper.hasExceededLimit() ? "Too Chaotic" : String.valueOf(swapPositionsHelper.getNumBribes());
    }
}
