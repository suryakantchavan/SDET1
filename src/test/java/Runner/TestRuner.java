package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "Feature",dryRun=true
		 ,glue={"SetpDefinations"},tags="123"
		 )
public class TestRuner {


	
}


