package com.example.helloworld.practice.arrays;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

class BracketEval {

    private static Character getOpenBracket(Character ch) {
        if (ch == ')') return '(';
        else if (ch == '}') return '{';
        else if (ch == ']') return '[';
        return ' ';
    }

    public static boolean isStringValid(String input) {
        if (input == null) {
            return false;
        }
        Stack<Character> tokenStack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '['
                    || input.charAt(i) == '{') {
                tokenStack.push(input.charAt(i));
            } else {
                if (!tokenStack.isEmpty()) {
                    if (tokenStack.pop() != getOpenBracket(input.charAt(i))) {
                        return false;
                    }
                } else
                    return false;
            }
        }
        return tokenStack.isEmpty();
    }

    private static void testBench() {
        System.out.println(isStringValid("(]"));
        System.out.println(isStringValid("()"));
        System.out.println(isStringValid("()[]"));
        System.out.println(isStringValid("(([]))"));
        System.out.println(isStringValid("()["));
        System.out.println(isStringValid("()]"));
    }

    public static void main(String args[]) {
        testBench();
    }
}