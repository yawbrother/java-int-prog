package com.gyesiama.alogrithms;

//import static org.mockito.Mochito.*;

import com.gyesiama.algoritms.Palindrome;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class PalindromeTester {
    Palindrome palindrome;

    public void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    public void testIsPalindrome1(){

        Assert.assertTrue(palindrome.isPalindrome1("abba"));
        Assert.assertFalse(palindrome.isPalindrome1("abcdefg"));
        Assert.assertTrue(palindrome.isPalindrome1("a"));
        Assert.assertTrue(palindrome.isPalindrome1("pennep"));
    }

    @Test
    public void testIsPalindrome2(){

        Assert.assertTrue(palindrome.isPalindrome2("abba"));
        Assert.assertFalse(palindrome.isPalindrome2("abcdefg"));
        Assert.assertTrue(palindrome.isPalindrome2("a"));
        Assert.assertTrue(palindrome.isPalindrome2("pennep"));
    }


}
