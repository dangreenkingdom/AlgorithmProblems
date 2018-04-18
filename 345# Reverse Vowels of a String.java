/*
编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

示例 1：
给定 s = "hello", 返回 "holle".

示例 2：
给定 s = "leetcode", 返回 "leotcede".

注意:
元音字母不包括 "y".
*/

class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (vowels.contains(String.valueOf(arr[i])) && vowels.contains(String.valueOf(arr[j]))) {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            } else if (vowels.contains(String.valueOf(arr[i]))) {
                j--;
            } else if (vowels.contains(String.valueOf(arr[j]))) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}
