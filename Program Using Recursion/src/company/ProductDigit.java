package company;

import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=prod(num);
        System.out.println("The Product of digit of "+ num+" is "+ ans);
    }
    /* static int prod(int n)//iterative approach
     {
         int add=1;
         if(n==0)
         {
             return 0;
         }
         else
         {
             while(n>0) {

                 add = add * (n % 10);
                 n=n/10;

             }
         }
         return add;
     }*/
    //recursive approach
    static int prod(int n)
    {
        if(n%10==n) {
            return n;
        }
        else {
            return (n % 10) * prod(n / 10);
        }
    }
}
