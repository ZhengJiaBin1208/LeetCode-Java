//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表 
// 👍 1832 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        /**
         * 解法一: 排序之后比较不相同的第一个数字,即为数字
         */
//        Arrays.sort(nums);
//        if(nums.length == 1){
//            return nums[0];
//        }
//        for (int i = 0; i < nums.length -1; i += 2) {
//            if (nums[i] != nums[i+1]){
//                return nums[i];
//            }
//        }
//        return nums[nums.length-1];
        /**
         *  解法二:位运算亦或，亦或相同为0，不同为本身，即全部亦或之后，最后的数值即为不相同的数字
         */
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
