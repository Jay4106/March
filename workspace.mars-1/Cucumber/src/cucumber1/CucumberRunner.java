package cucumber1;

import cucumber.api.junit.Cucumber;

@RunWith(cucumber.class)
@Cucumber.Options{
	format = {"pretty", "json:target/"},
	features = {"src/cucumber1"}
}
public class CucumberRunner {

	

}
