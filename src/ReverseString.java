public class ReverseString {

   public static void main(String str) {

      System.out.println("Enter string to reverse:");

      String reverse = "";

      for(int i = str.length() - 1; i >= 0; i--)
      {
         reverse = reverse + str.charAt(i);
      }

      System.out.println("Reversed string is:");
      System.out.println(reverse);
   }

}


