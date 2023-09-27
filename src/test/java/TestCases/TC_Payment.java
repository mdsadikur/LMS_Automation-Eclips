	package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Payment;
import base.DriverSetup;

public class TC_Payment extends DriverSetup{
	
	@Test
	public void payment() throws InterruptedException {
		
		POM_Payment payment = new POM_Payment(driver);
		
		payment.paymentRecievedOnline();
		Thread.sleep(1000);
		
		payment.offlinePayment();
		Thread.sleep(1000);
		
		payment.bankPayment();
		Thread.sleep(1000);
	}

}
