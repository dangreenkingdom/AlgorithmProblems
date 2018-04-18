/*
请检查一个链表是否为回文链表。

进阶：
你能在 O(n) 的时间和 O(1) 的额外空间中做到吗？
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //Find middle
        ListNode mid = findMiddle(head);
        //Reverse and return right side
        ListNode right = reverse(mid.next);
        mid.next = null;
        ListNode left = head;
        while (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        //It's possible that left&&right both finishes; or just right finishes. Both cases are returnning true.
        return right == null;
    }
    
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode reversedList = dummy;
        while (head != null) {
            //store head.next for iteration usage
            ListNode temp = head.next;
            //insert head into the reservedList, at starting spot.
            head.next = reversedList.next;
            reversedList.next = head;
            //Move to next node
            head = temp;
        }
        return dummy.next;
    } 
}
