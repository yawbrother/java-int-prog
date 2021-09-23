package com.gyesiama.alogoritms;

import java.util.Arrays;

public class Palindrome {
    public static void main(String [] args) {
        System.out.println(isPalindrome1("abba"));
        System.out.println(isPalindrome1("abcdefg"));
        System.out.println(isPalindrome1("a"));
        System.out.println(isPalindrome1("pennep"));

    }

    public static boolean isPalindrome1(String arg){
        char [] arr = arg.toCharArray();
        for(int i =0; i < arr.length; ++i) {
            if( arr[i] != arr[arr.length -1 -i]) {
                return false;
            }
        }
        return true;
    }

}
