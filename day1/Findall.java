package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import extraClass.Duration;

public class Findall {
	public static void main(String[] args) {
		ChromeDriver  driver= new ChromeDriver();
		driver.get(" https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		List<WebElement> phones1 = driver.findElements(By.className("a-price-whole"));
		int size = phones1.size();
		System.out.println(size);
		

	}

}
