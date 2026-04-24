package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2};
        System.out.println("before sort: "+ Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("after sort: "+ Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int l,int r) {
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            mergeArray(arr, l, mid, r);
        }
    }

    private static void mergeArray(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid+1;
        int k = l;
        int[] temp = new int[r-l+1];
        while (i<=mid && j<=r){
            if (arr[i]<arr[j]) temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=r){
            temp[k++]=arr[j++];
        }
        for (k=l; k<=r; k++) arr[k]=temp[k];
    }
}
