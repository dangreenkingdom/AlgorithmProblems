/*
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" 
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
*/



class Solution {
    public String reverseWords(String s) {
        /*String[] revSplit = s.split(" ");
        String revString = "";
        for (int i = 0; i < revSplit.length; i++) {
            revSplit[i] = new StringBuffer(revSplit[i]).reverse().toString();
            revString = revString +" " +revSplit[i];
        }
        return revString.trim();*/
        String[] str =s.split(" ");  
        String ns ="" ;  
        for (int i = 0; i < str.length; i++) {  
            char[] c = new char[str[i].length()];  
            for (int j = 0; j < str[i].length(); j++) {  
                c[j]=str[i].charAt(str[i].length()-j-1);  
            }  
            if(i!=str.length-1) {  
                ns+=String.valueOf(c)+" ";  
            }else {  
                ns+=String.valueOf(c);  
            }  
        }  
        return ns;  
    }  
}
