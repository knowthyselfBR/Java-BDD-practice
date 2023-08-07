package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstStep {
    WebDriver driver = new FirefoxDriver();
    @Given("I am on the Google search page")
    public void acessarSiteGoogle() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
        WebElement element = driver.findElement(By.name("q"));
        arg0 = "cheese";
        element.sendKeys(arg0);
        element.submit();
    }

    @Then("the page title should start with {string}")
    public void thePageTitleShouldStartWith(String arg0) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(arg0);
            }
        });
    }

    @After()
    public void closeBrowser() {
        //driver.quit();
    }
}
