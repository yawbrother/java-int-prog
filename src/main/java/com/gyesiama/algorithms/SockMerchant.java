package com.gyesiama.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class SockMerchant {

    public static void main(String [] args) {
        SockMerchant mer = new SockMerchant();
        System.out.println(mer.sockMerchant(Arrays.asList(1,2,1,2,1,3,2), 7));
        System.out.println(mer.sockMerchant(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20), 9));

    }

    public long sockMerchant(List<Integer> arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(Integer item : arr) {
            Integer value = map.get(item);
            if(value == null) {
                map.put(item, 1);
            }
            else {
                count++;
                map.remove(item);
            }
        }

        return count;
    }
}
