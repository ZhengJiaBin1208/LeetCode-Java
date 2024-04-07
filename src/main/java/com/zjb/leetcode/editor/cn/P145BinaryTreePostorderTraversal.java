//给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1167 👎 0


package main.java.com.zjb.leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Java：二叉树的后序遍历
//创建时间：2024-04-03 17:45:05
public class P145BinaryTreePostorderTraversal{
    public static void main(String[] args) {
        Solution solution = new P145BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
//    private void postorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        postorder(root.left, res);
//        postorder(root.right, res);
//        res.add(root.val);
//    }

//    private void postorder(TreeNode root, List<Integer> res) {
//        if (root != null){
//           Stack<TreeNode> stack = new Stack<>();
//           Stack<TreeNode> collect = new Stack<>();
//           stack.push(root);
//           while (!stack.isEmpty()){
//               root = stack.pop();
//               collect.push(root);
//               if (root.left != null){
//                   stack.push(root.left);
//               }
//               if (root.right != null){
//                   stack.push(root.right);
//               }
//           }
//           while (!collect.isEmpty()){
//               res.add(collect.pop().val);
//           }
//        }
//    }

    private void postorder(TreeNode root, List<Integer> res) {
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode collect = stack.peek();
                if (collect.left != null
                    && root != collect.left
                    && root != collect.right){
                    stack.push(collect.left);
                } else if (collect.right != null
                    && root != collect.right){
                    stack.push(collect.right);
                }else {
                    res.add(collect.val);
                    root = stack.pop();
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}