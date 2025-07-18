import java.util.*;

public class binarysearchex {
      public static void main(String[] args) {
            int[] arr = { -212, -94, -45, -1, 2, 3, 4, 5, 9, 11, 15, 16, 18, 19, 56, 67, 78, 99 };
            // int[] arr2 = new int[] { 16 };
            // int[] arr = { 99, 98, 77, 55, 33, 12, -12, -18, -99, 101 };

            // char[] charArr = { 'c', 'h', 'o', 'p', 's', 'u', 'z' };
            // ceilingChar(charArr, 'r');

            // System.out.println(Arrays.asList(arr));
            // int i = arr.length - 1;
            // int j = 0;
            // while (i >= 0) {
            // arr2[j] = arr[i];
            // i--;
            // j++;
            // }
            // System.out.println(Arrays.asList(arr2));
            // ceilingbin(arr, 100);
            // int target = 98;
            // int ans = binSearch(arr, target);
            // System.out.println(ans);

            int a = binSearchUsingRecurssion(arr, 9, 0, arr.length - 1);
            System.out.println(a);
      }

      public static void ceilingChar(char[] arr, char target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target > arr[mid]) {
                        start = mid + 1;

                  } else if (target < arr[mid]) {
                        end = mid - 1;

                  }
            }
            // System.out.println("Char At index " + start);
            System.out.println(arr[start % arr.length]);// for floor arr[end] done
      }

      // assending array
      // public static int binSearch(int[] arr, int target) {
      // int start = 0;
      // int end = arr.length - 1;

      // while (start <= end) {
      // int mid = start + (end - start) / 2;

      // if (target < arr[mid]) {
      // end = mid - 1;
      // } else if (target > arr[mid]) {
      // start = mid + 1;
      // } else {
      // return mid;
      // }

      // }

      // return -1;
      // }

      public static void ceilingbin(int[] arr, int target) throws ArrayIndexOutOfBoundsException {
            int start = 0, end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target > arr[mid]) {
                        start = mid + 1;

                  } else if (target < arr[mid]) {
                        end = mid - 1;

                  } else {
                        System.out.println(arr[mid]);
                  }
            }
            if (start >= arr.length) {
                  System.out.println("sorry last index");
            } else {
                  System.out.println(arr[start]);// for floor arr[end] done
            }
      }

      // decending Array search
      // public static int binSearch(int[] arr, int target) {
      // int start = 0;
      // int end = arr.length - 1;

      // while (start <= end) {
      // int mid = start + (end - start) / 2;

      // if (target < arr[mid]) {
      // start = mid + 1;
      // } else if (target > arr[mid]) {
      // end = mid - 1;
      // } else {
      // return mid;
      // }
      // }

      // return -1;
      // }

      // assending array

      public static int binSearchUsingRecurssion(int[] arr, int target, int s, int e) {

            int mid = s + (e - s) / 2;

            if (target < arr[mid]) {
                  e = mid - 1;
                  binSearchUsingRecurssion(arr, target, s, e);
            } else if (target > arr[mid]) {
                  s = mid + 1;
                  binSearchUsingRecurssion(arr, target, s, e);
            } else {
                  return mid;
            }

            return -1;
      }

}
