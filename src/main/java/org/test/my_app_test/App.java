package org.test.my_app_test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Hello World!");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);

		// 1. Open the URL
		// driver.get("http://13.58.166.105:8080/addressbook-2.0/");
		driver.get("http://18.116.112.116:8081/contact.html");
		// invoke implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		driver.findElement(By.name("your_name")).sendKeys("Shubham");
		
		driver.findElement(By.name("phone_number")).sendKeys("999999999");
		
		driver.findElement(By.name("email_address")).sendKeys("xyz@abc.com");
		
		driver.findElement(By.name("your_message")).sendKeys("Hello, How are you?");
		
		driver.findElement(By.id("my-button")).click();
	
		//assert Result
		String message = driver.findElement(By.id("response")).getText();
		
		System.out.println(message);
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File("test-report.jpg");

		FileUtils.copyFile(srcFile, destFile);

		driver.quit();

		System.out.println("Script Executed and Result Captured");
		
		
		/*
		 * //2. locate new contact button and click
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).
		 * click(); //3. locate firstname and enter
		 * driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham"); //4. locate last
		 * name and enter lastname
		 * driver.findElement(By.id("gwt-uid-7")).sendKeys("kushwah"); //5. locate phone
		 * number and enter phone number
		 * driver.findElement(By.id("gwt-uid-9")).sendKeys("99999999");
		 * 
		 * //6. locate email and enter email
		 * driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@xyz.com");
		 * 
		 * //7. locate birth date and enter birth date
		 * driver.findElement(By.id("gwt-uid-13")).sendKeys("12/09/2024,");
		 * 
		 * 
		 * //8. locate save button and click save button driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div"
		 * )).click(); Thread.sleep(4000);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		 * 
		 * driver.getTitle();
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		 * 
		 * WebElement textBox = driver.findElement(By.name("my-text")); WebElement
		 * password = driver.findElement(By.xpath(
		 * "/html/body/main/div/form/div/div[1]/label[2]/input")); WebElement textarea =
		 * driver.findElement(By.name("my-textarea"));
		 * 
		 * 
		 * WebElement submitButton = driver.findElement(By.cssSelector("button"));
		 * Thread.sleep(2000); textBox.sendKeys("Selenium"); Thread.sleep(1000);
		 * password.sendKeys("shubham"); Thread.sleep(1000);
		 * textarea.sendKeys("Hello, How are you ?"); submitButton.click();
		 * Thread.sleep(2000); WebElement message =
		 * driver.findElement(By.id("message")); System.out.println(message.getText());
		 * 
		 * 
		 * //capture screenshot
		 */
		
	}
}
