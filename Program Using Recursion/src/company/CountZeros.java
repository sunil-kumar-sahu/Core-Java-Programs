package company;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(count(num));
    }
    static int count(int n)
    {
        return helper(n,0);
    }
    private static int helper(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem=n%10;
        if(rem==0)
        {
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
