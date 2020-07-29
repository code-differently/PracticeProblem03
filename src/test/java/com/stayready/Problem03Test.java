package com.stayready;
import org.junit.Assert;
import org.junit.Test;
public class Problem03Test {

    @Test
    public void minimumBribesTest(){
        String queue = "2 1 5 3 4";
        Problem03 problem03 = new Problem03();
        String expected = "3";
        String actual = problem03.minimumBribes(queue);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest2(){
        String queue = "2 5 1 3 4";
        Problem03 problem03 = new Problem03();
        String expected = "Too Chaotic";
        String actual = problem03.minimumBribes(queue);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest3(){
        String queue = "5 1 2 3 7 8 6 4";
        Problem03 problem03 = new Problem03();
        String expected = "Too Chaotic";
        String actual = problem03.minimumBribes(queue);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void minimumBribesTest4(){
        String queue = "1 2 5 3 4 7 8 6";
        Problem03 problem03 = new Problem03();
        String expected = "4";
        String actual = problem03.minimumBribes(queue);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void minimumBribesTest5(){
        String queue = "1 2 5 3 7 8 6 4";

        Problem03 problem03 = new Problem03();
        String expected = "7";
        String actual = problem03.minimumBribes(queue);
        Assert.assertEquals(expected,actual);
    }
}

