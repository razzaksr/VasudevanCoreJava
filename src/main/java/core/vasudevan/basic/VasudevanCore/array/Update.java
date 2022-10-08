package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;
import java.util.Scanner;

public class Update {

    public void modify(double[] arr){
        for(int index=0;index<arr.length;index++){
            if(arr[index]<=5.0){
                arr[index]+=(arr[index]*10)/100;
            }
            else
                arr[index]+=(arr[index]*3)/100;
        }
    }

    public void modify(String[] arr){
        for(int index=0;index<arr.length;index++){
            if(arr[index].endsWith("a")||arr[index].endsWith("e")||arr[index].endsWith("i")||
                    arr[index].endsWith("o")||arr[index].endsWith("u")){
                arr[index]=null;
            }
        }
    }

    public void modify(String[] arr,int pos,String value){
        if(pos<arr.length){
            arr[pos]=value;
            System.out.println(arr[pos]);
        }
        else{
            System.out.println("Invalid position "+pos);
        }
    }

    public static void main(String[] args) {
        Update up=new Update();
        double[] salary={4.5,9.2,12.5,8.2,7.8,12.5,1.8};
        String[] access={"Razak","Murali","Titus","Annamalai","Manoj","Rasheedha","Sabari"};
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the position to update ");
//        int pos=scanner.nextInt();
//        System.out.println("Enter the value to replace in "+pos);
//        String t=scanner.next();
//        up.modify(access,pos,t);

        up.modify(access);
        up.modify(salary);
        System.out.println(Arrays.toString(access));
        System.out.println(Arrays.toString(salary));
    }
}
