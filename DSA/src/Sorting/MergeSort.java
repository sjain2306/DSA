package Sorting;

import java.util.Scanner;

public class MergeSort {

    private static void Sort(int[] arr, int l, int r) {
        if(l<r)
        {
            int mid = l+(r-l)/2;

            Sort(arr,l,mid);
            Sort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int L[]= new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++)
            L[i]=arr[i+l];
        for(int i=0;i<n2;i++)
            R[i]=arr[mid+1+i];

        int i=0,j=0;
        int k=l;
        while(i<n1 && j< n2)
        {
            if(L[i]<=R[j])
            {
                arr[k++]=L[i++];
            } else {
                arr[k++]=R[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }


    }
    
    public static void main(String[] args)
    {
        int arr[]=new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("----------------------Merge Sort---------------------");

        Sort(arr,0,arr.length-1);

        for (int x:arr)
            System.out.println(x);
    }


}
