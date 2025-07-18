public class SearchInMountainArr {
      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 2, 1 };
            int target = 4;
            int peak = MountainSearch(arr);
            System.out.println("Peak of mountain at index " + peak);
            int A = BinAscSearch(arr, target, peak);

            int D = BinDesSearch(arr, target, peak);
            // System.out.println(D);

            if (A < D && A != -1) {
                  System.out.println("Element index in ASC  " + A);
            } else if (D < A && D != -1) {
                  System.out.println("Element index in DSE  " + D);
            } else {
                  System.out.println("Not found");
            }

      }

      public static int MountainSearch(int[] arr) {
            int PeakIndex = 0, end = arr.length - 1;
            while (PeakIndex < end) {
                  int mid = PeakIndex + (end - PeakIndex) / 2;
                  if (arr[mid] > arr[mid + 1]) {
                        end = mid;
                  } else {
                        PeakIndex = mid + 1;
                  }

            }
            return PeakIndex;
      }

      public static int BinAscSearch(int[] arr, int target, int end1) {
            int start = 0;
            int end = end1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target > arr[mid]) {
                        start = mid + 1;
                  } else if (target < arr[mid]) {
                        end = mid - 1;
                  } else {
                        return mid;
                  }
            }

            return -1;
      }

      public static int BinDesSearch(int[] arr, int target, int start) {
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target > arr[mid]) {
                        end = mid - 1;
                  } else if (target < arr[mid]) {
                        start = mid + 1;

                  } else {
                        return mid;
                  }
            }
            return -1;
      }
}
