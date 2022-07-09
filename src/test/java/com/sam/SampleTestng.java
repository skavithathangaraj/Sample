package com.sam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTestng {

	@BeforeClass
	private void beforeClass() {
		System.out.println("beforeclass");

	}
	@BeforeSuite
	private void beforesuite() {
		System.out.println("before suite");

	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");

	}
	@Test(priority=0)
	private void test() {
	System.out.println("test0");
	}
	@Test(priority=-9)
	private void test1() {
    System.out.println("test1");

	}
	@Test(invocationCount=2)
	private void test2() {
		System.out.println("test2");

	}
	@Test
	private void test3() {
		System.out.println("test3");

	}
	@Test(enabled=false)
	private void test4() {
		System.out.println("test4");

	}
	@AfterSuite
	private void aftersuite() {
		System.out.println("aftersuite");
    }
	@AfterMethod
	private void aftermethod() {
    System.out.println("aftermathod");

	}
	@AfterClass
	private void afterclass() {
		System.out.println("afterclass");

	}

}
