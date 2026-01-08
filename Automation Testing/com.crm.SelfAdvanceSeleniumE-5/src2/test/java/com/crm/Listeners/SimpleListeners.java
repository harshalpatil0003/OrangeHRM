package com.crm.Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;

@Listeners(com.crm.Listeners.Simple.class)
public class SimpleListeners extends BaseClass1{

	@Test
	public void main1() {
		assertEquals("java", "java", "it is not equal");
		Reporter.log("it is equal", true);
	}
	
}
