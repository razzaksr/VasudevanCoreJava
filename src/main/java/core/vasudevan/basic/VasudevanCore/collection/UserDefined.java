package core.vasudevan.basic.VasudevanCore.collection;

import lombok.Data;

import java.util.ArrayList;
import java.util.TreeSet;

public class UserDefined {
    public static void main(String[] args) {
        Paper p1=new Paper();p1.name="DSA";p1.code=9123;p1.internals=50;p1.grade='B';
        Paper p2=new Paper();p2.name="DBMS";p2.code=8420;p2.internals=35;p2.grade='D';
        Paper p3=new Paper();p3.name="OOPS";p3.code=2230;p3.internals=30;p3.grade='A';
        Paper p4=new Paper();p4.name="COA";p4.code=8531;p4.internals=30;p4.grade='S';

        TreeSet<Paper> sets=new TreeSet<Paper>();
        sets.add(p1);sets.add(p2);sets.add(p3);sets.add(p4);
        System.out.println(sets);

        ArrayList<Paper> lists=new ArrayList<Paper>();
        lists.add(p1);lists.add(p2);lists.add(p3);lists.add(p4);

        System.out.println(lists);

    }
}

@Data
class Paper implements Comparable<Paper>{
    String name;
    Integer code;
    Integer internals;
    Character grade;

    @Override
    public int compareTo(Paper o) {
        return o.name.compareTo(this.name);
    }
}