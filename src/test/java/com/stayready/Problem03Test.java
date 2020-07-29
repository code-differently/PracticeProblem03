package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void minimumBribesTest(){
        // Given
        Problem03 p = new Problem03();
        String arr = "2 1 5 3 4";
        // When
        String actual = p.minimumBribes(arr);
        String expected = "3";
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void minimumBribesTest2(){
        // Given
        Problem03 p = new Problem03();
        String arr = "2 5 1 3 4";
        // When
        String actual = p.minimumBribes(arr);
        String expected = "Too Chaotic";
        // Then
        Assert.assertEquals(expected, actual);
    }
}
