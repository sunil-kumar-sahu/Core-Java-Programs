package company;

import java.util.Scanner;

public class SelectionSort {
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
           int min_idx=i;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]<arr[min_idx])
               {
                   min_idx=j;
               }
           }
           int temp=arr[min_idx];
           arr[min_idx]=arr[i];
           arr[i]=temp;
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements into the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        selection(arr);
        System.out.println("After Selection  Sorting The Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
