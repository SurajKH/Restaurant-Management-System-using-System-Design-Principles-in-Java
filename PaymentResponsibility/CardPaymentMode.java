package PaymentsResponsibility;


public class CardPaymentMode extends PaymentInitiator{

	@Override
	public void paymentDetails(long paymentAmount) {
		
		if(paymentAmount<=50000)
		{
			System.out.println();
			System.out.println("Payment Mode: Card");
			System.out.println("Note: Card Discount(10% OFF)");
			System.out.println("Total Payable Amount: "+(paymentAmount-((paymentAmount*10)/100)));
			System.out.println("Payment is Made using Card Payment.");
			System.out.println();

		}
		
		else
		{
			paymentInitiator.paymentDetails(paymentAmount);
		}
		
	}

}
