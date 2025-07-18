public class LinearSearchex {

      public static void main(String[] args) {
            int[] arr = { 101, 23, 4, 5, 66, 73, 7, 54, 99 };

            int[][] array2D = new int[][] {
                        { 1, 2, 7474, 0, 3, 765 },
                        { 9, 8, 7, 595, 333 },
                        { 6 } };

            // System.out.println(Linsearch(arr, 99));
            // System.out.println(min(arr));
            int[] indx = SearchIn2DArray(array2D, 4);
            for (int i : indx) {
                  System.out.print(i + " ");
            }
      }

      // public static int Linsearch(int[] arr, int val) {
      // int index;
      // for (int i = 0; i < arr.length; i++) {

      // if (val == arr[i]) {
      // return index = i;

      // }

      // }
      // System.out.println("Array dose not contain " + val + " value");
      // return 0;
      // }

      // public static int min(int[] arr) {
      // int min = arr[0];
      // for (int i = 0; i < arr.length; i++) {
      // if (min > arr[i]) {
      // min = arr[i];
      // }
      // }
      // return min;
      // }

      public static int[] SearchIn2DArray(int[][] arr, int val) {

            for (int row = 0; row < arr.length; row++) {
                  for (int col = 0; col < arr[row].length; col++) {
                        if (val == arr[row][col]) {
                              // System.out.println("elemennt fount at index " + row + " " + col);
                              return new int[] { row, col };
                        }
                  }
            }
            return new int[] { -1, -1 };

      }
}
