package loni;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FermaTest {

   @Test
   public void test(){
      Assert.assertEquals(166, Ferma.main("3121"));

   }

   }