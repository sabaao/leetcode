package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        Solution s = new Solution();
        s.reorderList(head1);

    }

    @Test
    public void mathTest()
    {
        System.out.println(Math.ceil((double)5/2));
    }

}
