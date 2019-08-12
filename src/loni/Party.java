package loni;

public class Party {

   public static int main(int hb, int mb, int he, int me){

      int minutes = (60 * (he - hb)) + me - mb;

      return minutes / 5;

   }
}
