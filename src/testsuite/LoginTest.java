package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //*	click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //*	Verify the text ‘Welcome, Please Sign In!’
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage= actualTestMessageElement.getText();

        //Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find  the username field and Enter valid username
        driver.findElement(By.name("Email")).sendKeys("pjmaradiya@gmail.com");
        //Find the password field and Enter valid password
        driver.findElement(By.name("Password")).sendKeys("ronypooja3016");
        // click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //*	Verify the ‘Log out’ text is display
        String expectedMessage="Log out";
        WebElement actualtextMessage=driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualMessage=actualtextMessage.getText();
        //Validate actual and expected message
        Assert.assertEquals("you are Log out  ",expectedMessage,actualMessage);

    }
    @Test
    public void verifyTheErrorMessage(){
        //click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find  the username field and Enter Invalid username
        driver.findElement(By.name("Email")).sendKeys("poojapatel@gmail.com");
        //Find the password field and Enter Invalid password
        driver.findElement(By.name("Password")).sendKeys("pooja3016");
        // click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String expectedMessage="Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        WebElement actualtextMessage=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage=actualtextMessage.getText();
        Assert.assertEquals("you are not logged in ",expectedMessage,actualMessage);

    }

    @After
    public void testDown() {
        closeBrowser();
    }

    }

