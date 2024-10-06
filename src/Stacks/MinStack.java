package Stacks;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;


    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        mainStack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int min() {
        if (!mainStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }
}
