package com.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Blazedemopage extends Baseclass{
public Blazedemopage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='submit']")
private WebElement btnflights;
@FindBy(xpath="//input[@value='Choose This Flight']")
private WebElement btnchoose;
@FindBy(id="'inputName'")
private WebElement txtfirstname;
@FindBy(id="address")
private WebElement txtaddress;
@FindBy(id="city")
private WebElement txtcity;
@FindBy(id="state")
private WebElement txtstate;
@FindBy(id="zipCode")
private WebElement txtzipcode;
@FindBy(id="cardType")
private WebElement Ddncardtype;
@FindBy(id="creditCardNumber")
private WebElement txtccno;
@FindBy(id="creditCardMonth")
private WebElement txtmonth;
@FindBy(id="creditCardYear")
private WebElement txtyear;
@FindBy(id="nameOnCard")
private WebElement txtnameOnCard;
public WebElement getBtnflights() {
	return btnflights;
}
public void setBtnflights(WebElement btnflights) {
	this.btnflights = btnflights;
}
public WebElement getBtnchoose() {
	return btnchoose;
}
public void setBtnchoose(WebElement btnchoose) {
	this.btnchoose = btnchoose;
}
public WebElement getTxtfirstname() {
	return txtfirstname;
}
public void setTxtfirstname(WebElement txtfirstname) {
	this.txtfirstname = txtfirstname;
}
public WebElement getTxtaddress() {
	return txtaddress;
}
public void setTxtaddress(WebElement txtaddress) {
	this.txtaddress = txtaddress;
}
public WebElement getTxtcity() {
	return txtcity;
}
public void setTxtcity(WebElement txtcity) {
	this.txtcity = txtcity;
}
public WebElement getTxtstate() {
	return txtstate;
}
public void setTxtstate(WebElement txtstate) {
	this.txtstate = txtstate;
}
public WebElement getTxtzipcode() {
	return txtzipcode;
}
public void setTxtzipcode(WebElement txtzipcode) {
	this.txtzipcode = txtzipcode;
}
public WebElement getDdncardtype() {
	return Ddncardtype;
}
public void setDdncardtype(WebElement ddncardtype) {
	Ddncardtype = ddncardtype;
}
public WebElement getTxtccno() {
	return txtccno;
}
public void setTxtccno(WebElement txtccno) {
	this.txtccno = txtccno;
}
public WebElement getTxtmonth() {
	return txtmonth;
}
public void setTxtmonth(WebElement txtmonth) {
	this.txtmonth = txtmonth;
}
public WebElement getTxtyear() {
	return txtyear;
}
public void setTxtyear(WebElement txtyear) {
	this.txtyear = txtyear;
}
public WebElement getTxtnameOnCard() {
	return txtnameOnCard;
}
public void setTxtnameOnCard(WebElement txtnameOnCard) {
	this.txtnameOnCard = txtnameOnCard;
}
public void demopage() {
	click(getBtnflights());
	click(getBtnchoose());
	//typetext(, data);

}
}
