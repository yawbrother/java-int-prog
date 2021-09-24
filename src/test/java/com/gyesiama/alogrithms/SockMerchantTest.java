package com.gyesiama.alogrithms;

import com.gyesiama.algorithms.SockMerchant;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;


@RunWith(MockitoJUnitRunner.class)
public class SockMerchantTest {
    SockMerchant sockMerchant = new SockMerchant();

    @Test
    public void testFibonacciRecursive(){
        Assert.assertEquals(2, sockMerchant.sockMerchant(Arrays.asList(1,2,1,2,1,3,2), 7));
        Assert.assertEquals(3, sockMerchant.sockMerchant(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20), 9));
    }
}
