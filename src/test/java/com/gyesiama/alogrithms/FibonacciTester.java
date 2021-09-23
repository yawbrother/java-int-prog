package com.gyesiama.alogrithms;

import com.gyesiama.alogoritms.Fibonacci;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FibonacciTester {

    @Test
    public void testFibonacciRecursive(){
        Assert.assertEquals(1, Fibonacci.fibonacci1(2));
        Assert.assertEquals(34, Fibonacci.fibonacci1(9));
    }

    @Test
    public void testFibonacci2(){
        Assert.assertEquals(1, Fibonacci.fibonacci2(2));
        Assert.assertEquals(34, Fibonacci.fibonacci2(9));
    }
}
