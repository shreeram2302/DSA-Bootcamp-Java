package sorting;

import java.util.Arrays;

public class insertionSort {
      public static void main(String[] args) {
            int[] arr = { 1, 67, 34, 0, 2, 4, 5, 9, 7 };
            Insertion_Sort(arr);
            System.out.println(Arrays.toString(arr));

      }

      static void Insertion_Sort(int[] arr) {

            for (int i = 0; i < arr.length-1; i++) {

                  // System.out.println(i);
                  for (int j = i+1; j > 0; j--) {
                        // System.out.println("Hello");
                        if (arr[j]<arr[j-1]) {
                              swap(arr, j-1, j);
                        } else {
                              break;
                        }
                  }
            }
      }

      static void swap(int[] arr, int last, int max) {
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
      }
}