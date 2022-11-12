package core.vasudevan.basic.VasudevanCore.handle;

import java.util.Scanner;

public class Userdefined {
    public static void main(String[] args) {
        int[] hai={56,2,13,56,8,76,667,87,65,6,57,77};
        int user=0;
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter the data to search");
            user=scanner.nextInt();
            for(int index=0;index< hai.length;index++){
                if(hai[index]==user){
                    System.out.println(index+" where "+user+" found");
                    return;
                }
            }
            throw new VasudevanException();
        }
        catch(VasudevanException vasu){
            System.out.println(vasu);
            System.out.println("Enter the data to search");
            user=scanner.nextInt();
            for(int index=0;index< hai.length;index++){
                if(hai[index]==user){
                    System.out.println(index+" where "+user+" found");
                    return;
                }
            }
            System.out.println("Maximum chances obtained");
        }
    }
}
