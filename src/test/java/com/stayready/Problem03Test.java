package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void minimumBrideTest01(){
        //Given
        Problem03 problem03 = new Problem03();
        String input = "2 1 5 3 4";
        String expected = "3";

        //When
        String actual = problem03.minimumBribe(input);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void minimumBrideTest02(){
        //Given
        Problem03 problem03 = new Problem03();
        String input = "2 5 1 3 4";
        String  expected = "Too Chaotic";

        //When
        String actual = problem03.minimumBribe(input);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void minimumBrideTest03(){
        //Given
        Problem03 problem03 = new Problem03();
        String input = "5 1 2 3 7 8 6 4";
        String  expected = "Too Chaotic";

        //When
        String actual = problem03.minimumBribe(input);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void minimumBrideTest07(){
        //Given
        Problem03 problem03 = new Problem03();
        String input = "1 2 5 3 7 8 6 4";


        String  expected = "7";

        //When
        String actual = problem03.minimumBribe(input);

        //Then
        Assert.assertEquals(expected, actual);

    }






}
