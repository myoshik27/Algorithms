/*

Implement the following operations of a queue using stacks.

    push(x) -- Push element x to the back of queue.
    pop() -- Removes the element from in front of queue.
    peek() -- Get the front element.
    empty() -- Return whether the queue is empty.

Notes:

    You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
    Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
    You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).


*/

import java.util.*;

class MyQueue {
    
    private Stack<Integer> input = new Stack<Integer>();
    private Stack<Integer> output = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        while(!output.isEmpty()) input.push(output.pop());
        input.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!input.isEmpty()) output.push(input.pop());
        output.pop();
    }

    // Get the front element.
    public int peek() {
        while(!input.isEmpty()) output.push(input.pop());
        return output.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/* Tested at https://leetcode.com/problems/implement-queue-using-stacks/

Space Complexity is O(n)

Time Complexity:

    push -- O(n)
    pop -- O(n)
    peek -- O(n)
    empty -- O(1)

*/