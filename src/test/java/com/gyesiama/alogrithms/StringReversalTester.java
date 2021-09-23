package com.gyesiama.alogrithms;

import com.gyesiama.algoritms.StringReversal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringReversalTester {

    @Test
    public void testReverse1(){
        Assert.assertEquals("skeeGrofskeeG", StringReversal.reverse1("GeeksforGeeks"));
    }

    @Test
    public void testReverse2(){
        Assert.assertEquals("skeeGrofskeeG", StringReversal.reverse2("GeeksforGeeks"));
    }

    @Test
    public void testReverse3(){
        Assert.assertEquals("skeeGrofskeeG", StringReversal.reverse3("GeeksforGeeks"));
    }

    @Test
    public void testReverse4(){
        Assert.assertEquals("skeeGrofskeeG", StringReversal.reverse4("GeeksforGeeks"));
    }
}
