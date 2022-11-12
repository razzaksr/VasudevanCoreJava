package core.vasudevan.basic.VasudevanCore.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);int varOne=0,varTwo=0;
        try{
            System.out.println("Enter the data to var one and two");
            varOne= scanner.nextInt();
            varTwo= scanner.nextInt();
            System.out.println(varOne/varTwo);
        }
        catch(ArithmeticException arm){
            System.out.println(arm+" varTwo shouldn't ZERO");
            varTwo= scanner.nextInt();
            System.out.println(varOne/varTwo);
        }
        catch (InputMismatchException ins){
            Scanner scan=new Scanner(System.in);
            System.out.println("Numbers only non decimal point values");
            System.out.println("Enter the data to var one and two");
            varOne= scan.nextInt();
            varTwo= scan.nextInt();
            System.out.println(varOne/varTwo);
        }
    }
}
