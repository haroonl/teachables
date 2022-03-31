package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class stepDefs {

    ChromeDriver browser;

    @Given("^I am on the login webpage \"([^\"]*)\"$")
    public void i_am_on_the_login_webpage(String url)  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\16317\\IdeaProjects\\teachables\\browser\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get(url);
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    }

    @When("^I enter the username \"([^\"]*)\"$")
    public void i_enter_the_username(String emaill)  {
        browser.findElement(By.id("email")).sendKeys(emaill);
        browser.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);

    }

    @When("^I enter the password \"([^\"]*)\"$")
    public void i_enter_the_password(String pass) {
        browser.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
        browser.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    }

    @When("^I click Login$")
    public void i_click_Login() {
        browser.findElement(By.xpath("//input[@name='commit']")).click();
        browser.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    }


    @Then("^I click on show password button$")
    public void iClickOnShowPasswordButton() {
        browser.findElement(By.xpath("//*[@id='icon-e']")).click();
    }

    @When("^I press the forgot password button$")
    public void iPressTheForgotPasswordButton() {
        browser.findElement(By.linkText("Forgot Password")).click();
    }

    @When("^I click remember me checkbox$")
    public void iClickRememberMeCheckbox() {
        browser.findElement(By.xpath("//input[@id=\"remember_me\"]")).click();
        browser.findElement(By.xpath("//input[@id=\"remember_me\"]")).click();

    }

    @When("^I click sign up$")
    public void iClickSignUp() {
        browser.findElement(By.linkText("Sign up")).click();
    }
}
