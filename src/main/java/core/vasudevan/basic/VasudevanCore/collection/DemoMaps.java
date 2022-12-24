package core.vasudevan.basic.VasudevanCore.collection;

/*
Map<keyclass,valueclass>
keyobject   >> shouldn't duplicate
valueobject >> can be duplicated

    put, putAll
    get
    containsKey
    containsValue
    remove(key)

    keySet
    values

    Hashtable   >> synchronized, 11 bits
    HashMap     >> async    , 10 bits
    TreeMap     >> ascending based on key

 */

import java.util.*;

public class DemoMaps {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm=new Hashtable<>();
        hm.put(766,"Razak Mohamed S");hm.put(-1,"Rasheedha R");
        hm.put(890,"Annamalai S");hm.put(900,"Manoj Kumar");

        System.out.println(hm);

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.putAll(hm);

        System.out.println(tm);

        Set<Integer> st=tm.keySet();
        Iterator<Integer> t=st.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }

        Collection<String> cc=hm.values();
        Iterator<String> c=cc.iterator();
        while(c.hasNext()){
            System.out.println(c.next());
        }

//        for(Integer k:tm.keySet()){
//            System.out.println(k+" "+tm.get(k));
//        }
//
//        for(String v:hm.values()){
//            System.out.println(v);
//        }

        tm.remove(890);

        System.out.println(hm.containsValue("Annamalai S"));
        System.out.println(tm.containsKey(890));

    }
}
