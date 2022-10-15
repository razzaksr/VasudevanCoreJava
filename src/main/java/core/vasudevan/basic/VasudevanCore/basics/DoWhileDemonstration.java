package core.vasudevan.basic.VasudevanCore.basics;

import java.util.Scanner;

public class DoWhileDemonstration {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int start=0,end=0;
		System.out.println("Tell us where to start ");
		start=scan.nextInt();
		System.out.println("Tell us where to end ");
		end=scan.nextInt();
		
		do {
			if(start==2||start==3||start==5||start==7||
					start%3!=0&&start%2!=0&&start%5!=0&&start%7!=0)
			{
				System.out.println(start);
			}
			start++;
		}while(start<=end);
		
		
		// exit check
//		int top=20;
//		do {
//			System.out.println(top);
//			top--;
//		}while(top>50);
		
//		int top=100;
//		do {
//			System.out.println(top);
//			top--;
//		}while(top>50);
	}
}
