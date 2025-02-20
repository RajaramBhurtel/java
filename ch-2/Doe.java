public class Doe {

   public static void main(String args[]) {
      int x = 10;

      do {
         System.out.println("value of x : " + x );
         x++;

         if( x== 120 ) 
         return;
      }while( true );
   }
}