package core.vasudevan.basic.VasudevanCore.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SameSolution {
    public static void main(String[] args) {
        double[][] arr={{4.5,2.5,0.1},{98.3,1.5,4.5,12.5,8.5},{0.55,23.5,5.3,1.0}};
        Scanner scanner=new Scanner(System.in);int row=0,col=0;
        try{
            System.out.println("Enter the row and column to get number ");
            row= scanner.nextInt();
            col= scanner.nextInt();
            System.out.println(arr[row][col]);
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException ain){
            Scanner scan=new Scanner(System.in);
            System.out.println(ain+"\n row less than "+arr.length);
            System.out.println("Enter the row and column to get number ");
            row= scan.nextInt();
            col= scan.nextInt();
            System.out.println(arr[row][col]);
        }
    }
}
