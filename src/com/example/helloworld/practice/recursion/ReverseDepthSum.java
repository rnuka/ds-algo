package com.example.helloworld.practice.recursion;

import java.util.*;

/**
 * input: { {1,1}, 2, {1,1}} output: 8
 * Given a nested list of integers, returns the sum of all integers in the list weighted by their REVERSED depth.
 * * For example, given the list {{1,1},2,{1,1}} the deepest level is 2.
 * Thus the function should return 8 (four 1's with weight 1, one 2 with weight 2)
 * Given the list {1,{4,{6}}} the function should return 17 (one 1 with weight 3, one 4 with weight 2, and one 6 with weight 1)
 */

public class ReverseDepthSum {
    public static class NestedInteger {
        private Integer value;
        private List<NestedInteger> list;

        public NestedInteger(Integer val) {
            value = val;
        }

        public NestedInteger(List<NestedInteger> nestedLists) {
            list = nestedLists;
        }

        public boolean isInteger() {
            return value != null;
        }

        public Integer getInteger() {
            return value;
        }

        public List<NestedInteger> getList() {
            return list;
        }
    }

    public static int reverseDepthSum(List<NestedInteger> input) {
        Map<Integer, Integer> levelMap = new TreeMap<Integer, Integer>(Collections.<Integer>reverseOrder());
        reverseDepthSum(input, 1, levelMap);
        int revLevel = 1;
        int sum = 0;
        for (Integer i : levelMap.keySet()) {
            sum += (revLevel * levelMap.get(i));
            revLevel++;
        }
        return sum;
    }

    private static void reverseDepthSum(List<NestedInteger> inputList, Integer level, Map<Integer, Integer> map) {
        for (NestedInteger curr : inputList) {
            if (curr.isInteger()) {
                if (map.containsKey(level)) {
                    map.put(level, map.get(level) + curr.getInteger());
                } else {
                    map.put(level, curr.getInteger());
                }
            } else {
                reverseDepthSum(curr.getList(), level + 1, map);
            }
        }
    }

    public static void testBench() {
        int output = 0;
        //input = { {1,1}, 2 , {1,1} }
        List<NestedInteger> input = new ArrayList();
        List<NestedInteger> n1 = new ArrayList<NestedInteger>();
        n1.add(new NestedInteger(1));
        n1.add(new NestedInteger(1));
        input.add(new NestedInteger(n1));
        input.add(new NestedInteger(2));

        List<NestedInteger> n3 = new ArrayList<NestedInteger>();
        n3.add(new NestedInteger(1));
        n3.add(new NestedInteger(1));
        input.add(new NestedInteger(n3));
        output = reverseDepthSum(input);
        System.out.println("Sum :" + output);
    }

    public static void main(String[] args) {
        testBench();
    }

}

