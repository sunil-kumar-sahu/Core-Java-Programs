package company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=rev(num);
        System.out.println("The reverse of " +num + " is:"+ ans);
    }
    static int sum=0;
    static int rev(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            int rem=n%10;
            sum=sum*10+rem;
            rev(n/10);
        }
        return sum;
    }
}
