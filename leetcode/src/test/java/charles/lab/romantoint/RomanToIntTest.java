package charles.lab.romantoint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanToIntTest {
  RomanToInt ri = new RomanToInt();
  @Test
  void romainToInt_III() {
    int actual = ri.romainToInt("III");
    assertEquals(3, actual);
  }
  
  @Test
  void romainToInt_IV() {
    int actual = ri.romainToInt("IV");
    assertEquals(4, actual);
  }
  
  @Test
  void romainToInt_IX() {
    int actual = ri.romainToInt("IX");
    assertEquals(9, actual);
  }
  
  @Test
  void romainToInt_LVIII() {
    int actual = ri.romainToInt("LVIII");
    assertEquals(58, actual);
  }
  
  @Test
  void romainToInt_MCMXCIV() {
    int actual = ri.romainToInt("MCMXCIV");
    assertEquals(1994, actual);
  }

}
