import java.util.Arrays;

public class matrixBinSearch {
      public static void main(String[] args) {
            int[][] matrix = {
                        { 1, 3, 5, 7 },
                        { 2, 4, 6, 8 },
                        { 3, 6, 9, 12 },
                        { 4, 8, 12, 16 }
            };
            // int[] ans = Search(matrix, 16);
            // System.out.println(Arrays.toString(Search(matrix, 12)));

            int[][] StrictMatrix = {
                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 }
            };
            System.out.println(Arrays.toString(StrictSearch(matrix, 1)));

      }

      static int[] Search(int[][] matrix, int target) {
            int row = 0;
            int col = matrix.length - 1;
            while (row < matrix.length && col >= 0) {
                  if (matrix[row][col] == target) {
                        return new int[] { row, col };
                  } else if (target < matrix[row][col]) {
                        col--;
                  } else {
                        row++;
                  }
            }
            return new int[] { -1, -1 };
      }

      static int[] StrictSearch(int[][] matrix, int target) {
            int row = 0;
            int col = matrix.length - 1;
            while (row < matrix.length && col >= 0) {
                  if (matrix[row][col] == target) {
                        return new int[] { row, col };
                  } else if (target > matrix[row][col]) {
                        row++;
                  } else {
                        col--;
                  }
            }
            return new int[] { -1, -1 };
      }

}
