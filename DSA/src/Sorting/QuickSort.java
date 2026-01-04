package Sorting;

import java.util.Scanner;

public class QuickSort {

    private static int partition(int[] arr, int low, int high) {
        int pivot= arr[high];
        int i= (low-1);
         for(int j=low;j<high;j++)
         {
             if(arr[j]<=pivot)
             {
                 i++;
                 int temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
             }
         }
         int temp = pivot;
        arr[high]=arr[i+1];
         arr[i+1]=temp;

         return i+1;
    }

    private static void Sort(int[] arr, int low, int high) {
        if(low<high) {
            int p = partition(arr, low, high);
            Sort(arr, low, p - 1);
            Sort(arr, p + 1, high);
        }
    }
    public static void main(String[] args)
    {
        int arr[]=new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("----------------------Quick Sort---------------------");

        Sort(arr,0,arr.length-1);

        for (int x:arr)
            System.out.println(x);
    }




}
