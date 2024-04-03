//实现一个MyQueue类，该类用两个栈来实现一个队列。 
// 示例： MyQueue queue = new MyQueue(); queue.push(1); queue.push(2); queue.peek()
//;  // 返回 1 queue.pop();   // 返回 1 queue.empty(); // 返回 false 说明： 
// 
// 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size 和 is empty 操作是合法的。 
//
// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。 
// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。 
// 
//
// Related Topics 栈 设计 队列 👍 78 👎 0


package main.java.com.zjb.leetcode.editor.cn;

import java.util.Stack;

//Java：化栈为队
//创建时间：2024-04-03 10:24:27
public class P面试题 03.04ImplementQueueUsingStacksLcci{
    public static void main(String[] args) {
        Solution solution = new P面试题 03.04ImplementQueueUsingStacksLcci().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {

    /** Initialize your data structure here. */
    public static Stack<Integer> in;
    public static Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public static void inToOut() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
        inToOut();
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        inToOut();
        return out.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        inToOut();
        return out.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}