package recurssion;

public class first {
      static int sum;

      public static void main(String[] args) {
            // funDecending(5);
            System.out.println(factorial(6));
      }

      
      
      static int factorial(int a) {

            if (a < 1) {
                  return 1;
            }
            return a * factorial(a - 1);

      }

      static void funDecending(int a) {
            System.out.print(a + " ");
            if (a > 0) {
                  funDecending(a - 1);
            }
            // System.out.println(a+" ");

      }

      public static void funAsssending(int a) {
            System.out.print(a + " ");
            if (a < 5) {
                  funAsssending(a + 1);
            }
      }
}
