package SetpDefinations;

import org.openqa.selenium.WebDriver;

import com.avaya.manager.BrowserManager;


import io.cucumber.java.en.*;

public class Setup {
	
	@Given("user launches browser in {string}")
	public void user_launches_browser_in(String browserType) {
		BrowserManager.getInstance().intialsWebDriver(browserType);

	}

	@Given("user launches application using url {string}")
	public void user_launches_application_using_url(String url) {
		BrowserManager.getInstance();
		WebDriver driver = BrowserManager.getDriver();

		driver.get(url);
	}

}
