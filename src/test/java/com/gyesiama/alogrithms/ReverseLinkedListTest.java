package com.gyesiama.alogrithms;

import com.gyesiama.algorithms.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void reverseEmptyList() {
        LinkedList<String> l = new LinkedList<>();
        l.reverse();
        Assert.assertEquals("[]", l.toString());
    }

    @Test
    public void reverseOneElementList() {
        LinkedList<String> l = new LinkedList<>();
        l.add("a1");
        l.reverse();
        Assert.assertEquals("[a1]", l.toString());
    }

    @Test
    public void reverseManyElementsList() {
        LinkedList<String> l = new LinkedList<>();
        l.add("a1");
        l.add("a2");
        l.add("a3");
        l.add("a4");
        l.add("a5");
        Assert.assertEquals("[a1->a2->a3->a4->a5]", l.toString());
        l.reverse();
        Assert.assertEquals("[a5->a4->a3->a2->a1]", l.toString());
    }
}
