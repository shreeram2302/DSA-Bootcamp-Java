package sorting;

import java.util.Arrays;

public class Bubblesort {
      public static void main(String[] args) {

            int[] arr = {
                        1, 9, 7, 5, 4, 77, 0, 2
            };
            Bubble_sort(arr);
            System.out.println(Arrays.toString(arr));

      }

      static void Bubble_sort(int[] a) {

            for (int i = 0; i < a.length; i++) {

                  for (int j = i; j < a.length; j++) {
                        if (a[i] > a[j]) {

                              int temp = a[i];
                              a[i] = a[j];
                              a[j] = temp;

                        }
                  }

            }

      }
}
