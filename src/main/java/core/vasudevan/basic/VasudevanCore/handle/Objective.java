package core.vasudevan.basic.VasudevanCore.handle;

import java.util.Scanner;

public class Objective {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);int start=0,end=0;
        String alpha="Evans and Downey were best combo of the Marvel cinematic universe both were pillars of phase 1,2 and 3";
        try{
            System.out.println("Enter the start and end positions ");
            start=scanner.nextInt();
            end=scanner.nextInt();
            System.out.println(alpha.substring(start,end));
            System.out.println("Try over");
        }
        catch (StringIndexOutOfBoundsException sino){
            sino.printStackTrace();
            System.out.println("Enter the index from 0 to "+alpha.length());
            start=scanner.nextInt();
            end=scanner.nextInt();
            System.out.println(alpha.substring(start,end));
        }
        finally {
            System.out.println("Done");
        }
    }
}
