package SetpDefinations;

import java.util.Map;

import Utilities.ExcelHandler;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class LoginSteps {

	String testData;

	@Given("user wait for page laod")
	public void user_wait_for_page_laod() throws InterruptedException {
		Thread.sleep(2000);

	}

	@Given("I want to write test data for id {string}")
	public void i_want_to_write_test_data_for_id(String string) throws Exception {

		String testid = testData;
		System.out.println("iism,n,d" + testid);

		Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("./Fixture/test.xlsx", "TestData", testid);
		System.out.println(TestDataInMap.get("PassCode"));
	}

	@Before
	public void getData(Scenario sc)

	{

		String data = null;

		for (String tag : sc.getSourceTagNames()) {
			data = tag;
		}

		String arr[] = data.split("@");

		testData = arr[1];

	}
}
