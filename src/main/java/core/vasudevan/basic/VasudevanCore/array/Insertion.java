package core.vasudevan.basic.VasudevanCore.array;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        String[] hi=new String[10];

        Scanner scanner=new Scanner(System.in);

//        hi[0]="Richard";
//        hi[1]="Migrate";

        System.out.println("Enter the start position ");
        int start = scanner.nextInt();
        System.out.println("Enter the end position ");
        int end = scanner.nextInt();

        for(int pos=start;pos<end;pos++){
            System.out.println("Enter value @ "+pos);
            hi[pos]=scanner.next();
        }

        System.out.println(hi[0]+" "+hi[8]);

        scanner.close();
    }
}
