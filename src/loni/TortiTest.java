package loni;

import org.junit.Test;

import static org.junit.Assert.*;

public class TortiTest {

   @Test
   public void main() {
      assertEquals(5,Torti.main(20,4));
      assertEquals(4,Torti.main(23,7));
      assertEquals(1,Torti.main(23, 50));
   }
}