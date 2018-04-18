/*
给定一个字符串，确定它是否是回文，只考虑字母数字字符和忽略大小写。

例如：
"A man, a plan, a canal: Panama" 是回文字符串。
"race a car" 不是回文字符串。

注意:
你有考虑过这个字符串可能是空的吗？ 在面试中这是一个很好的问题。

针对此题目，我们将空字符串定义为有效的回文字符串。
*/
/*
recap:
Use regular expression [^a-zA-Z0-9] to replace all non-alphanumeric chars with ""
*/
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        final String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
