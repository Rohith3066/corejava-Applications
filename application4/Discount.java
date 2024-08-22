package com.evergent.rohith.application4;

final public class Discount { 
static int amount;
static int amountdisc;
int shoes ;

public Discount(int shoes) {
	this.shoes = shoes;
}
	public void method() {
	amount = OrderModule.menuitemcost * shoes;
	System.out
			.println("Amount for ordered shoe before discount is Rs" + amount);
	if (shoes >= 0 && shoes <= 2)
		amountdisc = (int) (amount - (amount * 0.1));
	if (shoes >= 3 && shoes <= 5)
		amountdisc = (int) (amount - (amount * 0.03));
	else if (shoes >= 6 && shoes <= 10)
		amountdisc = (int) ((amount - shoes * 0.05));
	else if (shoes>= 11 && shoes <= 20)
		amountdisc = (int) ((amount - shoes * 0.08));
	else if (shoes >= 20)
		amountdisc = (int) ((amount - shoes* 0.10));

	System.out.println(
			"Amount for ordered shoes after Discount for selected pairs is  Rs"
					+ amountdisc);
	}

}
