package charles.lab.addtwonumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
  private AddTwoNumbers at = new AddTwoNumbers();
  
  public String convertToStr(ListNode ln) {
    StringBuilder sb = new StringBuilder();
    ListNode curr = ln;
    while(curr!=null) {
      sb.append(String.valueOf(curr.val));
      curr = curr.next;
    }
    return sb.toString();
  }
  
   @Test
  void addTwoNumbers_1_2() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode actual = at.addTwoNumbers(l1, l2);
    assertEquals("3", convertToStr(actual));
  }

   @Test
  void addTwoNumbers_1_11() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(1);
    ListNode actual = at.addTwoNumbers(l1, l2);
    assertEquals("21", convertToStr(actual));
  }

   @Test
  void addTwoNumbers_243_564() {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(3);
    l1.next = l2;
    l2.next = l3;

    ListNode a1 = new ListNode(5);
    ListNode a2 = new ListNode(6);
    ListNode a3 = new ListNode(4);
    a1.next = a2;
    a2.next = a3;
    ListNode actual = at.addTwoNumbers(l1, a1);
    assertEquals("708", convertToStr(actual));
  }

   @Test
  void addTwoNumbers_5_5() {
    ListNode l1 = new ListNode(5);
    ListNode a1 = new ListNode(5);
    ListNode actual = at.addTwoNumbers(l1, a1);
    assertEquals("01", convertToStr(actual));
  }

  @Test
  void addTwoNumbers_18_0() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(8);
    l1.next= l2;
    ListNode a1 = new ListNode(0);

    ListNode actual = at.addTwoNumbers(l1, a1);
    assertEquals("18", convertToStr(actual));
  }
}
