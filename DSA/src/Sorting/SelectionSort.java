package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr =new int[5];
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
