package Utilities;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.avaya.manager.BrowserManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		BrowserManager.getInstance().intialsWebDriver("chrome");

		WebDriver driver = BrowserManager.getDriver();

		driver.get("https://www.noon.com/uae-en/");

		Thread.sleep(300);

		boolean ans = true;

		int count = 0;
		while (ans) {
			try {

				ans = driver.findElement(By.xpath(
						"//*[@id='__next']/div/section/div/div/div[3]/div/div[1]/div/div/div/div/div/div[2]/div[2]"))
						.isDisplayed();

				List<WebElement> ele = driver.findElements(By
						.xpath("//h3[contains(text(),'Recommended For You')]/following::div[@data-qa='product-name']"));
				for (WebElement e : ele) {
					System.out.println(e.getText());
				}

				driver.findElement(By.xpath(
						"//*[@id='__next']/div/section/div/div/div[3]/div/div[1]/div/div/div/div/div/div[2]/div[2]"))
						.click();
			}

			catch (ElementNotInteractableException e) {

			}

			count++;
		}

		System.out.println("count is ________" + count);
	}

}
