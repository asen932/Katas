package loni;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class ToysTest {

   @Test
   public void test(){

      Assert.assertEquals(17, Toys.main(230, 25, 13, 48));

   }

}
