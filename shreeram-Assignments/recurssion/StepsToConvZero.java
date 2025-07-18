package recurssion;

public class StepsToConvZero {
      static int cnt = 0;

      public static void main(String[] args) {
            // System.out.println(nOfSteps(10));
            System.out.println(5 / 2.5);

      }

      static int nOfSteps(int n) {

            if (n == 1) {
                  cnt++;
                  return n - 1;
            } else if (n == 0) {
                  return 0;
            } else {
                  cnt++;
                  n = nOfSteps(n / 2);
            }
            return cnt;

      }
}
