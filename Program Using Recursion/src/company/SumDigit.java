package company;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=sum(num);
        System.out.println("The sum of digit of "+ num+" is 4432"+ ans);
    }
   /* static int sum(int n)//iterative approach
    {
        int add=0;
        if(n==0)
        {
            return 0;
        }
        else
        {
            while(n>0) {

                add = add + (n % 10);
                n=n/10;

            }
        }
        return add;
    }*/
    //recursive approach
    static int sum(int n)
    {
        if(n==0)
            return 0;
        else
            return (n%10)+sum(n/10);
    }
}
