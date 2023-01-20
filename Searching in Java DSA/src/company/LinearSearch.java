package company;

import java.util.Scanner;

public class LinearSearch {
    static int search(int[] arr,int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("The index is found at:");
        System.out.println(search(arr,5));
    }
}
