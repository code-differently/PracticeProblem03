package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void createArrayTest(){
        // Given
        int length=4;
        int[] expected={1,2,3,4};

        // When
        int[] actual=Problem03.createOrderedArray(length);

        // Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void createArrayTest2(){
        // Given
        int length=8;
        int[] expected={1,2,3,4,5,6,7,8};

        // When
        int[] actual=Problem03.createOrderedArray(length);

        // Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void indexTest(){
        // Given
        int expected=2;
        int[] test={1,2,3,4,5,6,7,8};

        // When
        int actual=Problem03.findIndex(test,3);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void indexTest2(){
        // Given
        int expected=0;
        int[] test={2,3,1,6,7,5,8,4};

        // When
        int actual=Problem03.findIndex(test,2);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void indexTest3(){
        // Given
        int expected=4;
        int[] test={2,3,1,6,-1,7,5,8,4,10};

        // When
        int actual=Problem03.findIndex(test,-1);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void swapTest(){
        // Given
        int[] test={2,3,1,6,-1,7,5,8,4,10};
        int[] expected={10,3,1,6,-1,7,5,8,4,2};

        // When
        int[] actual=Problem03.swapValue(test,0,test.length-1);

        // Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void swapTest2(){
        // Given
        int[] test={2,3,1,6,7,5,8,4};
        int[] expected={2,7,1,6,3,5,8,4};

        // When
        int[] actual=Problem03.swapValue(test,1,4);

        // Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void swapTest3(){
        // Given
        int[] test={1,2};
        int[] expected={2,1};

        // When
        int[] actual=Problem03.swapValue(test,0,1);

        // Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void bribeTest(){
        // Given
        int[] test={2,5,1,3,4};
        String expected="Too Chaotic";

        // When
        String actual=Problem03.minimumBribes(test);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void bribeTest2(){
        // Given
        int[] test={2,1,5,3,4};
        String expected="Minimum number of bribes: 3";

        // When
        String actual=Problem03.minimumBribes(test);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void bribeTest3(){
        // Given
        int[] test={1,2,3,5,4};
        String expected="Minimum number of bribes: 1";

        // When
        String actual=Problem03.minimumBribes(test);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void bribeTest4(){
        // Given
        int[] test={3,2,1,5,4};
        String expected="Minimum number of bribes: 2";

        // When
        String actual=Problem03.minimumBribes(test);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void bribeTest5(){
        // Given
        int[] test={3,2,1,5,4,6,7,10,9,8};
        String expected="Minimum number of bribes: 3";

        // When
        String actual=Problem03.minimumBribes(test);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void bribeTest6(){
        // Given
        int[] test={11,3,2,1,5,4,6,7,10,9,8};
        String expected="Too Chaotic";

        // When
        String actual=Problem03.minimumBribes(test);

        // Then
        Assert.assertEquals(expected,actual);

    }
}
