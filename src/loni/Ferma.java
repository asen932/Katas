package loni;

public class Ferma {

   public static int main(String args) {

      int a = Integer.parseInt(args.substring(0, 2));

      int b = Integer.parseInt(args.substring(2, 4));

      int res = (a * 4) + (b * 2);

      return res;

   }

}
