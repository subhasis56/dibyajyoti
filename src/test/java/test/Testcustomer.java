package test;

import org.testng.annotations.Test;

import generics.Basetest;
import pom.Customeractitime;
import pom.Loginactitime;

public class Testcustomer extends Basetest
{
	@Test
	public void cus() throws InterruptedException
	{
		Loginactitime log=new Loginactitime(driver);
		log.loginmethod();
		
		Customeractitime cus=new Customeractitime(driver);
		cus.customermethod();
		//cus.cancel();
		
		
	}

}
