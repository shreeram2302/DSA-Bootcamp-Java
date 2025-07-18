package sorting;

import java.util.Arrays;

public class SelectionSort {
      public static void main(String[] args) {
            int[] arr = { 1, 67, 34, 0, 2, 4, 5, 9, 7 };
            Selection_Sort(arr);
            System.out.println(Arrays.toString(arr));
      }

      static void Selection_Sort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  int last = arr.length - i - 1;
                  int maxindex = maxIndex(arr, 0, last);
                  swap(arr, last, maxindex);
            }

      }

      static void swap(int[] arr, int last, int max) {
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
      }

      static int maxIndex(int[] arr, int start, int end) {
            int max = start;
            for (int i = start; i <= end; i++) {
                  if (arr[max] < arr[i]) {
                        max = i;

                  }
            }
            return max;
      }

      static int smallIndex(int[] arr, int start, int end) {
            int small = start;
            for (int i = start; i <= end; i++) {

                  if (arr[small] > arr[i]) {
                        small = i;
                  }
            }
            return small;
      }
}
