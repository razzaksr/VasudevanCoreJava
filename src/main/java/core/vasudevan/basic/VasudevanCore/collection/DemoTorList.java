package core.vasudevan.basic.VasudevanCore.collection;

/*
Vector          >> 10,15 | synchronized(thread safety)
ArrayList       >> 10,20 | asynchronized

add, add(pos,obj), addAll
get(pos)
set(pos,obj)
remove(pos), remove(obj)
contains(obj) >> true/false
indexOf(obj)    >> pos of given object
removeAll
retainAll
Collections >> java.util.List
sort
reverse
replaceAll

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class DemoTorList {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        Vector<String> list2=new Vector<String>();

        list1.add("Jinja");list1.add("Thymeleaf");list1.add("Vue");list1.add("PHP");
        list1.add("React");list1.add("ASP");list1.add("Angular");list1.add("Razor");

        list2.addAll(list1);// copy

        System.out.println("ArrayList elements: "+list1);
        System.out.println("Vector elements: "+list2);

        Collections.sort(list1);
        Collections.reverse(list2);

        System.out.println("ArrayList elements: "+list1);
        System.out.println("Vector elements: "+list2);

        list1.set(2,"ASP");
        list2.remove("PHP");

        System.out.println("ArrayList elements: "+list1);
        System.out.println("Vector elements: "+list2);

        Collections.replaceAll(list1,"ASP","HTML");

        System.out.println(list1.contains("ASP"));

        System.out.println("ArrayList elements: "+list1);
        System.out.println("Vector elements: "+list2);

        list1.retainAll(list2);

        System.out.println("ArrayList elements: "+list1);
        System.out.println("Vector elements: "+list2);

        list2.removeAll(list1);

        System.out.println("ArrayList elements: "+list1);
        System.out.println("Vector elements: "+list2);

        System.out.println(list1.indexOf("PHP"));
        System.out.println(list2.indexOf("Jinja"));
    }
}
