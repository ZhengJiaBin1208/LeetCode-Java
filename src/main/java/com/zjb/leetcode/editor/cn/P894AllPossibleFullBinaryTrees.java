//给你一个整数 n ，请你找出所有可能含 n 个节点的 真二叉树 ，并以列表形式返回。答案中每棵树的每个节点都必须符合 Node.val == 0 。 
//
// 答案的每个元素都是一棵真二叉树的根节点。你可以按 任意顺序 返回最终的真二叉树列表。 
//
// 真二叉树 是一类二叉树，树中每个节点恰好有 0 或 2 个子节点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：n = 7
//输出：[[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0
//,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
// 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：[[0,0,0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 
//
// Related Topics 树 递归 记忆化搜索 动态规划 二叉树 👍 368 👎 0


package main.java.com.zjb.leetcode.editor.cn;
//Java：所有可能的真二叉树
//创建时间：2024-04-02 14:15:06
public class P894AllPossibleFullBinaryTrees{
    public static void main(String[] args) {
        Solution solution = new P894AllPossibleFullBinaryTrees().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}