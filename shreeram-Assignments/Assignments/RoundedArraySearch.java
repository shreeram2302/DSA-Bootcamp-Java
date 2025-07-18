public class RoundedArraySearch {
      public static void main(String[] args) {

            int[] arr = { 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 };
            int a = Findpiviot(arr);
           
            System.out.println(a);
            // int b = Search(arr, 3, a);
            // System.out.println(b);

      }

      static int Search(int[] arr, int target, int pivot) {
            int start = 0, end = arr.length - 1;

            if (arr[pivot] == -1) {
                  return binSearch(arr, target, start, end);
            }

            while (start < end) {
                  // int mid = start + (end - start) / 2;
                  if (target == arr[pivot]) {
                        return pivot;
                  } else if (target < arr[start]) {
                        return binSearch(arr, target, pivot + 1, end);
                  } else {

                        return binSearch(arr, target, start, pivot - 1);
                  }
            }

            return -1;
      }

      public static int binSearch(int[] arr, int target, int s, int e) {
            int start = s;
            int end = e;

            while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (target < arr[mid]) {
                        end = mid - 1;
                  } else if (target > arr[mid]) {
                        start = mid + 1;
                  } else {
                        return mid;
                  }

            }

            return -1;
      }

      static int Findpiviot(int[] arr) {
            int start = 0, end = arr.length - 1;
            int mid = start + (end - start) / 2;

            while (start <= end) {
                  if (mid < end && arr[mid] > arr[mid + 1]) {
                        return mid;
                  } else if (mid > start && arr[mid] < arr[mid - 1]) {
                        return mid - 1;
                  } else if (arr[start] >= arr[mid]) {
                        end = mid - 1;
                  } else {
                        start = mid + 1;
                  }

            }
            return -1;

      }
}
