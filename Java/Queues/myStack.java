/*

Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.

Notes:
    You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
    Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
    You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

*/


import java.util.*;

class MyStack {
    
    private Queue<Integer> stack = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        stack.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        for(int i=0; i<stack.size()-1; i++){
            stack.add(stack.remove());
        }
        stack.remove();
    }

    // Get the top element.
    public int top() {
        int temp = stack.peek();
        for(int i=0; i<stack.size(); i++){
            if(i == stack.size()-1) temp = stack.peek();
            stack.add(stack.remove());
        }
        return temp;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}

/*

Tested at https://leetcode.com/problems/implement-stack-using-queues/
All Methods are O(1) space complexity and O(n) time complexity except empty() which is O(1) time complexity

*/