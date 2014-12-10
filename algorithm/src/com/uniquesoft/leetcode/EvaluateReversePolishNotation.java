/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.Stack;

/**
 * @author lusha
 * Notes:
 * 1. Use STACK to solve problem 
 * 2. Reverse the order of operands when popping from stack.
 * 3. Use String contain function instead of combination of equals function
 * 4. #Use switch/case instead of if/else
 */
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] expr1 = new String[] { "2", "1", "+", "3", "*" };
        String[] expr2 = new String[] { "4", "13", "5", "/", "+" };

        System.out.println("Result1: " + stackApproach(expr1));
        System.out.println("Result2: " + stackApproach(expr2));
    }

    /**
     * @param exprArr
     * @return
     */
    public static int stackApproach(String[] exprArr) {
        Stack<String> stack = new Stack<String>();

        // Use String contains function instead of equals
        String operators = "+-*/";

        for (String expr : exprArr) {
            // if ((expr != "+") && (expr != "-") && (expr != "*") && (expr !=
            // "/")) {
            if (operators.contains(expr)) {
                stack.push(expr);
            } else {
                int operand1 = Integer.valueOf(stack.pop());
                int operand2 = Integer.valueOf(stack.pop());

                int rlt = 0;
                if ("+".equals(expr)) {
                    rlt = operand2 + operand1;
                } else if ("-".equals(expr)) {
                    rlt = operand2 - operand1;
                } else if ("*".equals(expr)) {
                    rlt = operand2 * operand1;
                } else if ("/".equals(expr)) {
                    rlt = operand2 / operand1;
                }
                stack.push(String.valueOf(rlt));
            }
        }
        // TODO Invalid Expression Handling
        return Integer.valueOf(stack.peek());
    }
}
