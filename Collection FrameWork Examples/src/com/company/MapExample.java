package com.company;
import java.util.HashMap;
import java.util.function.BiFunction;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> courses=new HashMap<>();

        //adding elements
        courses.put("Core Java",4000);
        courses.put("Basic Python",3000);
        courses.put("Spring",5000);
        courses.put("Android",4000);
        courses.put("Android",6000);
        courses.put("PHP",2000);
        System.out.println(courses);

        courses.forEach((key,value)->{
            System.out.println(key+ "=>"+ value);
            System.out.println();
        });
        //entry set
        //key set
        System.out.println(courses.get("Core Java"));
    }
}
