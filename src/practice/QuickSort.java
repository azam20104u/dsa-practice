package practice;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        System.out.println("before sort: "+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("after sort: "+Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int h) {
        if (l<h){
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i<j){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;
            if (i<j){
                swapElement(arr,i,j);
            }
        }
        swapElement(arr,l,j);
        return j;
    }

    private static void swapElement(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
