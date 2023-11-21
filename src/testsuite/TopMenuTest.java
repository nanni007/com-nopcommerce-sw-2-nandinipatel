package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the computer button and clicks
        String expectedText = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the Electronics button and clicks
        String expectedText = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the apparel button and clicks
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the digital downloads button and clicks
        String expectedText = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the books button and clicks
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldNavigateToJewelleryPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the jewellery button and clicks
        String expectedText = "Jewellery";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @Test
    public void userShouldNavigateToGiftsCardsPageSuccessfully() {
        driver.findElement(By.xpath("login-button")).click();  //finds the Gifts cards button and clicks
        String expectedText = "Gifts Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));  //finds the element and verify if actual and expected match
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text Error", expectedText, actualText); //compares if expected and actual is equal
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
