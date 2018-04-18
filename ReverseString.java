/*
请编写一个函数，其功能是将输入的字符串反转过来。

示例：

输入：s = "hello"
返回："olleh"
*/
class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
            char temp = arr[l];  
            arr[l++] = arr[r];  
            arr[r--] = temp;
        }
        return String.valueOf(arr);
    }
}
