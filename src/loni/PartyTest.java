package loni;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartyTest {

   @Test
   public void main() {
      assertEquals(24,Party.main(16, 30, 18, 30));
      assertEquals(12,Party.main(16, 00, 17, 03));
   }

}