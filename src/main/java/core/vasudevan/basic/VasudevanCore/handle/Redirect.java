package core.vasudevan.basic.VasudevanCore.handle;

import java.util.Scanner;

public class Redirect {
    static Scanner scan=new Scanner(System.in);
    String[] hai={"Morbius","Natasha","Peter","Bucky","Rhody","Tony","Sam","Hall","Quil"};
    public void settle(String user,int start,int end){
        try{
            for(int index=start;index<=end;index++){
                if(hai[index].equalsIgnoreCase(user)){
                    System.out.println(user+" found @ "+index);
                    return;
                }
            }
            System.out.println(user+" not found anywhere");
        }
        catch (ArrayIndexOutOfBoundsException ain){
            System.out.println(ain+"\n start from 0 to "+hai.length);
            throw ain;
        }
    }
    public static void main(String[] args) {
        Redirect re=new Redirect();
        try {
            re.settle("Peter", 0, 4);
            re.settle("Quil", 5, re.hai.length);
            re.settle("Evans", 0, 8);
            re.settle("Peter", 3, 2);
            re.settle("Tony", 10, 20);
        }
        catch(ArrayIndexOutOfBoundsException a){
            int start=scan.nextInt();
            int end=scan.nextInt();
            String user=scan.next();
            for(int index=start;index<=end;index++){
                if(re.hai[index].equalsIgnoreCase(user)){
                    System.out.println(user+" found @ "+index);
                    return;
                }
            }
            System.out.println(user+" not found anywhere");
        }
    }
}
