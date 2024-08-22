package com.evergent.rohith.application4;
import java.util.*;
public class OrderModule {
	Scanner sc = new Scanner(System.in);
	static int menuitemcost =0;
	static int additionalitemcost=0;
	static int totalamount;
	String s1;
	String s2;
	static{
		System.out.println("WELCOME TO EVERGENT SHOE MART");
		System.out.println("YOU ARE IN ORDER MODULE");
	}
	public void placeOrder() {
		System.out.println(" SHOE CATEGORY");
		System.out.println("======================");
		System.out.println("YOU HAVE TO SELECT THE TYPE OF SHOE");
		System.out.println("CW- FOR CASUAL WEAR");
		System.out.println("SS- FOR SPORT SHOES");
		System.out.println("FW- FOR FORMAL WEAR");
		System.out.println("Q- FOR QUIT THE MODULE");
		System.out.println("======================");
		System.out.println("Enter your Module code (CW,SS,FW,Q) : ");
		 s1 = sc.next();
		if(s1.equals("CW")) {
			System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
	 		System.out.println("===============================================");
	 		System.out.println("A.CANVAS \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS400.00");
	 		System.out.println("");
	 		System.out.println("B.HIGH HEEL \t BLUE \n \t\t WHITE \n\t  \t\t\t RS500.00");
	 		System.out.println("===============================================");
	 		System.out.println("Enter your shoe code (A,B) : ");
	 		s2 = sc.next();
			if(s2.equals("A")) {
				menuitemcost = 400;
			}else {
				menuitemcost = 500;
			}
		}
		else if(s1.equals("ss")) {
				System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
		 		System.out.println("===============================================");
		 		System.out.println("A.RUNNING \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS400.00");
		 		System.out.println("");
		 		System.out.println("B.GYM \t\t BLUE \n \t\t WHITE \n\t  \t\t\t RS500.00");
		 		System.out.println("===============================================");
		 		System.out.println("Enter your shoe code (A,B) : ");
		 		String s3 = sc.next();
				if(s3.equals("A")) {
					menuitemcost = 600;
				}else {
					menuitemcost = 500;
				}
			}
		else if(s1.equals("FW")){
			System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
			System.out.println("===============================================");
			System.out.println("A.OFFICE WEAR \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS900.00");
			System.out.println("");
			System.out.println("B.PARTY WEAR \t BLUE \n \t\t WHITE \n\t  \t\t\t RS800.00");
			System.out.println("===============================================");
			System.out.println("Enter your shoe code (A,B) : ");
 		s2 = sc.next();
		if(s2.equals("A")) {
			menuitemcost = 900;
		}else {
			menuitemcost = 800;
		}
		}
		else {
			System.out.println("QUIT MODULE");
			System.exit(0);
		}
}
	
	public void otherServices() {
		System.out.println("==============================================");
		System.out.println("SERVICE MODULE");
		System.out.println("==============================================");
		System.out.println("Item \t Description   ");
		System.out.println(
				"========================================================================");
		System.out.println("1 \t socks \t\t   Rs50.00 per pair");
		System.out.println("");
		System.out.println("2 \t lace \t\t Rs40.00 per pair");
		System.out.println("");
		System.out.println("3 \t polish kit \t Rs200.00 for one");
		System.out.println("");
		System.out.println(
				"========================================================================");
		System.out.println("Enter your Menu code (1,2,3) : ");
		int n = sc.nextInt();
		if(n == 1 )
			additionalitemcost = 50;
		else if(n==2)
			additionalitemcost =40;
		else
			additionalitemcost = 200;
	}
	public void display() {
		totalamount = menuitemcost+additionalitemcost;

	}
}

