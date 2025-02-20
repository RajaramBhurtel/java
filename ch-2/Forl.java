public class Forl {

   public static void main(String args[]) {

      for(int x = 10; x < 20; x = x + 1) {
         if(x== 15) continue;
         System.out.print("value of x : " + x );
         System.out.print("\n");

      }
   }
}