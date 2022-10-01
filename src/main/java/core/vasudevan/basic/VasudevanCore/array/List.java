package core.vasudevan.basic.VasudevanCore.array;

import java.util.Arrays;
import java.util.Scanner;

// list: travers all index and print the values in that
public class List {
    public static void main(String[] args) {
        double[] arr={45.3,9.5,12.4,91.4,67.5,35.7,8.2,7.2,6.75};

        Scanner scanner=new Scanner(System.in);

//        System.out.println(Arrays.toString(arr));

//        double[] t=Arrays.copyOfRange(arr,2,6);
//        System.out.println(Arrays.toString(t));

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,2,6)));

//        for(double each:arr){
//            System.out.println(each);
//        }

//        System.out.println("Enter the start to print ");
//        int start=scanner.nextInt();
//        System.out.println("Enter the end point ");
//        int end=scanner.nextInt();
//
//        for(int index=start;index<end;index++){
//            System.out.println(arr[index]);
//        }
    }
}
