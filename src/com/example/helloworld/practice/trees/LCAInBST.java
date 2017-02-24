package com.example.helloworld.practice.trees;

/**
 * 5
 * 3          6
 * 1       4         8
 * 9
 * 1. LCA in BST
 * Given values of two nodes in a Binary Search Tree,
 * write a c program to find the Lowest Common Ancestor (LCA).
 * You may assume that both the values exist in the tree.
 * <p/>
 * 2. Followup question, If given tree is not BST
 * Given a binary tree (not a binary search tree) and two values say n1 and n2,
 * write a program to find the least common ancestor.
 */
public class LCAInBST {


    private static TreeNode LCA(TreeNode root, TreeNode n1, TreeNode n2) {
        if (root == null) {
            return null;
        }
        if (n1.data < root.data && root.data <= n2.data) {
            return root;
        } else if (n1.data < root.data && n2.data < root.data) {
            return LCA(root.left, n1, n2);
        } else {
            return LCA(root.right, n1, n2);
        }
    }

    private static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.data + " : ");
        printTree(node.right);
    }

    public static void main(String args[]) {
        TreeNode a5 = new TreeNode(5);
        TreeNode a4 = new TreeNode(4);
        TreeNode a3 = new TreeNode(3);
        TreeNode a1 = new TreeNode(1);
        TreeNode a6 = new TreeNode(6);

        TreeNode a8 = new TreeNode(8);
        TreeNode a9 = new TreeNode(9);

        a5.left = a3;

        a3.parent = a5;
        a3.left = a1;
        a3.right = a4;

        a4.parent = a3;
        a1.parent = a3;

        a5.right = a6;

        a6.parent = a5;
        a6.right = a8;
        a8.parent = a6;
        a8.right = a9;
        a9.parent = a8;

        TreeNode output = LCA(a5, a1, a4);
        System.out.println("LCA : " + output.data);
        printTree(a5);
    }
}
