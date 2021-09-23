package com.gyesiama.alogoritms;

public class Fibonacci {

    public static void main(String [] args) {
        System.out.println(fibonacci1(2));
        System.out.println(fibonacci1(9));

        System.out.println(fibonacci2(2));
        System.out.println(fibonacci2(9));
    }

    public static int fibonacci1(int n) {
        if(n <= 0) return 0;
        else if( n <= 2) return 1;
        else return fibonacci1(n -1) + fibonacci1(n-2);
    }

    public static int fibonacci2(int n) {
        int a = 0, b = 1, c, i;
        if( n == 0) return a;
        for(i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
