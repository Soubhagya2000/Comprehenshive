package com.mindtrre.Comprehenshive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class script2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//a[@href='/en-us/shop']"))).build().perform();
        driver.findElement(By.xpath("(//a[@href='/en-us/shop/special-needs/stain-removal'])[1]")).click();
        driver.close();
		

	}

}
