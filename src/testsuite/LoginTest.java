package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//child class of BaseTest
//this class inherits properties of browsers from the BaseTest class
//methods to login successfully and verifying the error message
public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in")); //finds the login link element and clicks
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//div/h1"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Not directed to page", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        driver.findElement(By.linkText("Log in")).click(); //clicking on login link
        driver.findElement(By.name("Email")).sendKeys("xyz789@gmail.com"); //finds the email field element and sends email address
        driver.findElement(By.id("Password")).sendKeys("1234567"); //finds the password field element and sends password
        driver.findElement(By.className("login-button")).click();  //finds the login button and clicks
        driver.findElement(By.xpath("//div//li//a[@class='ico-logout']")).click();  //finds the login button and clicks

    }

    @Test
    public void verifyTheErrorMessage() {

        driver.findElement(By.linkText("Log in")).click(); //clicking on login link
        driver.findElement(By.name("Email")).sendKeys("xxxxxxx@gmail.com"); //finds the email field element and sends email address
        driver.findElement(By.id("Password")).sendKeys("yyyyy"); //finds the password field element and sends password
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again. No customer account found";
        WebElement actualErrorMessage = driver.findElement(By.xpath("//button[contains(text(),'Log in']")); //Finds the element and locates the message
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage); //compares if expected and actual is equal
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
