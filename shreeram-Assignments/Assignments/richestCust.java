/**
 * finding richestCustomer
 */
public class richestCust {
      public static void main(String[] args) {
            int[][] arr1 = {
                        { 1, 332, 4, 5 },
                        { 57, 707, 45, 8 } };

            Greater(arr1);

      }

      public static void Greater(int[][] arr) {
            int sum1 = 0, sum2 = 0;
            for (int r = 0; r < arr.length; r++) {
                  for (int c = 0; c < arr[r].length; c++) {
                        if (r == 0) {
                              sum1 = sum1 + arr[r][c];
                        } else {

                              sum2 = sum2 + arr[r][c];
                        }
                  }
            }

            System.out.println(sum1 + "  " + sum2);
      }
}