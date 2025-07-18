import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[]  arr={16,8,101,4,7,6,2,9};

        selection_sortRec(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
static void selection_sortRec(int[] arr,int j,int last){
    if(j>last){
        return;
    }
    if (j==last){
        j=0;
        last=last-1;
    }

    if (arr[j] > arr[last]){
        swap(arr,j,last);

        selection_sortRec(arr,j+1,last);
    }
    else{
        selection_sortRec(arr,j+1,last);
    }
    }


}