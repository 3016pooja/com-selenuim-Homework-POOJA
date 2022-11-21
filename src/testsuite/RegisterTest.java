package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
@Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        //click on the register link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //verify the register text
        String expectedMessage = "Register";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualMessage= actualTestMessageElement.getText();
    Assert.assertEquals("register text displayed",expectedMessage,actualMessage);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //click on the register link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        //Enter first name
        driver.findElement(By.name("FirstName")).sendKeys("pooja");
        //Enter last name
        driver.findElement(By.name("LastName")).sendKeys("Patel");
        //Select day month and year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).click();
        //Enter email address
        driver.findElement(By.id("Email")).sendKeys("ronakpatel152@gmail.com");
        //enter Password
        driver.findElement(By.id("Password")).sendKeys("ronypooja3016");
        //Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("ronypooja3016");
        //click on the register button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        //verify the text your registration completed
        String expectedMessage = "Your registration completed";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//div[@class='result'] "));
        String actualMessage= actualTestMessageElement.getText();
        Assert.assertEquals("registration sucessfully  text displayed",expectedMessage,actualMessage);

    }
    @After
    public void testDown(){
        //closeBrowser();
    }
}
