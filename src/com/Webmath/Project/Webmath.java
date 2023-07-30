package com.Webmath.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webmath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chitti\\Desktop\\saritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://webmath.com/");
			driver.manage().window().maximize();
			WebElement algebraLink = driver.findElement(By.linkText("Algebra"));
            algebraLink.click();
            WebElement webMathLogo = driver.findElement(By.xpath("//img[@alt='WebMath - Solve your math problem today']"));
            webMathLogo.click();
           WebElement topicDropDown= driver.findElement(By.id("topicItem"));		
          Select selectFromTopicDropdown = new Select(topicDropDown);
          selectFromTopicDropdown.selectByVisibleText("Complex Numbers, Adding of");
          Thread.sleep(2000);
          WebElement inputcolumn =driver.findElement(By.xpath("//input[@maxlength=40]"));
          inputcolumn.sendKeys("2x+5");
          Thread.sleep(2000);
          WebElement addButton = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center/p[2]/input[1]"));
          addButton.click();
          Thread.sleep(2000);
          WebElement backToMathProblemLink= driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img"));
          backToMathProblemLink.click();
          Thread.sleep(2000);
          WebElement helpsection = driver.findElement(By.linkText("Help typing in your math problems"));
          helpsection.click();
          driver.navigate().back();
          Thread.sleep(2000);
          driver.navigate().back();
          Thread.sleep(2000);
          driver.navigate().back();  
          Thread.sleep(2000);
          driver.navigate().back();
          Thread.sleep(2000);
          driver.navigate().back();
          Thread.sleep(1000);
          WebElement powerssections = driver.findElement(By.linkText("Powers"));
          powerssections.click();
          Thread.sleep(2000);
          WebElement inputfield =driver.findElement(By.name("s"));
          inputfield.sendKeys("2^3");
          Thread.sleep(2000);
          WebElement simplify = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center/p[2]/input[1]"));
          simplify.click();
          Thread.sleep(2000);
          WebElement backToMathProblem= driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img"));
          backToMathProblem.click();
          Thread.sleep(2000);
          driver.navigate().back();
          WebElement difference = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[2]"));
		difference.click();
		WebElement diffoftwonumbers = driver.findElement(By.name("s"));
		diffoftwonumbers.sendKeys("2^3-2^2");
		WebElement factor = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input[1]"));
		factor.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.close();
			
		}
	}

}
