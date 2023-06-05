package PaymentsResponsibility;

import ChainOfServers.FirstServer;

public class HybridPaymentMode extends PaymentInitiator{

	@Override
	public void paymentDetails(long paymentAmount) {
		
		if(paymentAmount>100000)
		{
			System.out.println();
			System.out.println("Payment Mode: Cash and Card(Hybrid Payment Model)");
			System.out.println("Note: Discount(12% OFF)");
			System.out.println("Total Payable Amount: "+((paymentAmount-(paymentAmount*12)/100)));
			System.out.println("Payment is Made using Cash and Card(Hybrid Payment Model) Payment.");
			System.out.println();

		}
		
		else
		{
			paymentInitiator.paymentDetails(paymentAmount);
		}
		
	}

}
