package sorting;

import java.util.*;

public class cycleSort {
      public static void main(String[] args) {

            int[] arr = { 1, 5, 2, 4, 3 };
            // Cycle_Sort(arr);
            // System.out.println(Arrays.toString(arr));

            int[] arrMissing = { 6,4, 2, 0, 1 };
            List<Integer> miss = MissingNum(arrMissing);
            System.out.println(Arrays.toString(arrMissing));
            System.out.println(miss);
      }

      static List<Integer> MissingNum(int[] arr) {
            List<Integer> numlist = new ArrayList<>();
            int i = 0;

            while (i < arr.length) {

                  int correct = arr[i];
                  if (arr[i] < arr.length && arr[i] != arr[correct]) {

                        swap(arr, i, correct);
                  } else {
                        i++;
                  }

            }

            for (int j = 0; j < arr.length; j++) {
                  if (arr[j] != j) {

                        numlist.add(j);

                  }
            }

            // numlist.add(arr.length);
            return numlist;
      }

      static void Cycle_Sort(int[] arr) {
            int i = 0;
            while (i < arr.length - 1) {
                  int correct = arr[i] - 1;

                  if (arr[i] != arr[correct]) {
                        swap(arr, i, correct);
                  } else {
                        i++;
                  }
            }
      }

      static void swap(int[] arr, int ind1, int ind2) {
            int temp = arr[ind1];

            arr[ind1] = arr[ind2];

            arr[ind2] = temp;

      }

}
