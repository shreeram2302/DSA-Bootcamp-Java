public class amzonInterviewque {
      public static void main(String[] args) {
            // int[] arr = { -212, -94, -45, -1, 2, 3, 4, 5, 9, 11, 15, 16, 18, 19, 56, 67,
            // 78, 99 };
            // searchInfinityArray(arr, 15);
            int start = 0;
            int end = 1;
            System.out.println("end = end + (end - start + 1) * 2  " + (end = end + (end - start + 1) * 2));

      }

      public static void searchInfinityArray(int[] arr, int target) {
            int start = 0;
            int end = 2;
            while (target > arr[end]) {
                  int temp = end + 1;
                  end = end + (end - start + 1) * 2;
                  start = temp;
            }
            int a = binSearch(arr, target, start, end);

            System.out.println(a);

      }

      /// assending array
      public static int binSearch(int[] arr, int target, int start, int end) {

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
}
