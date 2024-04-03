//请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(
//1)。 
// 示例： MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0); 
//minStack.push(-3); minStack.getMin();   --> 返回 -3. minStack.pop(); minStack.top(
//); --> 返回 0. minStack.getMin(); --> 返回 -2. 
//
// Related Topics 栈 设计 👍 98 👎 0


package main.java.com.zjb.leetcode.editor.cn;
//Java：栈的最小值
//创建时间：2024-04-03 11:45:24
public class P面试题 03.02MinStackLcci{
    public static void main(String[] args) {
        Solution solution = new P面试题 03.02MinStackLcci().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    /** initialize your data structure here. */
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
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}