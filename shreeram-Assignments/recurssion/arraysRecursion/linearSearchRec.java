import java.util.*;

public class linearSearchRec {

      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 3, 3, 4, 8, 76, 5 };
            // ArrayList list = new ArrayList<>();
            // System.out.println(linerSearchRecursion(arr, 0, 3,list).toString());

            System.out.println(linerSearchRecursion2(arr, 0, 3));
      }

      // static int linerSearchRecursion(int[] arr, int index, int target) {
      // if (arr[index] == target) {
      // return index;
      // } else if (index == arr.length - 1) {
      // return -1;
      // }
      // return linerSearchRecursion(arr, index + 1, target);
      // }

      // return indexces of elemnt

      // static ArrayList<Integer> linerSearchRecursion(int[] arr, int index, int
      // target, ArrayList<Integer> list) {

      // if (index == arr.length) {
      // return list;
      // }

      // if (arr[index] == target) {
      // list.add(index);
      // }

      // return linerSearchRecursion(arr, index + 1, target, list);

      // }

      static ArrayList<Integer> linerSearchRecursion2(int[] arr, int index, int target) {
            ArrayList<Integer> list = new ArrayList<>();
            if (index == arr.length) {
                  return list;
            }

            if (arr[index] == target) {
                  list.add(index);
            }

            ArrayList belowitems = linerSearchRecursion2(arr, index + 1, target);
            list.addAll(belowitems);
            return list;
      }

}
