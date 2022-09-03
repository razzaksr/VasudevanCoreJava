package core.vasudevan.basic.VasudevanCore;

import java.util.Scanner;

public class DemoFor {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// flash sale of realme X 
		int available=100,invoice=0, required=0;double time=0.0;
		
//		for(time=12.00;time<12.59&&available>0;time+=0.01) {
//			System.out.println("Tell us required quantity ");
//			required=scan.nextInt();
//			if(required<=available) {
//				available-=required;
//				System.out.println(required+" no of items placed @ "+time);
//				invoice++;
//			}
//			else {
//				System.out.println("Only "+available+" left");
//			}
//		}
		time=12.00;
		while(time<12.59&&available>0) {
			System.out.println("Tell us required quantity ");
			required=scan.nextInt();
			if(required<=available) {
				available-=required;
				System.out.println(required+" no of items placed @ "+time);
				invoice++;
			}
			else {
				System.out.println("Only "+available+" left");
			}
			time+=0.01;
		}
		
		System.out.println("Totally "+invoice+" bills has been generated in the flash sale");
		System.out.println("Left stock "+available);
		System.out.println("Sale closed @ "+time);
		
		// fibonacci:  0 1 1 2 3 5 8 13 21 . . . . . . .
//		int count=0, num1=0, num2=1, sum=0;
//		
//		System.out.println("Tell us count of numbers in the series ");
//		count=scan.nextInt();
//		
//		if(count>=2) {
//			System.out.println(num1+"\n"+num2);
//			count-=2;
//			
//			for(;count>0;count--) {
//				sum=num1+num2;
//				System.out.println(sum);
//				num1=num2;
//				num2=sum;
//			}
//		}
//		else {
//			System.out.println("Can't generate fibonacci with count of "+count);
//		}
		
		// factorial : 5! >> 5x4x3x2x1 >> 120
//		int userGiven=0, factorial=1;
//		System.out.println("Tell us number to find the factorial ");
//		userGiven=scan.nextInt();
//		for(;userGiven>0;userGiven--) {
//			factorial*=userGiven;
//		}
//		
//		System.out.println(factorial);
		
		
		//int userQty=0,userPayabale=0;
		
		// stock clearance
//		for(int stock=20;stock>0;) {
//			System.out.println("Tell us how many items you want ");
//			userQty=scan.nextInt();
//			if(userQty<=stock) {
//				System.out.println("Enter the amount to buy "+userQty);
//				userPayabale=scan.nextInt();
//				if(userPayabale>=(userQty*3500)) {
//					System.out.println(userQty+" stocks are sold");
//					stock-=userQty;
//				}
//				else {
//					System.out.println("Transaction cancelled");
//				}
//			}
//			else {
//				System.out.println("Available is "+stock);
//			}
//		}
		
		// stock clearance sale
//		for(int stock=20;stock>0;) {
//			System.out.println("Tell us how many items you want ");
//			userQty=scan.nextInt();
//			System.out.println("Enter the amount to buy "+userQty);
//			userPayabale=scan.nextInt();
//			if(userPayabale>=(userQty*3500)) {
//				System.out.println(userQty+" stocks are sold");
//				stock-=userQty;
//			}
//			else {
//				System.out.println("Transaction cancelled");
//			}
//		}
		
		// infinite loop
//		int hai=11;
//		for(;;) {
//			System.out.println(hai);
//			hai++;
//		}
//		int hai=11;
//		for(;hai<=20;) {
//			System.out.println(hai);
//			hai++;
//		}
//		for(int hai=11;hai<=20;) {
//			System.out.println(hai);
//			hai++;
//		}
//		for(int hai=11;hai<=20;hai++) {
//			System.out.println(hai);
//		}
	}
}
