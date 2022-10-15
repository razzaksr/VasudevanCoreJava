package core.vasudevan.basic.VasudevanCore.basics;

import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean isPrime=true;
		
		// prime series:
		for(int number=2;number<=1000;number++) {
			isPrime=true;
			for(int check=2;check<=number/2;check++) {
				if(number%check==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.printf("%d is prime\n",number);
			}
		}
		
		// person based stocks
//		int cardCount=0;String goods="";
//		int riceAvailable=4000, oilAvailable=300, sugarAvailable=4000, daalAvailable=5000;
//		
//		for(cardCount=1;cardCount<=10;cardCount++) {
//			System.out.println("Welcome "+cardCount+" st card to the ration shop");
//				System.out.println("Do you need rice ");
//				goods=scan.next();
//				if(goods.equals("yes")) {
//					System.out.println("Boiled Rice 20kg distributed to "+cardCount);
//					riceAvailable-=20;
//				}
//				System.out.println("Do you need oil ");
//				goods=scan.next();
//				if(goods.equals("yes")) {
//					System.out.println("Palm Oil 2lt distributed to "+cardCount);
//					oilAvailable-=2;
//				}
//				System.out.println("Do you need sugar ");
//				goods=scan.next();
//				if(goods.equals("yes")) {
//					System.out.println("Sugar 3kg distributed to "+cardCount);
//					sugarAvailable-=3;
//				}
//				System.out.println("Do you need daal ");
//				goods=scan.next();
//				if(goods.equals("yes")) {
//					System.out.println("Daal 5kg distributed to "+cardCount);
//					daalAvailable-=5;
//				}
//		}
//		System.out.println("Rice stock "+riceAvailable);
//		System.out.println("Oil stock "+oilAvailable);
//		System.out.println("Sugar stock "+sugarAvailable);
//		System.out.println("Daal stock "+daalAvailable);
		
		// ration shop stock based persons
//		int available=0, perCard=0, cardCount=0;String goods="";
//		for(int items=1;items<=4;items++) {
//			System.out.println("tell people to what gonna distribute today ");
//			goods=scan.next();
//			System.out.println("tell people how many kg/lt available in "+goods);
//			available=scan.nextInt();
//			System.out.println("tell people quantity to per card ");
//			perCard=scan.nextInt();
//			cardCount=0;
//			while(available>0) {
//				available-=perCard;
//				cardCount++;
//				System.out.println(cardCount+" got "+perCard+" quantity for "+goods);
//			}
//		}
		
//		for(int table=1;table<=5;table++) {
//			System.out.println("table "+table);
//			for(int number=1;number<=10;number++) {
//				System.out.println(number+" X "+table+" = "+(number*table));
//			}
//		}
	}
}
