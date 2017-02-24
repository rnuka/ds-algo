package com.example.helloworld.practice.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by crathinasababathy on 2/24/17.
 * Question:
 * <p/>
 * Find a triplet that sum to a given value
 * Given an array and a value, find if there is a triplet in array
 * whose sum is equal to the given value. If there is such a triplet present in array,
 * then print the triplet and return true. Else return false.
 * For example, if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24,
 * then there is a triplet (12, 3 and 9) present in array whose sum is 24.
 */
public class ThreeSum {

    private static boolean threeSum(Integer[] a, int targetSum) {
        Set<Integer> allElements = new HashSet<Integer>(Arrays.asList(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int n3 = targetSum - (a[i] + a[j]);
                if (allElements.contains(n3) && n3 != a[i] && n3 != a[j]) {
                    System.out.println("Triplet is :" + a[i] + ":" + a[j] + ":" + n3);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {

        Integer[] a = {12, 3, 4, 1, 6, 9};
        System.out.println("Threesum found: " + threeSum(a, 24));

    }
}
