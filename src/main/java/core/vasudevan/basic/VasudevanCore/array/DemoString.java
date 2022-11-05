package core.vasudevan.basic.VasudevanCore.array;

import java.io.PrintStream;
import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String obj1="    Razak Mohamed S   ";// literal
        String obj2=new String("razak mohamed s");// non literal
        System.out.println(obj1+" "+obj2);
        System.out.println(obj1.length()+" "+obj2.length());
        obj1=obj1.trim();// immutable
        System.out.println(obj1.length()+" "+obj2.length());
        String[] tmp=obj2.split(" ");
        System.out.println(Arrays.toString(tmp));
        obj1=obj1.concat("Zealous tech corp");
        //obj1=obj1+"Zealous tech corp";
        System.out.println(obj1+" "+obj1.getBytes());
        System.out.println(obj2.charAt(3));
        String nm=obj2.substring(4,11);
        System.out.println(nm);
        obj2=obj2.toUpperCase();
        System.out.println(obj2);
        System.out.println(obj1.contains("Moh"));
        System.out.println(obj1);
        obj1=obj1.replace("tech corp","academy of career training");
        System.out.println(obj1);
        System.out.println(obj2.startsWith("Razak"));
        System.out.println(obj1.endsWith("ing"));
    }
}
