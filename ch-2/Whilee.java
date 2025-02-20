public class Whilee {

   public static void main(String args[]) {
      int x = 10;

      while( true ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");

         if( x == 1000 )
         break;
      }
   }
}