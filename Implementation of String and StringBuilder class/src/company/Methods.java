package company;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name="Sunil kumar sahu";
        System.out.println(Arrays.toString(name.toCharArray()));//it convert the string into character array
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));//it returns the search elements index(1st index)
        System.out.println("    Sunil   ".strip());//strip() remove the space
        System.out.println(Arrays.toString(name.split(" ")));//array of string
    }
}
