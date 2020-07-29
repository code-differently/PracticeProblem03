package com.stayready;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwapPositionsHelperTest {
    private SwapPositionsDetail detail;
    private SwapPositionsHelper swapPositionsHelper;
    private final String bribeQueueInput = "51432"; //passed in queue will not have spaces

    @Before
    public void setup() {
        detail = new SwapPositionsDetail();
        swapPositionsHelper = new SwapPositionsHelper(detail);
    }

    @Test
    public void constructorTest() {
        String expected = "total number of bribes per position: 0 exceededLimit: false bribing position: 0 number of bribes: 0 fixed index: 0 changing index: 1";

        String actual = swapPositionsHelper.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void updateBribeQueueValuesChangeIndexTest() {
        int expectedIndex = 2;

        swapPositionsHelper.updateBribeQueueValues(bribeQueueInput, '1', '4');
        int actualIndex = swapPositionsHelper.getChangingIndex();

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void getMaxBribesPerPositionTest() {
        int expectedSize = 0;

        int actualSize = swapPositionsHelper.getMaxBribesPerPosition().size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void hasExceededLimitTest() {
        boolean actual= swapPositionsHelper.hasExceededLimit();

        assertFalse(actual);
    }

    @Test
    public void getBribingPositionTest() {
        int expectedIndex = 0;

        int actualIndex = swapPositionsHelper.getBribingPosition();

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void getNumBribesTest() {
        int expected = 0;

        int actual = swapPositionsHelper.getNumBribes();

        assertEquals(expected, actual);
    }

    @Test
    public void getFixedIndexTest() {
        int expectedIndex = 0;

        int actualIndex = swapPositionsHelper.getFixedIndex();

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void setFixedIndexTest() {
        int expectedIndex = 2;

        swapPositionsHelper.setFixedIndex(2);
        int actualIndex = swapPositionsHelper.getFixedIndex();

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void getChangingIndexTest() {
        int expectedIndex = 1;

        int actualIndex = swapPositionsHelper.getChangingIndex();

        assertEquals(expectedIndex, actualIndex);
    }
}
