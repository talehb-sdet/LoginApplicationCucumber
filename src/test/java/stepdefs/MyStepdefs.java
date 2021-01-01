package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import gherkin.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MyStepdefs extends BaseTest {
   public WebDriver driver;





    @Given("^user launch a browser \"([^\"]*)\"$")
    public void userLaunchABrowser(String browser) throws Throwable {
     Thread.sleep(3000);
     setUp();


    }

    @And("^Amazon is launched$")
    public void amazonIsLaunched() throws InterruptedException {
     //Thread.sleep(3000);

     //*[@id="ac-gn-bag"]/div/a
     //*[contains(text(), 'Sign in')]
//     Actions action=new Actions(driver);
//     action.moveToElement(helloSignIn);
//     action.build().perform();
//     Thread.sleep(4000);
//     action.moveToElement(subMenu);
//     action.click().build().perform();


        //helloSignIn.click();
        //helloSignIn.click();
    }


    @When("^user navigates to sign in page$")
    public void userNavigatesToSignInPage() {
    }

   



    @And("^user enters \"([^\"]*)\" and \"([^\"]*)\" and clicks on login button$")
    public void userEntersAndAndClicksOnLoginButton(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verify user is on Homepage$")
    public void verifyUserIsOnHomepage() {
    }




 @Then("^verify user is not on Homepage$")
 public void verifyUserIsNotOnHomepage() {
 }
}
