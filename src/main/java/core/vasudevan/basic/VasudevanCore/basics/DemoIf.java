package core.vasudevan.basic.VasudevanCore.basics;

import java.util.Scanner;

public class DemoIf {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		String person="";
//		System.out.println("Tell us who you are ");
//		person=scan.nextLine();
//		if(person.equalsIgnoreCase("employee")||person.equalsIgnoreCase("visitor")) {
//			System.out.println("Welcome to Salem Steel Plant");
//		}
//		else {
//			System.out.println(person+" is stranger and not allowed");
//		}
		
		// loan eligibility
//		int cibil=0; double property=0.0, salary=0.0;
//		System.out.println("Welcome to AXIS bank loan section \nTell us cibil to check ");
//		cibil=scan.nextInt();
//		if(cibil>=650) {
//			System.out.println("We could offer loan");
//			System.out.println("please enter property value if any ");
//			property=scan.nextDouble();
//			System.out.println("please enter the salary ");
//			salary=scan.nextDouble();
//			if(property>=4.5||salary>=2.5) {
//				System.out.println("We can offer 1L PL");
//			}
//			else {
//				System.out.println("We can't offer any PL but vehicle loan support available");
//			}
//		}
//		else {
//			System.out.println("We can't offer any loans since cibil is low");
//		}
		
		// if else if ladder: theater ticket booking
		int amount=0;String clas="";
		System.out.println("Welcome to INOX\nplease tell us class you wish ");
		clas=scan.next();
		if(clas.compareToIgnoreCase("dimond")==0) {
			System.out.println("please enter the amount ");
			amount=scan.nextInt();
			if(amount>=200) {
				System.out.println("Dimond class ticket booked");
			}
			else {
				System.out.println("Insufficient amount to book dimond class");
			}
		}
		else if(clas.compareToIgnoreCase("platinum")==0) {
			System.out.println("please enter the amount ");
			amount=scan.nextInt();
			if(amount>=140) {
				System.out.println("Platinum class ticket booked");
			}
			else {
				System.out.println("Insufficient amount to book platinum class");
			}
		}
		else if(clas.compareToIgnoreCase("gold")==0) {
			System.out.println("please enter the amount ");
			amount=scan.nextInt();
			if(amount>=100) {
				System.out.println("Gold class ticket booked");
			}
			else {
				System.out.println("Insufficient amount to book gold class");
			}
		}
		else {
			System.out.println("You can't watch the movie");
		}
		
		scan.close();
	}
}
