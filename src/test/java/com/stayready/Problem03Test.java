package com.stayready;

import static org.junit.Assert.assertArrayEquals;

import org.junit.*;

public class Problem03Test {
  Problem03 p = new Problem03();
  int[] a = {1, 2, 3, 4, 5};
  int[] b = {2, 1, 5, 3, 4}; 
  int[] c = {2, 5, 1, 3, 4}; 

  @Test
  public void convertToArrayTest(){
    String s = "queue = \"2 1 5 3 4\"";
    int[] expected = {2, 1, 5, 3, 4}; 

    int[] actual = p.convertToArray(s);

    Assert.assertArrayEquals(expected, actual);
  }

  @Test 
  public void countMinSwapsTest(){
    int expected = 3; 
    
    int actual = p.countMinSwaps(b);

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void countMinSwapsTest2(){
    int expected = -1; 
    
    int actual = p.countMinSwaps(c);

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void countMinSwapsTest3(){
    int expected = 0; 
    
    int actual = p.countMinSwaps(a);

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void swapTest(){
    p.swap(a, 0, 3);

    int[] expected = {4, 2, 3, 1, 5};

    Assert.assertArrayEquals(expected, a);

  }

}
