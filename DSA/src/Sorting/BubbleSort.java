package Sorting;

import java.util.Scanner;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= new int[5];
        System.out.println("Enter the 5 elements in array:");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("-------------------------------------------------");
        for (int i = 0; i <arr.length-1; i++) {
            {
                for(int j=0;j< arr.length-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        for(int i: arr)
        {
            System.out.println(i);
        }

    }
}