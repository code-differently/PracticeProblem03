package com.stayready;

import org.junit.Test;
import org.junit.Assert;

public class Problem03Test {

    @Test
    public void sample01Test(){
        //Given
        String queue = "2 1 5 3 4";
        Problem03 prob3 = new Problem03(queue);
        String expected = "3";

        //When
        String actual = prob3.minimumBrides();
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sample02Test(){
        //Given
        String queue = "2 5 1 3 4";
        Problem03 prob3 = new Problem03(queue);
        String expected = "Too chaotic";

        //When
        String actual = prob3.minimumBrides();
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
