package charles.lab.reverse.integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
  private ReverseInteger r = new ReverseInteger();
  @Test
  void reverse_123() {
    int actual = r.reverse(123);
    assertEquals(321, actual);
  }
  
  @Test
  void reverse_native_123() {
    int actual = r.reverse(-123);
    assertEquals(-321, actual);
  }
  
  @Test
  void reverse_120() {
    int actual = r.reverse(120);
    assertEquals(21, actual);
  }
  
  @Test
  void reverse_native_12345() {
    int actual = r.reverse(-12345);
    assertEquals(-54321, actual);
  }
  
  
}
