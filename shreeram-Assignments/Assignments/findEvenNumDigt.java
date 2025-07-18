
//problem no 1
// split array into numbers 
//check the number of digits contain by each element in Array ;
//display number of digits is even or not 

public class findEvenNumDigt {
      public static void main(String[] args) {
            int arr[] = { 2, 1775, 95857, 876, 7777, 23345, 565, 696 };

            // ChkEvenDigit(arr);
            System.out.println(digit2(-184));

      }

      public static void ChkEvenDigit(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  int val = arr[i];
                  int dig = digit(val);
                  boolean res = isEven(dig);
                  System.out.println(" The Value " + arr[i] + " at index " + i + " is conttain " + dig + " digits "
                              + " and is it even ? --->" + res);
            }
      }

      public static boolean isEven(int n) {

            return n % 2 == 0;
      }

      public static int digit(int val) {

            if (val < 0) {
                  val = val * -1;
            }
            int count = 0;
            while (val > 0) {

                  val = val / 10;
                  count++;
            }
            return count;
      }

      public static int digit2(int val) {
            if (val < 0) {
                  val = val * -1;
            }
            return (int) (Math.log10(val)) + 1;
      }


      
                


}


