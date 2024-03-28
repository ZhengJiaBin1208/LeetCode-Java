//给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。 
//
// 你必须设计并实现线性时间复杂度的算法且不使用额外空间来解决此问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,2,3,2]
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,0,1,0,1,99]
//输出：99
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 
// 
//
// Related Topics 位运算 数组 👍 1001 👎 0


package main.java.com.zjb.leetcode.editor.cn;
//Java：只出现一次的数字 II
//创建时间：2023-04-10 18:04:55
public class P137SingleNumberIi{
    public static void main(String[] args) {
        Solution solution = new P137SingleNumberIi().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {

        int a = 0,b = 0;

        for (int num : nums) {
            a ^= num&~b;
            b ^= num&~a;
        }

        return a;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}