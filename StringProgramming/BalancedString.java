package com.StringProgramming;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(isBalanced("[5*4*(2+3)}]"));
    }

    static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check for opening brackets and push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Check for closing brackets and pop from stack
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char lastBracket = stack.pop();
                if ((c == ')' && lastBracket != '(') ||
                    (c == '}' && lastBracket != '{') ||
                    (c == ']' && lastBracket != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // Check if all brackets were matched
    }
}
