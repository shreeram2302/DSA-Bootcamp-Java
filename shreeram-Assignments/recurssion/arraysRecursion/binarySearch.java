public class binarySearch {
      // static int mid = 0;

      public static void main(String[] args) {
            // rotated binary rearch
            int[] rotated = { 6, 7, 8, 9, 10, 1, 2, 3, 4 };
            int[] arr = { 1, 2, 3, 5, 7, 9 };
            int[] arrdec = { 9, 7, 6, 4, 3, 1, 0 };

            System.out.println(BinSearchRec(rotated, 1, 0,rotated.length-1 ));

            // System.out.println(binaryAsc(arr, 7, 0, arr.length - 1));
            // System.out.println(binaryDesc(arrdec, 7, 0, arr.length - 1));
            // System.out.println(searchRotated(rotated, 9, 0, arr.length - 1));
      }

      //
      // Rotated array Que

      static int BinSearchRec(int[] arr, int target, int s, int e) {

            if (s > e) {
                  return -1;

            }
            int mid = s + (e - s + 1) / 2;

            if (target == arr[mid]) {
                  return mid;
            }

            if (arr[s] <= arr[mid]) {

                  if (target <= arr[mid] && target >= arr[s]) {
                        return BinSearchRec(arr, target, s, mid - 1);

                  } else {
                        return BinSearchRec(arr, target, mid + 1, e);
                  }
            } else {
                  if (target >= arr[mid] && target <= arr[e]) {
                        return BinSearchRec(arr, target, mid + 1, e);
                  } else {
                        return BinSearchRec(arr, target, s, mid - 1);
                  }
            }
      }

      // static int BinSearchRec(int[] arr, int target, int s, int e) {

      // if (s > e) {
      // return -1;

      // }
      // int mid = s + (e - s + 1) / 2;

      // if (target == arr[mid]) {
      // return mid;
      // }

      // if (arr[s] <= arr[mid]) {

      // if (target <= arr[mid] && target >= arr[s]) {
      // return BinSearchRec(arr, target, s, mid - 1);

      // } else {
      // return BinSearchRec(arr, target, mid + 1, e);
      // }
      // }

      // if (target >= arr[mid] && target <= arr[e]) {
      // return BinSearchRec(arr, target, mid + 1, e);
      // }
      // return BinSearchRec(arr, target, s, mid - 1);

      // }

}