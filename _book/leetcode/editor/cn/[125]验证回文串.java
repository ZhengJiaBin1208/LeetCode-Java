//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 373 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length();i++){
            char charAt = s.charAt(i);
            if (Character.isLetterOrDigit(charAt)){
                stringBuffer.append(charAt);
            }
        }
        StringBuffer s1 = new StringBuffer(stringBuffer).reverse();
        return s1.toString().equalsIgnoreCase(stringBuffer.toString());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
