package com.gyesiama.algorithms;

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

    public static boolean isPalindrome2(String arg){
        int len = arg.length();
        for(int i = 0, j = len -1; i < j; i++, j--){
            if(arg.charAt(i) != arg.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
