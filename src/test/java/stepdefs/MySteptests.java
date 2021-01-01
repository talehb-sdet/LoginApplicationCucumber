package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
       // plugin = {"pretty","json:target","html:target"},
        features = "src/test/resources/features/LoginApplications.feature",
        glue = {"stepdefs"}
        )
@RunWith(Cucumber.class)
public class MySteptests {
}
