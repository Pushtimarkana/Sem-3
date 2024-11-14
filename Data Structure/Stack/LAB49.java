import java.util.Stack;

class LAB49 {
    public static void main(String[] args) {
        LAB49 minStack = new LAB49();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** Initialize the stack object. */
    public LAB49() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    /** Pushes the element val onto the stack. */
    public void push(int val) {
        stack.push(val);
        // Push to minStack only if it's empty or the new value is smaller or equal to the current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    /** Removes the element on the top of the stack. */
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        // If the popped element is the same as the current minimum, pop it from minStack as well
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    /** Gets the top element of the stack. */
    public int top() {
        return stack.peek();
    }
    
    /** Retrieves the minimum element in the stack. */
    public int getMin() {
        return minStack.peek();
    }
}
