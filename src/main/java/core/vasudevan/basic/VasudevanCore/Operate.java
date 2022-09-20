package core.vasudevan.basic.VasudevanCore;

import java.util.Scanner;

public class Operate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int noOf2000s=10,noOf500s=50,noOf200s=50,noOf100s=50, available=0;
        //System.out.println(available);
        available=(noOf2000s*2000)+(noOf200s*200)+(noOf500s*500)+(noOf100s*100);
        int requiredCash=0,tmpCount=0;
        while(available>0){
            String receipt="";
            System.out.println("Tell us required cash ");
            requiredCash=scan.nextInt();// 10000

            if(requiredCash<=available&&(requiredCash%2000==0||requiredCash%500==0||requiredCash%200==0||requiredCash%100==0)){
                System.out.println("Wait for cash "+requiredCash);
                if(noOf2000s>0&&requiredCash/2000>0){
                    tmpCount=requiredCash/2000;// find how many 2000s needed>> 5
                    // find required 2000s count is can be provided by the machine or not, 5<=10
                    if(tmpCount<=noOf2000s){
                        requiredCash-=(tmpCount*2000);//
                        receipt="2000 X "+tmpCount+"\n";
                        noOf2000s-=tmpCount;
                    }
                    else{
                        requiredCash-=(noOf2000s*2000);
                        receipt="2000 X "+noOf2000s+"\n";
                        noOf2000s=0;
                    }
                }
                if(noOf500s>0&&requiredCash>0&&requiredCash/500>0){
                    tmpCount=requiredCash/500;// find how many 500s needed>> 5
                    // find required 500s count is can be provided by the machine or not, 5<=10
                    if(tmpCount<=noOf500s){
                        requiredCash-=(tmpCount*500);//
                        receipt+="500 X "+tmpCount+"\n";
                        noOf500s-=tmpCount;
                    }
                    else{
                        requiredCash-=(noOf500s*500);
                        receipt+="500 X "+noOf500s+"\n";
                        noOf500s=0;
                    }
                }
                if(noOf200s>0&&requiredCash>0&&requiredCash/200>0){
                    tmpCount=requiredCash/200;// find how many 200s needed>> 5
                    // find required 200s count is can be provided by the machine or not, 5<=10
                    if(tmpCount<=noOf200s){
                        requiredCash-=(tmpCount*200);//
                        receipt+="200 X "+tmpCount+"\n";
                        noOf200s-=tmpCount;
                    }
                    else{
                        requiredCash-=(noOf200s*200);
                        receipt+="200 X "+noOf200s+"\n";
                        noOf200s=0;
                    }
                }
                if(noOf100s>0&&requiredCash>0&&requiredCash/100>0){
                    tmpCount=requiredCash/100;// find how many 100s needed>> 5
                    // find required 100s count is can be provided by the machine or not, 5<=10
                    if(tmpCount<=noOf100s){
                        requiredCash-=(tmpCount*100);//
                        receipt+="100 X "+tmpCount+"\n";
                        noOf100s-=tmpCount;
                    }
                    else{
                        requiredCash-=(noOf100s*100);
                        receipt+="100 X "+noOf100s+"\n";
                        noOf100s=0;
                    }
                }
                System.out.println(receipt);
                available=(noOf2000s*2000)+(noOf200s*200)+(noOf500s*500)+(noOf100s*100);
            }
            else{
                System.out.println("Insufficient/Unable to dispense cash by machine");
            }
        }
        System.out.println("Machine has insufficient cash");
    }
}
