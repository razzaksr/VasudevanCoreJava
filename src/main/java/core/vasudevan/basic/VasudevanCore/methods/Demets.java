package core.vasudevan.basic.VasudevanCore.methods;

import java.util.Arrays;

public class Demets {
    public static void main(String[] args) {
        Mars ma=new Mars();
        ma.show();
//        int[] say=ma.gather();
//        System.out.println(Arrays.toString(say));
        System.out.println(Arrays.toString(ma.gather()));
    }
}

class Mars{
    int[] terrific={56,9,34,56,24,56,3,2,34,6,56,57,67};
    public void show(){
        System.out.println(Arrays.toString(terrific));
    }
    public int[] gather(){
//        int[] tmp=Arrays.copyOfRange(terrific,4,10);
//        return tmp;
        return Arrays.copyOfRange(terrific,4,10);
    }
}