package demoTestNG.test2;

import org.testng.annotations.Test;

public class paymenttest {
	@Test 
	public void upiPayment()
	{
		System.out.println("inside upiPayment");
	}

	@Test 
	public void netBanking()
	{
		System.out.println("inside Netbanking");
	}
	@Test 
	public void creditcardpayment()
	{
		System.out.println("inside creditcardPayment");
	}


}
