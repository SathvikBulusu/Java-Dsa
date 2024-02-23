public class zeooo {
// final keyword is the same every where,  can be applied to instance , local , class variables
public static void main(String[] args) {
    final int x=10;
   // x=x+3;// the x is not able to run as there is no instance variable that has been declaredd
  // x=5;// final variables cannot be given a value to assign as they are final, and const is deprecated
    System.out.println(x);
}
}