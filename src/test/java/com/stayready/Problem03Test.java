package com.stayready;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Problem03Test {

    Problem03 prob3;
    String queue;
    String expected;
    String actual;
    @Before
    public void setUp() {
        queue = "";
        expected = "";
        actual = "";
        
    }


    @Test
    public void sample01Test(){

        queue = "2 1 5 3 4";
        prob3 = new Problem03(queue);
        expected = "3";

        actual = prob3.minimumBrides();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sample02Test(){
        //Given
        String queue = "2 5 1 3 4";
        Problem03 prob3 = new Problem03(queue);
        String expected = "Too Chaotic";
        //When
        String actual = prob3.minimumBrides();
        System.out.println(actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
