package com.stayready;

import org.junit.Assert;
import org.junit.Test;

import java.util.Queue;

public class Problem03Test {

    @Test
    public void entanglementTest(){
        // Given
        Problem03 aProblem03 = new Problem03();
        String expected = "3";

        // When
        Integer[] arrInteger = {2,1,5,3,4};
        String actual = aProblem03.entanglement(arrInteger);

        // Then
        Assert.assertEquals(expected,actual);
    }


}


