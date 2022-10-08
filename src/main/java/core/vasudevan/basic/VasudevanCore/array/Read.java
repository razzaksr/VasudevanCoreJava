package core.vasudevan.basic.VasudevanCore.array;

import java.util.Scanner;

/*
Polymorphism:
    Compile time/overloading: it happens in same class
        method:
            writing/defining multiple methods with same name but parameters of each will vary
            by its order or count or type
 */

public class Read {

    public void slice(String[] arr,int start,int end){
        if(start>=0&&start<=end&&end<arr.length){
            for(;start<=end;start++){
                System.out.println(arr[start]);
            }
        }
        else{
            System.out.println("Invalid start "+start+" or invalid end "+end+" in array "+arr.length);
        }
    }

    public void slice(String[] arr){
        for(int index=arr.length-1;index>=0;index--){
            System.out.println(arr[index]);
        }
    }

    public void slice(int start,String[] yet){
        if(start<yet.length){
            for(;start<yet.length;start++){
                System.out.println(yet[start]);
            }
        }
        else{
            System.out.println("Invalid start position "+start+" in array "+yet.length);
        }
    }

    public void slice(String[] arr,int position){
        if(position<arr.length){
            System.out.println(arr[position]);
        }
        else{
            System.out.println("Invalid "+position+" in "+arr.length);
        }
    }

    public static void main(String[] args) {
        Read rd=new Read();
        String[] access={"Razak","Murali","Titus","Annamalai","Manoj","Rasheedha","Sabari"};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Tell us position to read ");
        rd.slice(access,scanner.nextInt());
        System.out.println("Enter the start position from where to print rest of array ");
        rd.slice(scanner.nextInt(),access);
        rd.slice(access);
        System.out.println("Enter start and end in array ");
        rd.slice(access, scanner.nextInt(), scanner.nextInt());
//        System.out.println(access[scanner.nextInt()]);
    }
}
