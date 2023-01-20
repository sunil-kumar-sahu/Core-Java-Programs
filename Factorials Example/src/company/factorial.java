package company;

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
       factors(n);
        factors2(n);
    }
   static void factors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    static void factors2(int n)
    {
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" "+n/i);
            }
        }
    }
}
