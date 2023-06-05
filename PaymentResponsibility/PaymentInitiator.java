package PaymentsResponsibility;

import ChainOfServers.Server;

abstract public class PaymentInitiator {
	
	protected PaymentInitiator paymentInitiator;
	
	public void nextPaymentMode(PaymentInitiator paymentInitiator)
	{
		this.paymentInitiator=paymentInitiator;
	}
	
	public abstract void paymentDetails(long paymentAmount);
}
