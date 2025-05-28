package p7_StackClass;

import java.util.Stack;

public class C1_ImplementStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // print
        System.out.println("Print the stack : "+ s);

        // pop elements from the stack
         while(!s.isEmpty()) {
             System.out.println(s.pop());
         }
    }
}
/*
Explanation: In the above example, we are creating an empty stack of integer and
             then we are pushing four elements onto the stack with the help of push() method.
             After that we enter a loop where we keep on popping the elements with the help
             of pop() method and printing the elements until the stack is empty.

Note: The elements are popped in reverse order because we know the stack follows LIFO principle
 */