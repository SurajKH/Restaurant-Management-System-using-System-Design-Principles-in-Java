
package PaymentsResponsibility;


public class CashPaymentMode extends PaymentInitiator{

	@Override
	public void paymentDetails(long paymentAmount) {
		
		if(paymentAmount>=50000 && paymentAmount<=100000)
		{
			System.out.println();
			System.out.println("Payment Mode: Cash");
			System.out.println("Note: Discount(5% OFF)");
			System.out.println("Total Payable Amount: "+((paymentAmount-(paymentAmount*5)/100)));
			System.out.println("Payment is Made using Cash Payment.");
			System.out.println();

		}
		
		else
		{
			paymentInitiator.paymentDetails(paymentAmount);
		}
		
	}

}
