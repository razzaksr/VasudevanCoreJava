package core.vasudevan.basic.VasudevanCore.parellel;

import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Shine sh=new Shine();
        Finale fin=new Finale();

        Thread t1=new Thread(fin,"Evans");
        Thread t2=new Thread(sh,"Scarlet");
        Thread t3=new Thread(fin,"Barton");
        Thread t4=new Thread(fin,"Odin");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Tony{
    Scanner scanner=new Scanner(System.in);
    double[][] arr={{8.9,12.4,7.7,3.2},{9.1,7.1,5.0,98.5},{12.5,0.9,10.5,8.2}};
    public void list(){
        for(double[] one:arr){
            System.out.println(Arrays.toString(one));
        }
    }
}

class Finale extends Tony implements Runnable{
    String traverse;
    public void spiralTowardsIn(){

    }
    public void spiralTowardsOut(){
        int row=0,col=0;
        row=1;col=arr[row].length-2;
        while(col>=0){
            System.out.print(arr[row][col]+" ");
            col--;
        }
        col++;row++;
        while(col<arr[row].length){
            System.out.print(arr[row][col]+" ");
            col++;
        }
        col--;row--;
        while(row>=0){
            System.out.print(arr[row][col]+" ");
            row--;
        }
        row++;col--;
        while(col>=0){
            System.out.print(arr[row][col]+" ");
            col--;
        }
    }
    @Override
    synchronized public void run() {
        System.out.println(Thread.currentThread().getName()+" tell us how to traverse ");
        traverse=scanner.next();
        switch(traverse){
            case "spiout":spiralTowardsOut();break;
            case "spin":spiralTowardsIn();break;
            case "basic":list();break;
            default:System.out.println(traverse+" invalid");
        }
    }

}
class Shine extends Tony implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int row=0;row< arr.length;row++){
            double min=Double.MAX_VALUE, max=Double.MIN_VALUE;
            for(int col=0;col<arr[row].length;col++){
                if(min>arr[row][col]){
                    min=arr[row][col];
                }
                if(max<arr[row][col]){
                    max=arr[row][col];
                }
            }
            System.out.println(min+" is minimum in the row of "+row);
            System.out.println(max+" is maximum in the row of "+row);
        }
    }

}