package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the computer button and clicks
        String expectedText = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//button[contains(@class, 'register-button')]"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        driver.findElement(By.xpath("//button[contains(@class, 'register-button')]")).click();  //finds the element of register
        driver.findElement(By.xpath("//div//span[starts-with(@class, 'female')]")).click();  //finds the element of gender radio button
        driver.findElement(By.xpath("//input[starts-with(@id, 'FirstName')])]")).sendKeys("Prime");  //finds the element of first name
        driver.findElement(By.xpath("//input[starts-with(@id, 'LastName')])]")).sendKeys("Testing");  //finds the element of last name
        driver.findElement(By.xpath("//select[contains(@name, 'DateOfBirthDay')]")).sendKeys("1");  //finds the element of date of birth
        driver.findElement(By.xpath("//select[contains(@name, 'DateOfBirthMonth')]")).sendKeys("3");  //finds the element of date of month
        driver.findElement(By.xpath("//select[contains(@name, 'DateOfBirthYear')]")).sendKeys("2007");  //finds the element of dat of year
        driver.findElement(By.xpath("//input[contains(@name, 'Email') and @id='Email']")).sendKeys("momo123@gmail.com");  //finds the element of email id
        driver.findElement(By.xpath("//input[contains(@name, 'Company') or @id='Company']")).sendKeys("Prime Testing");  //finds the element of company name
        driver.findElement(By.className("Newsletter")).click();  //finds the element of newsletter checkbox
        driver.findElement(By.className("Password")).sendKeys("1234567");  //finds the element of password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");  //finds the element of  confirm password
        driver.findElement(By.xpath("//button[@id='register-button' and @type='submit']")).click();  //finds the element of  confirm password
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
