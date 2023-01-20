package company;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
       LinkedList<Integer>l1=new LinkedList<>();
        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(5);
        l1.add(2);
        l1.add(9);
        System.out.println(l1);
        //add element in specific position
        l1.add(2,6);
        System.out.println(l1);
        //remove elements from linkedlist
        l1.remove();
        System.out.println(l1);
        //remove the first element
        l1.removeFirst();
        System.out.println(l1);
        Iterator it= l1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //size
        System.out.println(l1.size());
        boolean b1=l1.contains(7);
        System.out.println(b1);


    }
}
