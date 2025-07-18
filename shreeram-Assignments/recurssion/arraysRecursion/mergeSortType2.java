import java.util.Arrays;

public class mergeSortType2 {
    public static void main(String[] args) {
        int[] arr = {16, 8, 101, 4, 7, 6, 2, 9};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }


    // 2nd type
    static void mergeSort(int[] arr, int s, int e) {
        int mid = (s + e) / 2;
        if (e - s == 1) {
            return;
        }
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        mergeArrays(arr,s,mid,e);
    }

    private static void mergeArrays(int[] arr, int s, int m ,int e) {
        int[] mix = new int[e- s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {

            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            j++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}