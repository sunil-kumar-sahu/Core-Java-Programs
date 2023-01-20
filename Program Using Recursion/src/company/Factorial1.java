package company;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=fact(num);
        System.out.println("The factorial of " +num+" is:"+ans);
    }
    static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
