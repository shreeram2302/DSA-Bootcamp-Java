import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={7,6,5,3,2};
        sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    static void sort(int[] arr,int i,int e) {
        if (e==1){
            return;
        }

        if(i<e ){
            if (arr[i]>arr[i+1]){
                swap(arr,i,i+1);
                sort(arr,i+1,e);
            }
            else{
                sort(arr,0,e-1);
            }
        }
        else {
//            i=0;
//            e=-1;
            sort(arr,0,e);
        }
    }
}
