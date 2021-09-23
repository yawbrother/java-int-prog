package com.gyesiama.algorithms;

import java.util.Arrays;
import java.util.Comparator;


public class VersionNumberComparator  implements Comparator<String> {

    @Override
    public int compare(String v1, String v2) {
        Integer [] arr1 = Arrays.stream(v1.split("\\."))
                .map(Integer::parseInt)
                .toArray(Integer [] ::new);

        Integer [] arr2 = Arrays.stream(v2.split("\\."))
                .map(Integer::parseInt)
                .toArray(Integer [] ::new);

        int l1 = arr1.length, l2 = arr2.length, idx = 0;


        while( idx < l1 || idx < l2) {
            if(idx < l1 && idx < l2){
                if(arr1[idx] < arr2[idx]) {
                    return -1;
                }
                else if (arr1[idx] > arr2[idx]) {
                    return 1;
                }
            }
            else if (idx < l1) {
                if(arr1[idx] != 0) {
                    return 1;
                }
            }
            else if (idx < l2) {
                if(arr2[idx] != 0) {
                    return -1;
                }
            }
            idx++;
        }
        return 0;
    }
}
