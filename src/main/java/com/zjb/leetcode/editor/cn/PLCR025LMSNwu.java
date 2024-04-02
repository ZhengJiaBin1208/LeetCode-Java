//给定两个 非空链表 l1和 l2 来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。 
//
// 可以假设除了数字 0 之外，这两个数字都不会以零开头。 
//
// 
//
// 示例1： 
//
// 
//
// 
//输入：l1 = [7,2,4,3], l2 = [5,6,4]
//输出：[7,8,0,7]
// 
//
// 示例2： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[8,0,7]
// 
//
// 示例3： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 链表的长度范围为 [1, 100] 
// 0 <= node.val <= 9 
// 输入数据保证链表代表的数字无前导 0 
// 
//
// 
//
// 进阶：如果输入链表不能修改该如何处理？换句话说，不能对列表中的节点进行翻转。 
//
// 
//
// 
// 注意：本题与主站 445 题相同：https://leetcode-cn.com/problems/add-two-numbers-ii/ 
//
// Related Topics 栈 链表 数学 👍 104 👎 0


package main.java.com.zjb.leetcode.editor.cn;

import javax.swing.*;

//Java：两数相加 II
//创建时间：2024-04-02 14:35:36
public class PLCR025LMSNwu{
    public static void main(String[] args) {
        Solution solution = new PLCR025LMSNwu().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null , cur = null;
        int carry = 0;
        for(int sum,val;
        l1 != null || l2 != null;
        l1 = l1 == null ? null : l1.next,
        l2 = l2 == null ? null : l2.next)
        {
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            val = sum % 10;
            carry = sum / 10;
            if(ans == null){
                ans = cur = new ListNode(val);
            }else {
                cur.next = new ListNode(val);
                cur = cur.next;
            }
        }
        if (carry != 0){
            cur.next = new ListNode(carry);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}