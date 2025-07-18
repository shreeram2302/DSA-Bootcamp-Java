public class peakOfMountain {
      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 6 ,7, 5, 4, 3, 2, 1 };

            System.out.println(Peak_num(arr));

      }

      public static int Peak_num(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                  int mid = start + (end - start) / 2;
                  System.out.println("hii");

                  if (arr[mid] > arr[mid + 1]) {
                        end = mid;
                  } else {
                        start = mid + 1;
                  }

            }
            return start;
      }

}
