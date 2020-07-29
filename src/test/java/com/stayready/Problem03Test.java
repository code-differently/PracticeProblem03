package com.stayready;
import org.junit.Assert;
import org.junit.Test;
public class Problem03Test {
    @Test
    public void minimumBribesTest(){
        String q = "2 1 5 3 4";
        Problem03 problem03 = new Problem03();
        String expected = "3";
        String actual = problem03.minimumBribes(q);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest2(){
        String q = "2 5 1 3 4";
        Problem03 problem03 = new Problem03();
        String expected = "Too Chaotic";
        String actual = problem03.minimumBribes(q);
        Assert.assertEquals(expected,actual);
    }
}