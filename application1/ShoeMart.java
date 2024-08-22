package com.evergent.rohith.application1;

import java.util.*;
import java.io.*;



import java.util.*;
import java.io.*;

public class ShoeMart {
	enum mainModule {
		O, P, R, E
	};

	enum categories {
		M, W
	};

	enum shoeType {
		CW, SS, FW
	};

	enum submodule1 {
		F, S, M
	};

	enum submodule2 {
		T, P, M
	};

	enum submodule3 {
		I, S, M
	};

	enum shoecode {
		A, B
	}

	static int menuitemcost;
	static int amount;
	static int noOfShoes;
	static int amountdisc;
	static int additionalitemcost;

	public static void main(String[] args) throws IOException {
		String module = null;

		Scanner br = new Scanner(System.in);

		System.out.println("\n\t\t \t\t WELCOME TO EVERGENT SHOE MART\t\t \t\t");
		while (true) {

			System.out.println("======================");
			System.out.println(" Main Menu");
			System.out.println("======================");
			System.out.println("O-Order Module");
			System.out.println("P-Payment Module");
			System.out.println("R-Report Module");
			System.out.println("E-Quit Module");
			System.out.println("======================");
			System.out.println("Enter your Module code (O,P,R,E) : ");
			
			module = br.nextLine();
			System.out.println("You entered module is  : ");
			switch (mainModule.valueOf(module)) {

				case O:

					System.out.println(" ORDER MODULE");
					System.out.println("======================");
					System.out.println("F-to place order for shoes");
					System.out.println("S-to place for other services");
					System.out.println("M-Return to Main Menu");
					System.out.println("======================");
					System.out.println("Enter your Module code (F,S,M) : ");

					module = br.nextLine();
					switch (submodule1.valueOf(module)) {

						case F:
							System.out.println(" SHOE MODULE");
							System.out.println("======================");
							System.out.println("YOU HAVE TO SELECT THE CATEGORIES");
							System.out.println("M- FOR MEN");
							System.out.println("W- FOR WOMEN");
							System.out.println("======================");
							System.out.println("Enter your Module code (M,W) : ");

							module = br.nextLine();

							switch (categories.valueOf(module)) {

								case M:
									System.out.println(" MEN CATEGORY");
									System.out.println("======================");
									System.out.println("YOU HAVE TO SELECT THE TYPE OF SHOE");
									System.out.println("CW- FOR CASUAL WEAR");
									System.out.println("SS- FOR SPORT SHOES");
									System.out.println("FW- FOR FORMAL WEAR");
									System.out.println("======================");
									System.out.println("Enter your Module code (CW,SS,FW) : ");

									module = br.nextLine();

									switch (shoeType.valueOf(module)) {

										case CW:

											System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
									 		System.out.println("===============================================");
									 		System.out.println("A.CANVAS \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS400.00");
									 		System.out.println("");
									 		System.out.println("B.HIGH HEEL \t BLUE \n \t\t WHITE \n\t  \t\t\t RS500.00");
									 		System.out.println("===============================================");
									 		System.out.println("Enter your shoe code (A,B) : ");

											module = br.nextLine();
											System.out.println("SELECT SHOE COLOR :");
											String s = br.next();
											System.out.println("SELECT THE SHOE SIZE");
											int size = br.nextInt();
											if (size < 10)
												System.out.println("SHOE AVAILABLE");
											else
												System.out.println(
														"shoe size is not available,please enter another size");
											switch (shoecode.valueOf(module)) {

												case A:
													menuitemcost = 400;
													break;
												case B:
													menuitemcost = 500;
													break;
											}
											break;
										case SS:

											System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
									 		System.out.println("===============================================");
									 		System.out.println("A.RUNNING \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS400.00");
									 		System.out.println("");
									 		System.out.println("B.GYM \t\t BLUE \n \t\t WHITE \n\t  \t\t\t RS500.00");
									 		System.out.println("===============================================");
									 		System.out.println("Enter your shoe code (A,B) : ");

											module = br.nextLine();
											System.out.println("SELECT SHOE COLOR :");
											String s3 = br.next();
											System.out.println("SELECT THE SHOE SIZE");
											int size3 = br.nextInt();
											if (size3 < 10)
												System.out.println("SHOE AVAILABLE");
											else
												System.out.println(
														"shoe size is not available,please enter another size");
											switch (shoecode.valueOf(module)) {

												case A:
													menuitemcost = 400;
													break;
												case B:
													menuitemcost = 500;
													break;
											}
											break;
										case FW:

											System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
											System.out.println("===============================================");
											System.out.println("A.OFFICE WEAR \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS900.00");
											System.out.println("");
											System.out.println("B.PARTY WEAR \t BLUE \n \t\t WHITE \n\t  \t\t\t RS800.00");
											System.out.println("===============================================");
											System.out.println("Enter your shoe code (A,B) : ");
											
											module = br.nextLine();
											System.out.println("SELECT SHOE COLOR :");
											String s2 = br.next();
											System.out.println("SELECT THE SHOW SIZE");
											int size2 = br.nextInt();
											if (size2 < 10)
												System.out.println("SHOE AVAILABLE");
											else
												System.out.println(
														"shoe size is not available,please enter another size");
											switch (shoecode.valueOf(module)) {

												case A:
													menuitemcost = 900;
													break;
												case B:
													menuitemcost = 800;
													break;
											}
											break;
									}
									System.out.println("Enter the number of pairs");

									noOfShoes = br.nextInt();// Integer.parseInt(module);
									System.out.println("you selected no of Shoes are " + noOfShoes);
									amount = menuitemcost * noOfShoes;
											System.out.println("Amount for ordered food before discount is Rs" + amount);
											if (noOfShoes >= 1 && noOfShoes <= 25)
												amountdisc = (int) (amount - (amount * 0.00));
											if (noOfShoes >= 26 && noOfShoes <= 50)
												amountdisc = (int) (amount - (amount * 0.03));
											else if (noOfShoes >= 51 && noOfShoes <= 100)
												amountdisc = (int) ((amount - noOfShoes * 0.05));
											else if (noOfShoes >= 101 && noOfShoes <= 200)
												amountdisc = (int) ((amount - noOfShoes * 0.08));
											else if (noOfShoes >= 251)
												amountdisc = (int) ((amount - noOfShoes * 0.10));

											System.out.println(
													"Amount for ordered shoes after Discount for selected pairs is  Rs"
															+ amountdisc);

									break;

								case W:
									System.out.println(" WOMEN CATEGORY");
									System.out.println("======================");
									System.out.println("YOU HAVE TO SELECT THE TYPE OF SHOE");
									System.out.println("CW- FOR CASUAL WEAR");
									System.out.println("SS- FOR SPORT SHOES");
									System.out.println("FW- FOR FORMAL WEAR");
									System.out.println("======================");
									System.out.println("Enter your Module code (CW,SS,FW) : ");
									module = br.nextLine();

									switch (shoeType.valueOf(module)) {

										case CW:

											System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
									 		System.out.println("===============================================");
									 		System.out.println("A.CANVAS \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS400.00");
									 		System.out.println("");
									 		System.out.println("B.HIGH HEEL \t BLUE \n \t\t WHITE \n\t  \t\t\t RS500.00");
									 		System.out.println("===============================================");
									 		System.out.println("Enter your shoe code (A,B) : ");

											module = br.nextLine();
											System.out.println("SELECT SHOE COLOR :");
											String str = br.next();
											System.out.println("select the size");
											int size1 = br.nextInt();
											if (size1 < 10)
												System.out.println("shoe available");
											else
												System.out.println(
														"shoe size is not available,please enter another size");
											switch (shoecode.valueOf(module)) {

												case A:
													menuitemcost = 400;
													break;
												case B:
													menuitemcost = 500;
													break;
											}
											break;
										case SS:
											System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
									 		System.out.println("===============================================");
									 		System.out.println("A.RUNNING \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS400.00");
									 		System.out.println("");
									 		System.out.println("B.GYM \t\t BLUE \n \t\t WHITE \n\t  \t\t\t RS500.00");
									 		System.out.println("===============================================");
									 		System.out.println("Enter your shoe code (A,B) : ");
									 		
											module = br.nextLine();
											System.out.println("SELECT SHOE COLOR :");
											String str2 = br.next();
											System.out.println("select the size");
											int size5 = br.nextInt();
											if (size5 < 10)
												System.out.println("shoe available");
											else
												System.out.println(
														"shoe size is not available,please enter another size");
											switch (shoecode.valueOf(module)) {

												case A:
													menuitemcost = 600;
													break;
												case B:
													menuitemcost = 500;
													break;
											}
											break;

										case FW:

											System.out.println("ITEM \t AVAILABLE COLORS  \t CHARGE PER PAIR ");
											System.out.println("===============================================");
											System.out.println("A.OFFICE WEAR \t WHITE \n \t\t BLACK\n\t\t GREEN   \t RS900.00");
											System.out.println("");
											System.out.println("B.PARTY WEAR \t BLUE \n \t\t WHITE \n\t  \t\t\t RS800.00");
											System.out.println("===============================================");
											System.out.println("Enter your shoe code (A,B) : ");

											module = br.nextLine();
											System.out.println("SELECT SHOE COLOR :");
											String str3 = br.next();
											System.out.println("select the size");
											int size6 = br.nextInt();
											if (size6 < 10)
												System.out.println("shoe available");
											else
												System.out.println(
														"shoe size is not available,please enter another size");
											switch (shoecode.valueOf(module)) {

												case A:
													menuitemcost = 900;
													break;
												case B:
													menuitemcost = 800;
													break;
											}
											break;
									}
									System.out.println("Enter the number of pairs");

											noOfShoes = br.nextInt();
											System.out.println("you selected no of guests are " + noOfShoes);
											amount = menuitemcost * noOfShoes;

											System.out
													.println("Amount for ordered food before discount is Rs" + amount);
											if (noOfShoes >= 1 && noOfShoes <= 25)
												amountdisc = (int) (amount - (amount * 0.00));
											if (noOfShoes >= 26 && noOfShoes <= 50)
												amountdisc = (int) (amount - (amount * 0.03));
											else if (noOfShoes >= 51 && noOfShoes <= 100)
												amountdisc = (int) ((amount - noOfShoes * 0.05));
											else if (noOfShoes >= 101 && noOfShoes <= 200)
												amountdisc = (int) ((amount - noOfShoes * 0.08));
											else if (noOfShoes >= 251)
												amountdisc = (int) ((amount - noOfShoes * 0.10));

											System.out.println(
													"Amount for ordered shoes after Discount for selected pairs is  Rs"
															+ amountdisc);
									break;
							}
							break;
						case S:
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

							module = br.nextLine();

							int i = Integer.parseInt(module);
							switch (i) {

								case 1:
									additionalitemcost = 50;
									break;
								case 2:
									additionalitemcost = 40;
									break;
								case 3:
									additionalitemcost = 200;
									break;
							}

							System.out.println("Your Additional Cost : Rs " + additionalitemcost);

							break;
					}
          br.nextLine();
					break;
				case P:
					System.out.println(" PAYMENT MODULE");
					System.out.println("======================");
					System.out.println("T-to display total amount to be paid");
					System.out.println("P-to make payment");
					System.out.println("M-Return to Main Menu");
					System.out.println("======================");
					System.out.println("Enter your Module code (T,P,M) : ");

					module = br.nextLine();
					switch (submodule2.valueOf(module)) {

						case T:
							System.out.println("Total Amount to be Paid : Rs" + (amount + additionalitemcost));

							break;
						case P:
							System.out.println("To Make Payment : Rs" + (amountdisc + additionalitemcost));
							System.out.println("payment Done");
							break;
					}
					break;
				case R:

					System.out.println(" REPORT MODULE");
					System.out.println("======================");
					System.out.println("I-to dispaly invoice for order mode");
					System.out.println("S-to display the summary of orders and payments made");
					System.out.println("M-Return to Main Menu");
					System.out.println("======================");
					System.out.println("Enter your Module code (I,S,M) : ");

					module = br.nextLine();
					switch (submodule3.valueOf(module)) {

						case I:
							System.out.println("INVOICE DISPLAY");
							System.out.println("==================");
							System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
							System.out.println("you selected no of pairs are " + noOfShoes);
							System.out.println("To Make Payment : Rs" + (amountdisc + additionalitemcost));

							break;
						case S:
							System.out.println("SUMMARY OF ORDER");
							System.out.println("======================");
							System.out.println("you selected Shoe cost Rs" + amount);
							System.out.println("you selected no of pairs are " + noOfShoes);
							System.out
									.println("Amount for shoes after Discount for selected pairs is  Rs" + amountdisc);
							System.out.println("Your Additional Cost : Rs " + additionalitemcost);
							System.out.println("\n");
							System.out.println("Total Amount to be Paid : Rs" + (amount + additionalitemcost));
							System.out.println("To Make Payment : Rs" + (amountdisc + additionalitemcost));
							System.out.println("Payment Done");

							break;
					}
					break;
				case E:
					System.out.println("QUIT MODULE");
					System.exit(0);
					break;

			}
		}
	}
}
		


