package recurssion;

public class reversenum {
      static int sum = 0;

      public static void main(String[] args) {
            reverseNumEx(1452);
            // System.out.println(sum);

            System.out.println(reverseNumEx1(1452));
      }

      static void reverseNumEx(int a) {

            if (a < 1) {
                  return;
            }
            int rem = a % 10;
            sum = sum * 10 + rem;
            reverseNumEx(a / 10);

      }

      static int reverseNumEx1(int a) {

            int digit = (int) Math.log10(a) + 1;
            return helper(a, digit);
      }

      private static int helper(int a, int digit) {
            if (a % 10 == a) {
                  return a;
            }
            int rem = a % 10;
            return rem * (int) (Math.pow(10, digit - 1)) + helper(a / 10, digit - 1);

      }
}
