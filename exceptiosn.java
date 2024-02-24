public class exceptiosn {
   void show(int a) {
      try {
         if (a == 0)
            throw new ArithmeticException("denominator is Zero");
         else {
            System.out.println("welcome to else part");
            int i = 56 / a;
            System.out.println(i);
         }
      } catch (Throwable e) { // throwable is the super class of error and Exception
         // why is throwable not used ??? cause it takes longer time to execute therefore for that reason we use the exceptions
         System.out.println(e);
      }}

      public static void main (String[]args){
         exceptiosn obj = new exceptiosn();
         obj.show(0);
         System.out.println("back to main");
      }

}
