package loni;

import java.util.Arrays;

public class Toys {

   public static int main(int S, int s1, int s2, int s3){

      double[] array = new double[] {Math.floor(S/s1), Math.floor(S/s2), Math.floor(S/s3)};

      Arrays.sort(array);

      return (int) array[array.length-1];

   }

}

