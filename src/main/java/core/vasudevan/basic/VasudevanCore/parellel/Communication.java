package core.vasudevan.basic.VasudevanCore.parellel;

import java.util.Random;
import java.util.Scanner;

public class Communication {
    public static void main(String[] args) {
        Inox i=new Inox();
        Market mar=new Market(i);
        Thread t1=new Thread(i,"Vijay");
        Thread t2=new Thread(mar,"Prem");
        t1.start();
        t2.start();
    }
}

class Market implements Runnable{
    private Scanner scanner=new Scanner(System.in);
    private Inox nox;
    public Market(){}
    public Market(Inox i) {
        nox=i;
    }

    @Override
    public void run() {
        synchronized (nox.ask){
            if(nox.cost<265){
                nox.cost=300;
                System.out.println(Thread.currentThread().getName()+" lending money");
                nox.ask.notify();
            }
            Random random=new Random();
            int bill=random.nextInt(10000);
            System.out.println("Pay the bill "+bill);
            int amount= scanner.nextInt();
            if(amount>=bill){
                System.out.println("Bill "+bill+" has paid by "+Thread.currentThread().getName());
            }
            else{
                System.out.println("Can't buy product");
            }
        }
    }
}

class Inox implements Runnable{
    Scanner ask=new Scanner(System.in);
    int cost;
    @Override
    public void run() {
        synchronized (ask){
            System.out.println("Welcome "+Thread.currentThread().getName()+" to INOX");
            cost=ask.nextInt();
            if(cost<=265){
                System.out.println("Insufficient to watch movie in INOX");
                try {
                    ask.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thanks for coming "+Thread.currentThread().getName()+" Enjoy the movie experience");
        }
    }
}