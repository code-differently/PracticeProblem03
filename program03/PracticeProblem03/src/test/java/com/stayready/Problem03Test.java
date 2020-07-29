package com.stayready;
import org.junit.Test;
import org.junit.Assert;

public class Problem03Test {
 
    @Test
    public void sortingTest1(){
        //given
        problem3 problem3 = new problem3();
        Integer[]  arr = {1,2,4,3,5};
        
        //when
        Integer expected = 1;
        Integer actual = problem3.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortingTest2(){
        //given
        problem3 problem03 = new problem3();
        Integer[]  arr = {3,2,1,4};
        
        //when
        Integer expected = 3;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }


    


    @Test
    public void isChaoticTest(){
        problem3 problem03 = new problem3();
        Integer[]  arr = {2, 5 ,1 ,3, 4};
        
        //when
        boolean expected = true;
        boolean actual = problem03.tooChaotic(arr);

        //Then
        Assert.assertEquals(expected, actual);
    


    }

    @Test
    public void newYearsTest(){
        //given
        problem3 problem03 = new problem3();
        Integer[]  arr = {2,1,5,3,4};
        
        //when
        Integer expected = 3;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void newYearsTest2(){
        //given
        problem3 problem03 = new problem3();
        Integer[]  arr = {2,5,1,3,4};
        
        //when
        Integer expected = 0;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NewYearsTest3(){
        //given
        problem3 problem03 = new problem3();
        Integer[]  arr = {1,2,5,3,4,7,8,6};
        
        //when
        Integer expected = 4;
        Integer actual = problem03.bubbleSort(arr);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
