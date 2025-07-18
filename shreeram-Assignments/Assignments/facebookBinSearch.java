/**
 * facebook que bin search
 */
public class facebookBinSearch {
      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 3, 3, 3, 3, 4, 4, 5, 7, 8, 8 };
            SearchInRange(arr, 11);
      }

      public static void SearchInRange(int[] arr, int target) {
            int[] ans = { -1, -1 };
            ans[0] = search(arr, target, true);
            if (ans[0] != -1) {
                  ans[1] = search(arr, target, false);
            }
            for (int i : ans) {

                  System.out.print(i + " ");
            }
      }

      // assending array
      public static int search(int[] arr, int target, boolean Sstartindex) {
            int start = 0;
            int end = arr.length - 1;
            int ans = -1;

            while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (target < arr[mid]) {
                        end = mid - 1;
                  } else if (target > arr[mid]) {
                        start = mid + 1;
                  } else {
                        ans = mid;
                        if (Sstartindex) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }

                  }

            }

            return ans;
      }

}