/*
给定一个 32 位有符号整数，将整数中的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
*/

class Solution {
    public int reverse(int x) { // 模十取余
        int res = 0; 
        while (x != 0) {
            int temp = res * 10 + x % 10;
            x = x / 10;
            if (temp / 10 != res) {
                res = 0;
                break;
            }
            res = temp;
        }
        return res;
    }
}

class Solution {
    public int reverse(int x) { // 模十取余
        long rst = 0;
        while (x != 0) {
            rst = rst * 10 + x % 10;
            x /= 10;
            if (rst > Integer.MAX_VALUE || rst < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) rst;
     }
}
