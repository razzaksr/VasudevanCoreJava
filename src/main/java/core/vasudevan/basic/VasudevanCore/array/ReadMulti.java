package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReadMulti {

    public void gather(int row,double[][] arr){
        if(row<arr.length){
            for(int index=arr[row].length-1;index>=0;index--){
                System.out.println(arr[row][index]);
            }
        }
        else{
            System.out.println("Invalid row "+row);
        }
    }

    public void gather(double[][] arr,int row){
        if(row<arr.length){
//            for(int index=0;index<arr[row].length;index++){
//                System.out.println(arr[row][index]);
//            }
            System.out.println(Arrays.toString(arr[row]));
        }
        else{
            System.out.println("Invalid row "+row);
        }
    }

    public void gather(double[][] arr,int row,int col){
        if(row<arr.length&&col<arr[row].length){
            System.out.println(arr[row][col]);
        }
        else{
            System.out.println("Invalid row "+row+" or column "+col);
        }
    }

    public static void main(String[] args) {
        ReadMulti rd=new ReadMulti();
        Scanner scanner=new Scanner(System.in);
        double[][] week={{8.3,12.4,3.1},{9.2,67.4},{12.7,9.3,67.3,23.4}};

//        System.out.println("Enter the row and column ");
//        rd.gather(week,scanner.nextInt(),scanner.nextInt());
//        System.out.println(week[scanner.nextInt()][scanner.nextInt()]);// read

        System.out.println("Enter the row to print its values ");
        //rd.gather(week,scanner.nextInt());
        rd.gather(scanner.nextInt(),week);
    }
}
