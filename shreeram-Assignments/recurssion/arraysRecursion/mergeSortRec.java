import java.util.Arrays;

public class mergeSortRec {
    public static void main(String[] args) {
        int[] arr = {16, 8, 101, 4, 7, 6, 2, 9};
        mergeSort2(arr, 0, arr.length);
//        System.out.println(Arrays.toString(mergerSort(arr)));

//        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergerSort(int[] arr){
        int mid=arr.length/2;
        if (arr.length==1){
            return arr;
        }

        int[] left=mergerSort(Arrays.copyOfRange(arr,0,mid));
        int[]  right=mergerSort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeMeth(left,right);
    }
    private static int[] mergeMeth(int[] fst ,int[] scd){
        int[] mix=new int[fst.length+scd.length];

        int i=0;
        int j=0;
        int k=0;


        while (i<fst.length && j<scd.length){
            if (fst[i]<scd[j]) {
                mix[k]=fst[i];
                i++;
            }else {
                mix[k]=scd[j];
                j++;
            }
            k++;
        }
        while (i<fst.length){
            mix[k]=fst[i];
            i++;
            k++;
        }
        while (j<scd.length)
        {
            mix[k]=scd[j];
            j++;
            k++;
        }

        return mix;
    }
//
//
//
//
//
//      Second type////////////





    static void mergeSort2(int[] arr, int s, int e){
        int mid=(s+e)/2;
        if (e-s==1){
            return;
        }

        mergeSort2(arr,s,mid);
        mergeSort2(arr,mid,e);

        mergeMeth2(arr,s,mid,e);
    }

    private static void mergeMeth2(int[] arr ,int s,int m,int e){
        int[] mix=new int[e-s];

        int i=s;
        int j=m;
        int k=0;


        while (i<m&& j<e){
            if (arr[i]<arr[j]) {
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }

    // [1,4,7,9]   [2,3,5,6]


}