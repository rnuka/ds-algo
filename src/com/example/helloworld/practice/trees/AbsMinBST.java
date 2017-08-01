package com.example.helloworld.practice.trees;

import java.util.ArrayList;

/**
 * Created by crathinasababathy on 2/26/17.
 * Given a binary search tree with non-negative values,
 * find the minimum absolute difference between values of any two nodes.
 * Example:
 * Input:
 * <p/>
 * 1
 * \
 * 3
 * /
 * 2
 * <p/>
 * Output:
 * 1
 * <p/>
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 * <p/>
 * Note: There are at least two nodes in this BST.
 */
public class AbsMinBST {

    private static int BSTToArray(TreeNode node) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        //convert the BST to a sorted list
        BSTToArray(node, output);

        //find the min in the BST
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < output.size() - 1; i++) {
            int currMin = Math.abs(output.get(i) - output.get(i + 1));
            if (currMin < min) {
                min = currMin;
            }
        }
        return min;
    }

    private static void BSTToArray(TreeNode node, ArrayList<Integer> output) {
        if (node == null) {
            return;
        }
        BSTToArray(node.left, output);
        output.add(node.data);
        BSTToArray(node.right, output);
    }

    private static void testBench() {
        //null test case

        int output = BSTToArray(null);
        System.out.println("Abs min diff: " + output);

        //1 element in a tree
        TreeNode a11 = new TreeNode(1);

        output = BSTToArray(a11);
        System.out.println("Abs min diff: " + output);


        // other test cases
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(2);
        a1.right = a3;
        a3.left = a2;

        output = BSTToArray(a1);
        System.out.println("Abs min diff: " + output);


    }

    public static void main(String args[]) {
        testBench();
    }
}