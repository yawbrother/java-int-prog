package com.gyesiama.algoritms;

public class StringReversal {
    public static void main(String [] args) {
        String input = "GeeksforGeeks";

        System.out.println(reverse1(input));
        System.out.println(reverse2(input));
        System.out.println(reverse3(input));
    }

    public static String reverse1(String str) {
        byte [] arr = str.getBytes();
        byte [] reversed = new byte[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length -i -1];
        }

        return  new String(reversed);
    }

    public static String reverse2(String str) {
        char [] arr = str.toCharArray();
        char [] reversed = new char[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length -i -1];
        }

        return  new String(reversed);
    }


    public static String reverse3(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse4(String str) {
        char [] arr = str.toCharArray();

        for(int i = 0, j = arr.length -1; i < arr.length / 2; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] =  tmp;
        }

        return  new String(arr);
    }

}
