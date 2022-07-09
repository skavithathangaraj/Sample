package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	// 1
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2
	public void movetoelement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	// 3
	public void dragdrop(WebElement src, WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, dest).perform();
	}

	// 4
	public void clickclick(WebElement element) {

		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 5
	public void rightclick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	// 6
	public void ok() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// 7
	public void cancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// 8
	public String promptalert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;

	}

	// 9
	public void getsendtext(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);

	}

	// 10
	public void selectbytext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	// 11
	public void selectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 12
	public void selectbyvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	// 13
	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;

	}

	// 14
	public List<WebElement> getallselectedoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;

	}

	// 15
	public WebElement getfirstselectedoption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 16
	public boolean ismultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 17
	public void deselectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 18
	public void deselectbyvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 19
	public void deselectbyvisibletext(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
	}

	// 20
	public void deselectall(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}


	
		
	// 24
	public static void loadurl(String url) {
		driver.get(url);
	}

	// 25
	public void typetext(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 26
	public void click(WebElement element) {
		element.click();

	}

	// 27
	public WebElement findelementsbyid(String attributename) {
		WebElement Element = driver.findElement(By.id(attributename));
		return Element;

	}

	// 28
	public WebElement findelementsbyname(String attributename) {
		WebElement Element = driver.findElement(By.name(attributename));
		return Element;
	}

	// 29
	public WebElement findelementsbyclass(String attributename) {
		WebElement Element = driver.findElement(By.className(attributename));
		return Element;
	}

	// 30
	public WebElement findelementsbyxpath(String xpath) {
		WebElement Element = driver.findElement(By.xpath(xpath));
		return Element;
	}

	// 31
	public static void max() {
		driver.manage().window().maximize();

	}

	// 32
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;

	}

	// 33
	public String getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 34
	public String getattribute(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	// 35
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}

	// 36
	public String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 37
	public static void closeallwindows() {
		driver.quit();
	}

	// 38
	public void closecurrentwindow() {
		driver.close();
	}

	// 39
	public void typejs(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
	}                                                              
//40
	public void clickjs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	//41
	public void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	//42
	public void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}
     //43
	public void pagescreenshot() {
		TakesScreenshot screen = (TakesScreenshot) driver;
		screen.getScreenshotAs(OutputType.FILE);
	}
     //44
	public File elementscreenshot(WebElement element) {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
     //45
	public void copyfile(WebElement element, String path) throws IOException {
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}
	
	//48
	public void actionsendkeys(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.sendKeys(element, data);
	}
//49
	public void frameid(String id) {
		driver.switchTo().frame(id);
	}
//50
	public void frameelement(WebElement element) {
		driver.switchTo().frame(element);
	}
//51
	public void frameindex(int index) {
		driver.switchTo().frame(index);
	}
	//52
	public String getparentwindow() {
		String handle = driver.getWindowHandle();
		return handle;

	}
	//53
	public Set<String> gatallwindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}
	//54
	public void staticwait() throws InterruptedException {
		Thread.sleep(3000);

	}
	//55
	public List<WebElement> multitagname(String data) {
		List<WebElement> findElements = driver.findElements(By.tagName(data));
		return findElements;

	}
//56
	public WebElement tagname1(String data) {
		WebElement findElement = driver.findElement(By.tagName(data));
		return findElement;
		
	}
	

}
