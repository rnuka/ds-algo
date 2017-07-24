package com.example.helloworld.practice.arrays;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *  
 * SOLUTION APPROACH: Maintain a hashmap for all tokens(bracket pairs), whenever open bracket is encountered, push the corr
 * closed bracket and whenever close comes pop and check if they are same...
 */

class BracketEval {
    static boolean hasMatchingParantheses(String strExpression) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> bracketMap = new HashMap<Character, Character>();
        bracketMap.put('(',')');bracketMap.put('{','}');bracketMap.put('[',']');
        for(int i = 0; i < strExpression.length(); i++){
            char ch = strExpression.charAt(i);
            if(bracketMap.containsKey(ch)){
                stack.push(bracketMap.get(ch));
            }
            if(ch == '}' || ch == ']' || ch == ')') {
                if(stack.isEmpty() || ch != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
