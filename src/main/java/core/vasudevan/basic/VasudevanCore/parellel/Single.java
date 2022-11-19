package core.vasudevan.basic.VasudevanCore.parellel;

import java.util.Scanner;

public class Single {
    public static void main(String[] args) {
        Margret mar=new Margret();
//        mar.linear("DJango");
        Thread t1=new Thread(mar,"Vasu");
        Thread t2=new Thread(mar,"Devan");
        Thread t3=new Thread(mar,"rishi");

//        t1.run();
//        t2.run();
//        t3.run();

        t1.start();
        t2.start();
        t3.start();
    }
}

class Margret implements Runnable{ //extends Thread{
    private Scanner scanner=new Scanner(System.in);
    private String data;
    private String[][] arr={{"React","Angular","SpringBoot","Jpa","MySQL"},{"React","Django","Flask","MongoDB"},{"Node","MongoDB","Express","Angular","React"}};
    public void linear(String data){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col].equalsIgnoreCase(data)){
                    System.out.println(data+" exists @ row "+row+" and column "+col);
                    return;
                }
            }
        }
        System.out.println(data+" doesn't exists");
    }
    synchronized public void run(){

        System.out.println("Enter the data to search "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getId());
        data=scanner.next();
        linear(data);
    }
}