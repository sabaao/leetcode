package org.example;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode node = head;
        ListNode pre = null;
        while(node!=null){
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
