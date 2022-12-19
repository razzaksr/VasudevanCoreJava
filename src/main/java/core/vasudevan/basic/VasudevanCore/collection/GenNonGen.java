package core.vasudevan.basic.VasudevanCore.collection;

import java.util.Iterator;
import java.util.Stack;

public class GenNonGen {
    public static void main(String[] args) {
        Stack stk1=new Stack();
        stk1.push(45);stk1.push(false);stk1.push('R');stk1.push("Razak");
        stk1.push(8.1);
        System.out.println(stk1.size());
        System.out.println(stk1);

//        for(Object tmp:stk1){
//            System.out.println(tmp);
//        }

        Iterator it=stk1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Stack<Integer> stk2=new Stack<Integer>();
        stk2.push(90);stk2.push(12);stk2.push(89);stk2.push(44);
        stk2.push(120);stk2.push(56);

        System.out.println(stk2);

        Iterator<Integer> its=stk2.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
    }
}
