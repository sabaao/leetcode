package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public void reorderList(ListNode head) {
        if(head==null) return;

        ListNode node = head;
        Deque<ListNode> que = new ArrayDeque<ListNode>();
        int count = 0;
        while(node!=null){
            que.add(node);
            node = node.next;
            count++;
        }

        ListNode result = new ListNode(1);
        ListNode resultTmp = result;
        for(int i =0;i<count;i++){

            if(i%2==0){
                resultTmp.next = que.getFirst();
                que.removeFirst();
            }else{
                resultTmp.next = que.getLast();
                que.removeLast();
            }
            resultTmp = resultTmp.next;
        }
        resultTmp.next = null;

        head = result.next;
    }
}
