package com.gyesiama.algoritms;

/**
 * Finds the number of letters of "repeater" in a string "s" concatenated infinitely
 */
public class Repeater {

    /**
     *
     * @param s: lower case english letters
     * @param n: number of letters in first n letters of
     * @param repeater: letter to find
     * @return
     */
    public static long repeatedString(String s, long n, char repeater) {
        long size = s.length();
        long times = n / size;
        long remainder = n % size;

        long bucketSize  = s.chars().filter( x -> x == repeater).count();

        long ret = 0;
        if(remainder == 0) {
            ret =  times * bucketSize;
        }
        else {
            ret =  times * bucketSize;
            for(int i = 0; i < size && i < remainder; i++) {
                if(s.charAt(i) == repeater) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
