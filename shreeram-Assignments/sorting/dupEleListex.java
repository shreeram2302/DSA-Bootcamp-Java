package sorting;

import java.util.*;;

public class dupEleListex {
      public static void main(String[] args) {
            int[] arr = { 1, 5, 6, 2, 5, 6, 4, 3 };
            List<Integer> i = duplicate(arr);
            System.out.println("Duplicate Elements...");
            System.out.println(i);

      }

      static List<Integer> duplicate(int[] arr) {
            List<Integer> numlist = new ArrayList<>();
            int i = 0;

            while (i < arr.length) {

                  int correct = arr[i] - 1;
                  if (arr[i] < arr.length && arr[i] != arr[correct]) {

                        swap(arr, i, correct);
                  } else {
                        i++;
                  }

            }
            System.out.println(" list.....");
            System.out.println(Arrays.toString(arr));

            for (int j = 0; j < arr.length; j++) {
                  if (arr[j] != j + 1) {

                        numlist.add(arr[j]);

                  }
            }

            // numlist.add(arr.length);
            return numlist;
      }

      static void swap(int[] arr, int ind1, int ind2) {
            int temp = arr[ind1];

            arr[ind1] = arr[ind2];

            arr[ind2] = temp;

      }

}
