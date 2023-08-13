package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.NameSearchModel;

import java.time.Duration;


public class MyStepdefs {
    WebDriver driver = new FirefoxDriver();
    static NameSearchModel login1 = new NameSearchModel("Clever0000", false);
    static NameSearchModel login2 = new NameSearchModel("Rafael0003", false);
    static NameSearchModel login3 = new NameSearchModel("Rafael0004", false);
    static NameSearchModel login4 = new NameSearchModel("LordDuarte", false);
    static NameSearchModel login5 = new NameSearchModel("Rafael0002", false);
    static NameSearchModel login6 = new NameSearchModel("Rafael0001", false);

    @Given("^that I am on webpage$")
    public void iAmOnWebPage() {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.muonline.com.br/?page=onlines");
    }
    @When("^I search for each item in list$")
    public void iSearchForEachItemInList() {

        //login1
        try {
            driver.findElement(By.xpath("//td[contains(text(),'Clever0000')]")).getText();
            login1.setOnline(true);
        } catch (Exception e) {
            login1.setOnline(false);
        }

        //login2
        try {
            driver.findElement(By.xpath("//td[contains(text(),'Rafael0003')]")).getText();
            login2.setOnline(true);
        } catch (Exception e) {
            login2.setOnline(false);
        }
        //login3
        try {
            driver.findElement(By.xpath("//td[contains(text(),'Rafael0004')]")).getText();
            login3.setOnline(true);
        } catch (Exception e) {
            login3.setOnline(false);
        }
        //login4
        try {
            driver.findElement(By.xpath("//td[contains(text(),'LordDuarte')]")).getText();
            login4.setOnline(true);
        } catch (Exception e) {
            login4.setOnline(false);
        }
        //login5
        try {
            driver.findElement(By.xpath("//td[contains(text(),'Rafael0002')]")).getText();
            login5.setOnline(true);
        } catch (Exception e) {
            login5.setOnline(false);
        }
        //login6
        try {
            driver.findElement(By.xpath("//td[contains(text(),'Rafael0001')]")).getText();
            login6.setOnline(true);
        } catch (Exception e) {
            login6.setOnline(false);
        }


    }
    @Then("^I show log status for each item in list$")
    public void iShowLogStatusForEachItemInList() {
        System.out.println(login1.getCharName() + ":" + login1.isOnline());
        System.out.println(login2.getCharName() + ":" + login2.isOnline());
        System.out.println(login3.getCharName() + ":" + login3.isOnline());
        System.out.println(login4.getCharName() + ":" + login4.isOnline());
        System.out.println(login5.getCharName() + ":" + login5.isOnline());
        System.out.println(login6.getCharName() + ":" + login6.isOnline());

        System.out.println("teste passou");
    }
}
