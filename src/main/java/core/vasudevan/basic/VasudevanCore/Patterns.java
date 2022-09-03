package core.vasudevan.basic.VasudevanCore;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		int square=0, number=65;
//		System.out.println("Tell us no of rows in perfect square ");
//		square=scan.nextInt();
//		
//		for(int row=1;row<=square;row++) {
//			for(int col=1;col<=square;col++) {
//				System.out.print((char)number);
//				number++;
//			}
//			System.out.println();
//		}
		
//		int count=0;
//		System.out.println("Tell us how many rows ");
//		count=scan.nextInt();
//		
//		for(int row=1;row<=count;row++) {
//			for(int col=1;col<=row;col++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
//		int count=0;
//		System.out.println("Tell us how many rows ");
//		count=scan.nextInt();
//		
//		for(int row=1;row<=count;row++) {
//			for(int space=count;space>row;space--) {
//				System.out.print(" ");
//			}
//			for(int col=1;col<=row;col++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
//		int count=0;
//		System.out.println("Tell us how many rows ");
//		count=scan.nextInt();
//		
//		for(int row=1;row<=count;row++) {
//			for(int space=count;space>row;space--) {
//				System.out.print(" ");
//			}
//			for(int col=1;col<=row;col++) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}
		
		int count=0, limit=1;
		System.out.println("Tell us how many rows ");
		count=scan.nextInt();
		
		for(int row=1;row<=count;row++) {
			for(int space=count;space>row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++) {
				System.out.print("#");
			}
			System.out.println();
			limit+=2;
		}
	}
}
