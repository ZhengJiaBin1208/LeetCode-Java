//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组 
// 👍 483 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return listList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
