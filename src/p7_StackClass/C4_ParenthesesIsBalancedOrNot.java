package p7_StackClass;

public class C4_ParenthesesIsBalancedOrNot {
    /*
    Input: str = "((()))()()"
    Output: Balanced
    Input: str = "())((())"
    Output: Not Balanced
     */

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String exp) {
        int count = 0;

        // Traversing the expression
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }

            // More closing brackets than opening
            if (count < 0) {
                return false;
            }
        }

        // If count is 0, all brackets matched
        return count == 0;
    }

    public static void main(String[] args) {
        String exp1 = "((()))()()";
        if (isBalanced(exp1))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        String exp2 = "())((())";
        if (isBalanced(exp2))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
