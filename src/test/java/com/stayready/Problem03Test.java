package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {
    Problem03 p3;
    @Before
    public void setUp(){
        this.p3= new Problem03();
    }
    @Test
    public void parseInt(){
        Integer[] expected={2,1,5,3,4};
        String digits= "2 1 5 3 4";
        Integer[] actual = p3.parseInt(digits);

        Assert.assertArrayEquals(expected,actual);


    }
    @Test
    public void checkBribes(){

        String digits= "2 1 5 3 4";
        Boolean actual = p3.checkBribes(digits);

        Assert.assertTrue(actual);
    }
    @Test
    public void checkBribes01(){

        String digits= "2 5 1 3 4";
        Boolean actual = p3.checkBribes(digits);

        Assert.assertFalse(actual);
    }

}
