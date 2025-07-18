package sorting;

import java.util.*;

public class findDuplicateNum {
      public static void main(String[] args) {
            int[] arr = { 5, 3, 5, 4, 1, 2, 1, 3 };

            int[] arr2 = { 1, 2, 5, 3, 4, 5 };
            /*
             * {1,2,4,3,5,5}3
             * {1,2,3,4,5,5} ind 5 corre =4
             * 
             * arr[i]=5 != i=5+1=5 right
             * correct =4
             * if arr[i] != arr[correct] -> 5!=arr[4]=5 wrong so else{
             * ret arr[i] -> 5}
             * {}
             */

            int dup = duplicate(arr2);
            System.out.println(Arrays.toString(arr2));
            System.out.println("duplicate number is " + dup);
      }

      public static int duplicate(int[] arr) {
            int i = 0;
            
            while (i < arr.length) {
                  if (arr[i] != i + 1) {

                        int correct = arr[i] - 1;

                        if (arr[i] != arr[correct]) {
                              swap(arr, i, correct);
                        } else {
                              return arr[i];

                        }
                  } else {
                        i++;
                  }

            }
            return arr[arr.length - 1];
      }

      static void swap(int[] arr, int ind1, int ind2) {
            int temp = arr[ind1];

            arr[ind1] = arr[ind2];

            arr[ind2] = temp;

      }

      // public static int duplicate(int[] arr) {
      // int i = 0;
      // while (i < arr.length) {
      // int correct = arr[i] - 1;

      // if (arr[i] != arr[correct]) {
      // swap(arr, i, correct);
      // } else {
      // i++;
      // }
      // }
      // return arr[arr.length - 1];
      // }
}
