package charles.lab.addtwonumbers;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode listnode = new ListNode(0);
    int carry = 0;
    ListNode curr = listnode;
    ListNode p1 = l1;
    ListNode p2 = l2;
    while(p1!=null || p2!=null) {
      int x = p1==null?0:p1.val;
      int y = p2==null?0:p2.val;
      
      int sum = carry + x + y;
      carry = sum/10;
      curr.next = new ListNode(sum %10);
      curr = curr.next;
      if(p1!=null) p1=p1.next;
      if(p2!=null) p2=p2.next;
    }
    if(carry>0) {
      curr.next = new ListNode(carry);
    }
    return listnode.next;
  }
}



