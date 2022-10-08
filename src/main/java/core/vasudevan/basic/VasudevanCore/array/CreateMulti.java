package core.vasudevan.basic.VasudevanCore.array;

/*
type[][] obj={{v1,v2,v3,...},{v1,v2,v2,...},{v1,v2,v3.,,,}}
type[][] obj=new type[size of the row][size of columns in each row];

column capacity in every row is equals>> multi dimension
column capacity in every row is different>> jagged

length>> no of rows

arr[row][col]

 */

import java.util.Arrays;
import java.util.Scanner;

public class CreateMulti {

    public void insertings(int[][] arr){
        Scanner scanner=new Scanner(System.in);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println("Enter the value to the row "+row+" and column "+col);
                arr[row][col]=scanner.nextInt();
            }
        }
    }

    public void display(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] hai=new int[2][4];// 0>0,1,2,3 ; 1>0,1,2,3
        CreateMulti multi=new CreateMulti();
        multi.insertings(hai);
        //multi.display(hai);

        // row extraction
//        for(int index=0;index<hai.length;index++){
//            System.out.println(Arrays.toString(hai[index]));
//        }

//        for(int[] row:hai){
//            System.out.println(Arrays.toString(row));
//        }

        for(int[] row:hai){
            for(int data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }

    }
}
