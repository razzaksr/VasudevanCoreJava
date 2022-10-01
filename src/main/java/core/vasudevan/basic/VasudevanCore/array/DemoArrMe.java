package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;

public class DemoArrMe {

    // call by reference
    public void geek(float[] hai){
        System.out.println(Arrays.toString(hai)+ " @ geek");
        hai[0]+=10;
        System.out.println(Arrays.toString(hai)+ " @ geek");
    }

    // call by value(copy)
    public void reveal(int beta){
        System.out.println("Received beta is "+beta);
        beta-=4;
        System.out.println(beta+" after modification in Reveal");
    }
    public void seekSome(){
        int alpha=29;
        System.out.println(alpha);
        //System.out.println(donut);
    }
    public static void main(String[] args) {
        int donut=983;
        DemoArrMe demo=new DemoArrMe();
        demo.seekSome();
        //System.out.println(alpha);

        demo.reveal(donut);
        System.out.println(donut);

        float[] www={3.4F,9.2F,10.5F,8.3F};
        demo.geek(www);
        System.out.println("@ main "+Arrays.toString(www));
    }
}
