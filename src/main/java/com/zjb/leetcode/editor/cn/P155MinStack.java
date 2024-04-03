//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 实现 MinStack 类: 
//
// 
// MinStack() 初始化堆栈对象。 
// void push(int val) 将元素val推入堆栈。 
// void pop() 删除堆栈顶部的元素。 
// int top() 获取堆栈顶部的元素。 
// int getMin() 获取堆栈中的最小元素。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= val <= 2³¹ - 1 
// pop、top 和 getMin 操作总是在 非空栈 上调用 
// push, pop, top, and getMin最多被调用 3 * 10⁴ 次 
// 
//
// Related Topics 栈 设计 👍 1748 👎 0


package main.java.com.zjb.leetcode.editor.cn;

import java.util.Stack;

//Java：最小栈
//创建时间：2024-04-03 11:10:03
public class P155MinStack{
    public static void main(String[] args) {
        Solution solution = new P155MinStack().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

//        Stack<Integer> data;
//        Stack<Integer> min;
//    public MinStack() {
//        data = new Stack<>();
//        min = new Stack<>();
//    }
//
//    public void push(int val) {
//        data.push(val);
//        if(min.isEmpty() || val <= min.peek()){
//            min.push(val);
//        }else {
//            min.push(min.peek());
//        }
//    }
//
//    public void pop() {
//        data.pop();
//        min.pop();
//    }
//
//    public int top() {
//        return data.peek();
//    }
//
//    public int getMin() {
//        return min.peek();
//    }

        public final int MAX_SIZE = 7500;
        int[] data;
        int[] min;
        int size;
        public MinStack() {
            data = new int[MAX_SIZE];
            min = new int[MAX_SIZE];
        }

        public void push(int val) {
            data[size] = val;
            if(size == 0 || val <= min[size-1]){
                min[size] = val;
            }else {
                min[size] = min[size-1];
            }
            size++;
        }

        public void pop() {
            size--;
        }

        public int top() {
            return data[size-1];
        }

        public int getMin() {
            return min[size-1];
        }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}