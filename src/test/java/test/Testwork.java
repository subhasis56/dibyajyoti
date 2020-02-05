package test;

import org.testng.annotations.Test;

import generics.Basetest;
import pom.Loginactitime;
import pom.Workactitime;

public class Testwork extends Basetest
{
	@Test
	public void workon() throws InterruptedException
	{
		Loginactitime log=new Loginactitime(driver);
		log.loginmethod();
		
		Workactitime work=new Workactitime(driver);
		work.workmethod();
		work.status();
		
	}

}
