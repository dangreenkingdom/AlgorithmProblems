/*
Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
只要是两数之和的题，一定要记得用哈希表来做
*/
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s = new HashSet<Integer>();
        return helper(root, k, s);
    }
    boolean helper(TreeNode node, int k, HashSet<Integer> s){
        if (node == null) return false;
        int t = k - node.val;
        if (s.contains(t)) return true;
        s.add(node.val);
        return helper(node.left, k, s) || helper(node.right, k, s);
    }
}

//先按照中序遍历，也就是左-根-右的顺序对一棵二叉树进行扫描，得到的是一串按照从小到大排列的数据，然后再根据从开始的节点和末尾的节点的和，再两两夹逼来寻找是否这两个数的和满足给定的这个target值。

class Solution  
{  
    public boolean findTarget(TreeNode root,int k)  
    {  
        ArrayList<Integer> list = new ArrayList<>();  
        inOrder(root,list);  
        for(int i = 0,j = list.size() - 1 ; i < j;)              //根据首尾进行相加来夹逼，得到和是否为target值。  
        {  
            if((list.get(i) + list.get(j)) == k)  
                return true;  
            else if(list.get(i) + list.get(j) < k)  
                i++;  
            else  
                j--;  
        }  
        return false;  
    }  
    void inOrder(TreeNode root,ArrayList<Integer> list)   //递归方式来对一棵二叉树进行中序遍历  
    {  
        if(root == null)  
            return;  
        if(root.left != null)  
            inOrder(root.left,list);  
        list.add(root.val);  
        if(root.right != null)  
            inOrder(root.right,list);  
  
    }  
}  
