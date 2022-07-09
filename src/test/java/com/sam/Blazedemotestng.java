package com.sam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.Baseclass;

public class Blazedemotestng extends Baseclass {
@BeforeClass
private void beforeclass() {
	getdriver();
	loadurl("https://blazedemo.com/");
	max();
}
@Test
private void page() {
	

}
@AfterClass
private void afterclass() {
//closeallwindows();
}
}
