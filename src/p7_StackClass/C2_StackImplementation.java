package p7_StackClass;

import java.util.Stack;

public class C2_StackImplementation {

    // Pushing elements onto the stack
    static void push_element(Stack<Integer> stack) {
        System.out.println("Push Operation:");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println("Pushed element: " + i);
        }
        System.out.println("Stack after push: " + stack);
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            Integer element = stack.peek();
            System.out.println("Element on stack top (peek): " + element);
        } else {
            System.out.println("Stack is empty, nothing to peek.");
        }
    }

    // Searching for an element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        int pos = stack.search(element);
        if (pos == -1)
            System.out.println("Element " + element + " not found in the stack.");
        else
            System.out.println("Element " + element + " is found at position (from top): " + pos);
    }

    // Popping elements from the top of the stack
    static void pop_element(Stack<Integer> stack) {
        System.out.println("Pop Operation:");
        while (!stack.isEmpty()) {
            Integer popped = stack.pop();
            System.out.println("Popped element: " + popped);
        }
        System.out.println("Stack after pop: " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        push_element(stack);                // Push 0 to 4
        stack_peek(stack);                  // Peek top element
        stack_search(stack, 2);     // Search for element 2
        stack_search(stack, 10);    // Search for non-existing element
        pop_element(stack);                 // Pop all elements
        stack_peek(stack);                  // Try to peek when empty
    }
}
