package recurssion;

public class countZeroesinNum {

      static int cnt = 0;

      public static void main(String[] args) {

            countingZero(10070);
            System.out.println(cnt);
            // System.out.println(1000%10);

      }

      static int countingZero(int n) {

            if (n == 0) {
                  return n;
            }
            int rem = n % 10;
            if (rem == 0) {
                  cnt++;
                  return countingZero(n / 10);
            } else {
                  return countingZero(n / 10);
            }
      }
}
