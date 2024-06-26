//设计实现双端队列。 
//
// 实现 MyCircularDeque 类: 
//
// 
// MyCircularDeque(int k) ：构造函数,双端队列最大为 k 。 
// boolean insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true ，否则返回 false 。 
// boolean insertLast() ：将一个元素添加到双端队列尾部。如果操作成功返回 true ，否则返回 false 。 
// boolean deleteFront() ：从双端队列头部删除一个元素。 如果操作成功返回 true ，否则返回 false 。 
// boolean deleteLast() ：从双端队列尾部删除一个元素。如果操作成功返回 true ，否则返回 false 。 
// int getFront() )：从双端队列头部获得一个元素。如果双端队列为空，返回 -1 。 
// int getRear() ：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1 。 
// boolean isEmpty() ：若双端队列为空，则返回 true ，否则返回 false 。 
// boolean isFull() ：若双端队列满了，则返回 true ，否则返回 false 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入
//["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", 
//"getRear", "isFull", "deleteLast", "insertFront", "getFront"]
//[[3], [1], [2], [3], [4], [], [], [], [4], []]
//输出
//[null, true, true, true, false, 2, true, true, true, 4]
//
//解释
//MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
//circularDeque.insertLast(1);			        // 返回 true
//circularDeque.insertLast(2);			        // 返回 true
//circularDeque.insertFront(3);			        // 返回 true
//circularDeque.insertFront(4);			        // 已经满了，返回 false
//circularDeque.getRear();  				// 返回 2
//circularDeque.isFull();				        // 返回 true
//circularDeque.deleteLast();			        // 返回 true
//circularDeque.insertFront(4);			        // 返回 true
//circularDeque.getFront();				// 返回 4
//  
//
// 
//
// 提示： 
//
// 
// 1 <= k <= 1000 
// 0 <= value <= 1000 
// insertFront, insertLast, deleteFront, deleteLast, getFront, getRear, isEmpty,
// isFull 调用次数不大于 2000 次 
// 
//
// Related Topics 设计 队列 数组 链表 👍 233 👎 0


package main.java.com.zjb.leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

//Java：设计循环双端队列
//创建时间：2024-04-03 11:47:10
public class P641DesignCircularDeque{
    public static void main(String[] args) {
        Solution solution = new P641DesignCircularDeque().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MyCircularDeque {
//        public Deque<Integer> deque = new LinkedList<>();
//        int limit;
//        int size;
//
//    public MyCircularDeque(int k) {
//        limit = k;
//    }
//
//    public boolean insertFront(int value) {
//        if (isFull()){
//            return false;
//        }
//        return deque.offerFirst(value);
//    }
//
//    public boolean insertLast(int value) {
//        if (isFull()){
//            return false;
//        }
//        return deque.offerLast(value);
//    }
//
//    public boolean deleteFront() {
//        return deque.pollFirst() == null ? false : true;
//    }
//
//    public boolean deleteLast() {
//        return deque.pollLast() == null ? false : true;
//    }
//
//    public int getFront() {
//        if (isEmpty()){
//            return -1;
//        }
//        return deque.peekFirst();
//    }
//
//    public int getRear() {
//        if (isEmpty()){
//            return -1;
//        }
//        return deque.peekLast();
//    }
//
//    public boolean isEmpty() {
//        return deque.isEmpty();
//    }
//
//    public boolean isFull() {
//        return deque.size() == limit;
//    }

        public int[] deque;
        int l,r,size,limit;

        public MyCircularDeque(int k) {
            deque = new int[k];
            l  = r = size = 0;
            limit = k;
        }

        public boolean insertFront(int value) {
            if (isFull()){
                return false;
            }else {if (isEmpty()){
                l = r = 0;
                deque[0] = value;
            }else{
                l = l == 0 ? limit - 1 : l - 1;
                deque[l] = value;
            }
                size++;
                return true;
            }
        }

        public boolean insertLast(int value) {
            if (isFull()){
                return false;
            }else {if (isEmpty()){
                l = r = 0;
                deque[0] = value;
            }else{
                r = r == limit - 1 ? 0 : r + 1;
                deque[r] = value;
            }
                size++;
                return true;
            }
        }

        public boolean deleteFront() {
            if (isEmpty()){
                return false;
            }
            if(l == limit - 1){
                l = 0;
            }else{
                l++;
            }
            size --;
            return true;
        }

        public boolean deleteLast() {
            if (isEmpty()){
                return false;
            }
            if (r == 0){
                r = limit - 1;
            }else{
                r--;
            }
            size --;
            return true;
        }

        public int getFront() {
            if (isEmpty()){
                return -1;
            }
            return deque[l];
        }

        public int getRear() {
            if (isEmpty()){
                return -1;
            }
            return deque[r];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == limit;
        }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
//leetcode submit region end(Prohibit modification and deletion)

}