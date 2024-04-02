//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 10503 👎 0


package main.java.com.zjb.leetcode.editor.cn;

import javax.swing.*;

//Java：两数相加
//创建时间：2024-04-02 14:37:16
public class P2AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
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
    /**
     * 给定两个非空链表表示的非负整数，它们的每个节点都代表一个数字的位数，将两个数相加并返回一个新的链表表示结果。
     *
     * @param l1 第一个链表，表示第一个非负整数。
     * @param l2 第二个链表，表示第二个非负整数。
     * @return 返回一个新的链表，表示两个数相加的结果。
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null, cur = null; // 初始化结果链表的头和当前节点
        int carry = 0; // 进位初始化为0

        // 遍历两个链表，直到两者都为null
        for (int sum, val; l1 != null || l2 != null; l1 = l1 == null ? null : l1.next,
                l2 = l2 == null ? null : l2.next) {
            // 计算当前位的值和进位
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            val = sum % 10; // 当前位的值
            carry = sum / 10; // 进位值

            // 如果结果链表为空，初始化结果链表
            if (ans == null) {
                ans = cur = new ListNode(val);
            } else {
                // 否则，链接新节点到结果链表的尾部
                cur.next = new ListNode(val);
                cur = cur.next;
            }
        }

        // 如果最后还有进位，添加一个新节点处理进位
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return ans; // 返回结果链表的头
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}