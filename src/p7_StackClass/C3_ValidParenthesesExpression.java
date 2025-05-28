package p7_StackClass;

import java.util.Stack;

public class C3_ValidParenthesesExpression {
    /*
    Input: s = "[{()}]"
    Output: true
    Explanation: All the brackets are well-formed.
     */

    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket
            else {
                // If stack is empty or doesn't match the last opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                //char top = stack.peek();
                if ((stack.peek() == '(' && ch == ')') ||
                        (stack.peek() == '{' && ch == '}') ||
                        (stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return false; // Mismatched pair
                }
            }
        }

        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{([])}";// same opening and same closing.
        if (isBalanced(str))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
//Using Stack - O(n) Time and O(n) Space