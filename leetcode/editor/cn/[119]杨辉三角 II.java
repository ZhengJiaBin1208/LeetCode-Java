//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 3
//输出: [1,3,3,1]
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组 
// 👍 281 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> integerList = new ArrayList<>();
            for (int j = 0; j <= i ; j++){
                if (j == 0 || j == i ){
                    integerList.add(1);
                } else {
                    integerList.add(listList.get(i-1).get(j-1)+listList.get(i-1).get(j));
                }
            }
            listList.add(integerList);
        }
        return listList.get(rowIndex);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
