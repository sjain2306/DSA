package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args)
    {
//    Time Complexity:
//    Best Case: 𝑂(𝑛) (already sorted array).
//    Average Case: 𝑂(𝑛2).
//    Worst Case: 𝑂(𝑛2) (reverse sorted array).
//    Space Complexity: 𝑂(1) (in-place sorting).
//    Stability: Stable (equal elements retain their relative order).
//    int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("----------------------Insertion Sort----------------------");
        for (int i = 1; i < arr.length; i++) {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
        arr[j+1]=arr[j];
        j--;
        }
        arr[j+1]=key;
        }
        for (int x:arr)
            System.out.println(x);
    }
}
