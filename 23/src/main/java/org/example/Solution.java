package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;

        List<Integer> list = new ArrayList<Integer>();
        for(ListNode node:lists){
            while(node!=null){
                ListNode next = node.next;
                list.add(node.val);
                node = next;
            }
        }

        Collections.sort(list);
        ListNode root = new ListNode(0);
        ListNode pre = root;
        ListNode next = root;
        for(int i :list){
            ListNode node = new ListNode(i);
            pre.next = node;
            pre = node;
        }

        return root.next;
    }
}
