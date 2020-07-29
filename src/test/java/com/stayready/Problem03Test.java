package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    int [] queue1 = {2, 1, 5, 3, 4};
    int [] queue2 = {2, 5, 1, 3, 4};
    int [] queue3 = {1, 1, 4, 3, 6, 5, 7, 8, 9};
    int [] queue4 = {1, 4, 5, 3, 8, 6, 7};
    int [] queue5 = {3, 1, 2, 4, 5, 6, 8, 7, 9, 12, 11, 10};

    @Test
    public void isChaoticTest1(){
        Problem03 problem03 = new Problem03();

        String expected = "3";
        String actual = problem03.isChaotic(queue1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isChaoticTest2(){
        Problem03 problem03 = new Problem03();

        String expected = "Too Chaotic";
        String actual = problem03.isChaotic(queue2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isChaoticTest3(){
        Problem03 problem03 = new Problem03();

        String expected = "2";
        String actual = problem03.isChaotic(queue3);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isChaoticTest4(){
        Problem03 problem03 = new Problem03();

        String expected = "Too Chaotic";
        String actual = problem03.isChaotic(queue4);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isChaoticTest5(){
        Problem03 problem03 = new Problem03();

        String expected = "3";
        String actual = problem03.isChaotic(queue5);

        Assert.assertEquals(expected,actual);
    }
}
