
public class checkArrayIsSortedLin {
      // static int index = 0;

      public static void main(String[] args) {
            int[] arr = {
                        1, 2, 3
            };
            System.out.println(sorted(arr, 0));
      }

      // public static boolean check(int[] arr) {
      //       if (index < arr.length - 1) {
      //             if (arr[index] < arr[index + 1]) {
      //                   index++;
      //             } else {
      //                   return false;
      //             }
      //             return check(arr);
      //       } else {
      //             return true;
      //       }
      // }

      static boolean sorted(int[] arr, int index) {
            if (index == arr.length - 1) {
                  return true;
            }
            return arr[index] < arr[index + 1] && sorted(arr, index + 1);
      }


     


}