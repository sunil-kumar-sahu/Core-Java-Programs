package com.company;
import java.util.*;//import util classes for all package

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to  java collections framework");
        //type safe collection:same type of element added to collection
        ArrayList<String>names=new ArrayList<String>();
        names.add("sunil");
        names.add("jasho");
        names.add("roshni");
        names.add("vandana");
        names.add("vandana");
        System.out.println(names);
        //get specific elements
       // System.out.println(names.get(0));
        //System.out.println(names.get(1));

        //untype safe collection:different types of element added to the collection
       // LinkedList list=new LinkedList();
       // list.add("Sachin");
       // list.add(100);
       // list.add(634.7645);
       // list.add(true);
       // System.out.println(list);

        //remove element with its name
        names.remove("roshni");
        System.out.println(names);

        //size of the array list
        System.out.println("SIZE ="+names.size());

        //check item is there or not
        System.out.println(names.contains("sunil"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting values
        names.add(1,"ram");
        System.out.println(names);

        //remove all elements
        //names.clear();
        //System.out.println(names);
        //vector
        Vector<String> vector=new Vector<>();
        vector.addAll(names);

        System.out.println("VECTOR "+ vector);
        System.out.println("------------------------");
        //HashSet
        HashSet<Double> nms=new HashSet<>();
        nms.add(14.14);
        nms.add(34.1234);
        nms.add(2356.235);
        nms.add(99.3);
        nms.add(99.3);
        nms.add(5.3);
        System.out.println(nms);
        //Treeset
        TreeSet<Double> tset=new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);
    }
}
