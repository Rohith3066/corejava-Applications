package com.evergent.rohith.application4;

public class MainClass extends ReportModule implements PaymentModule{
	static int noOfShoes;
	 int size;
	public MainClass() {
	}

	public MainClass(int noOfShoes,int size) {
		this.noOfShoes = noOfShoes;
		this.size = size;
	}
	public void displayamount() {
		System.out.println("==================");
	System.out.println("DISPLAYING THE TOTAL AMOUNT" + Discount.amountdisc);
	}

	public void toMakePayment() {
		System.out.println("==================");
		System.out.println("THIS IS THE TOTAL AMOUNT TO BE PAID");	
		System.out.println("==================");
		System.out.println("PAYMENT DONE");
	}
	public void invoice() {
		System.out.println("==================");
		System.out.println("INVOICE ");
		System.out.println("==================");
		System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
		System.out.println("you selected no of pairs are " + noOfShoes);
		System.out.println("To Make Payment : Rs" + Discount.amountdisc);
	}

	public void ordersummary() {
		System.out.println("==================");
		System.out.println("SUMMARY OF ORDER");
		System.out.println("======================");
		System.out.println("you selected Shoe cost Rs" + OrderModule.menuitemcost);
		System.out.println("you selected Shoe size" + size);
		System.out.println("you selected no of pairs are " + noOfShoes);
		System.out
				.println("Amount for shoes after Discount for selected pairs is  Rs" + Discount.amountdisc);
		System.out.println("Your Additional Cost : Rs " + OrderModule.additionalitemcost);
		System.out.println("\n");
				
	}

	public static void main(String[] args) {
		MainClass main = new MainClass();
		OrderModule o = new OrderModule();
		ReportModule r = new MainClass(2,8);
		Discount d = new Discount(noOfShoes);
		o.placeOrder();
		o.otherServices();
		o.display();
		d.method();	
		main.displayamount();
		main.toMakePayment();
		
		r.invoice();
		r.ordersummary();
		
			
	}	
}
