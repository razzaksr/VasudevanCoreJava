package core.vasudevan.basic.VasudevanCore.handle;

import java.util.Random;
import java.util.Scanner;

public class Limited {
    String quick="9876543210";
    static Scanner scanner=new Scanner(System.in);
    public void otp(int start,int end, int chances){
        String generated="";
        Random random=new Random();
        try{
            String nOne=quick.substring(start,end);
            for(int times=1;times<=4;times++){
                generated+=nOne.charAt(random.nextInt(nOne.length()));
            }
            System.out.println(generated);
        }
        catch (StringIndexOutOfBoundsException sin){
            if(chances<3){
                System.out.println(sin+"\n enter the start and end 0 to "+quick.length());
                start= scanner.nextInt();
                end=scanner.nextInt();
                chances++;
                otp(start,end,chances);
            }
            else{
                System.out.println("Maximum chances obtained");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Limited lim=new Limited();
        lim.otp(100,200,1);
    }
}
