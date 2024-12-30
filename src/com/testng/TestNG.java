package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority = -10 , invocationCount=3)
	public void sample_1() {
		System.out.println("SAMPLE_1");
	}
	
	@Test(priority = -8)
	public void sample_2() {
		System.out.println("SAMPLE_2");
	}
	
	@Test(priority = -6 , enabled=false)
	public void sample_3() {
		System.out.println("SAMPLE_3");
	}
	
	@Test(priority = -4 , dependsOnMethods="sample_8")
	public void sample_4() {
		System.out.println("SAMPLE_4");
	}
	
	@Test(priority = -2 , dependsOnMethods="sample_10" , alwaysRun=true)
	public void sample_5() {
		System.out.println("SAMPLE_5");
	}
	
	@Test(priority = 0)
	public void sample_6() {
		System.out.println("SAMPLE_6");
	}
	
	@Test(priority = 2)
	public void sample_7() {
		System.out.println("SAMPLE_7");
	}
	
	@Test(priority = 4)
	public void sample_8() {
		System.out.println("SAMPLE_8");
	}
	
	@Test(priority = 6)
	public void sample_9() {
		System.out.println("SAMPLE_9");
	}
	
	@Test(priority = 8)
	public void sample_10() {
		Assert.assertEquals(true, false);
		System.out.println("SAMPLE_10");
	}
	

}
