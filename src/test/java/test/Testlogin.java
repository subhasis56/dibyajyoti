package test;

import org.testng.annotations.Test;

import generics.Basetest;

import pom.Loginactitime;

public class Testlogin extends Basetest
{
	@Test(enabled=false)
	public void login()
	{
		Loginactitime log=new Loginactitime(driver);
		log.loginmethod();
	
		
		
	}

}
