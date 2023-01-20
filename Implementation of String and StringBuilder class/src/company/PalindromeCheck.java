package company;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str="";
        System.out.println("Enter the String to check:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str)
    {
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }
}
