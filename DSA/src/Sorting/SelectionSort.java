package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args)
    {
//        Time Complexity:
//        Best Case:𝑂(𝑛2)
//        Average Case: 𝑂(𝑛2)
//        Worst Case: 𝑂(𝑛2)
//        Space Complexity: 𝑂(1) (in-place sorting).
//        Stability: Not stable (equal elements may change order).
//        Suitability: Works well for small datasets or when memory is limited.
//        int[] arr =new int[5];
        int minindex;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("--------------------Selection Sort--------------------");
        for(int a=0;a< arr.length-1;a++)
        {
            minindex=a;
            for (int b = a+1; b <arr.length ; b++) {
                if(arr[minindex]>arr[b])
                    minindex=b;
            }
            if(arr[a]>arr[minindex])
            {
                int temp= arr[a];
                arr[a]=arr[minindex];
                arr[minindex]=temp;
            }
        }
        for(int i:arr)
            System.out.println(i);
    }
}
