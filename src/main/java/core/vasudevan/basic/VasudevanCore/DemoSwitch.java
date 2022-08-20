package core.vasudevan.basic.VasudevanCore;

import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// toll booth exmaple
//		char vehicle='\0';
//		System.out.println("Tell us your vehicle type L,H,T ");
//		vehicle=scan.next().charAt(0);
//		switch(vehicle) {
//		case 'l':System.out.println("Rs.45 for light vehicle");break;
//		case 'h':System.out.println("Rs.65 for heavy vehicle");break;
//		case 't':System.out.println("toll free for two wheelers");break;
//		default:System.out.println("Invalid vehicle");
//		}
		
		// election booth
//		int partNo=0;
//		System.out.println("Tell us part number ");
//		partNo=scan.nextInt();
//		switch(partNo) {
//		case 418:
//			System.out.println("Natesan Street, Kumar Colony people can cast vote @ room 101");
//			break;
//		case 584:
//			System.out.println("Kanagaraja Ganapathy street can cast vote @ room 200");
//			break;
//		case 911:
//			System.out.println("Shankar nagar, Vel nagar, BRP Colony can cast vote @ 102");
//			break;
//		default:System.out.println("Invalid part number "+partNo);
//		}
		
		// vasu travels
		String place="";int amount=0, payable=0;
		System.out.println("Tell us place to travel ");
		place=scan.next();
		place=place.toLowerCase();
		switch(place) {
		case "chennai":case "villupuram":case "chengalpattu":
			System.out.println("We offer delux and Sleeper coaches to "+place);
			break;
		case "banglore":case "silkboard":case "hosur":case "madiwala":
			System.out.println("We offer semi sleeper and AC seater to "+place);
			break;
		case "trichy":
			System.out.println("We offer Seater delux to trichy");
			break;
		case "kanyakumari":case "madurai":case "sivakasi":case "rajapalayam":
			System.out.println("We offer AC sleeper and Seater to "+place);
			System.out.println("Enter the budget ");
			amount=scan.nextInt();
			if(amount>=200&&amount<=400) {
				System.out.println("AC Seater available fare is 350");
				System.out.println("Enter the fare ");
				payable=scan.nextInt();
				if(payable>=350) {
					System.out.println("Your ticket has booked to "+place+" in AC Seater");
				}
				else {
					System.out.println("Insufficient to travel "+place+" in AC seater");
				}
			}
			else if(amount>=401&&amount<=1000) {
				System.out.println("AC Sleeper available");
			}
			else {
				System.out.println(amount+" doesn't match");
			}
			break;
		default:System.out.println("invalid place "+place);
		}
		
		scan.close();
	}
}
