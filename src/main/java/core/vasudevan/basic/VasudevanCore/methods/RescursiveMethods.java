package core.vasudevan.basic.VasudevanCore.methods;

import java.util.Scanner;

public class RescursiveMethods {

    public void basic(){
        System.out.println("Hai there its basic recursion");
        basic();
    }

    public void likeLoop(int done){
        if(done<10){
            System.out.println("Loop like recursion "+done);
            done++;
            likeLoop(done);
        }
        return;
    }



    public static void main(String[] args) {
        RescursiveMethods rec=new RescursiveMethods();
        //rec.basic();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter thr start limit ");
        rec.likeLoop(scan.nextInt());

    }
}
