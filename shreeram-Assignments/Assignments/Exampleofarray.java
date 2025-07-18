import java.util.ArrayList;
import java.util.Arrays;

public class Exampleofarray {
      public static void main(String[] args) {
            int[] arr = { 69, 34, 68, 2, 9, 64, 101 };

            ArrayList<Integer> list = new ArrayList<>();

            for (int a : arr) {
                  list.add(a);
            }

            // System.out.println("hiiii" + Arrays.toString(arr));

            // swap(arr, 0, 1);
            /// System.out.println(arr);
            // for (int a : arr) {
            // System.out.print(a + " ");

            // }
            // System.out.println();
            // System.out.println("Max number of Array is " + max(arr));

            // System.out.println("Max num is" + MaxInRange(
            // arr, 3, 7));

            int[] array2 = reverse(arr);

            for (int i : array2) {
                  System.out.print(i + " ");
            }
      }

      public static int[] reverse(int[] arr) {

            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                  swap(arr, start, end);
                  start++;
                  end--;

            }
            return arr;
      }

      public static void swap(int[] arr, int indx1, int indx2) {

            int temp = arr[indx1];
            arr[indx1] = arr[indx2];
            arr[indx2] = temp;

      }

      // public static int max(int[] arr) {
      // int max = arr[0];
      // for (int i = 1; i < arr.length; i++) {
      // if (max < arr[i]) {
      // max = arr[i];

      // }
      // }

      // return max;
      // }

      // public static int MaxInRange(int[] arr, int start, int end) {
      // int max = arr[start];
      // for (int i = start; i < end; i++) {
      // if (max < arr[i]) {
      // max = arr[i];
      // }
      // }
      // return max;
      // }

}
