package com.gyesiama.alogrithms;

import com.gyesiama.algorithms.Repeater;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class RepeaterTester {

    @Test
    public void testRepeter_aba_10(){
        Assert.assertEquals(7, Repeater.repeatedString("aba", 10, 'a'));
    }

    @Test
    public void testRepeter_a_1000000000000(){
        Assert.assertEquals(1000000000000L, Repeater.repeatedString("a", 1000000000000L, 'a'));
    }




}
