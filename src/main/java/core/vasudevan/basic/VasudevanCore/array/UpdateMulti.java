package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateMulti {

    public void alter(double[][] arr,int row,int col, double value){
        if(row< arr.length&&col<arr[row].length){
            arr[row][col]=value;
            System.out.println(arr[row][col]+" updated");
        }
        else{
            System.out.println("Invalid row "+row+" or column "+col);
        }
    }

    public void list(double[][] arr){
        for(double[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        double[][] week={{8.3,12.4,3.1},{9.2,67.4},{12.7,9.3,67.3,23.4}};
        UpdateMulti up=new UpdateMulti();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row,column and data to update ");
        up.alter(week, scanner.nextInt(), scanner.nextInt(),scanner.nextDouble());
        up.list(week);
    }
}
