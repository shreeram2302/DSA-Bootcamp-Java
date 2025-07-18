package recurssion;

public class pallendrome {

      static int sum = 0;

      public static void main(String[] args) {
            int a = 123521;
            // System.out.println(pallCheck(a));
            // pallCheck(a);
            // System.out.println(sum);

      }

      static boolean pallCheck(int n) {

            if (n % 10 == 0) {
                  return true;
            }

            int rem = n % 10;
            sum = sum * 10 + rem;
            pallCheck(n / 10);

            return n == sum;
      }
}
