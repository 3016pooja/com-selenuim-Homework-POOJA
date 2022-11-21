package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

@Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the computer tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click();
//verify the computer text
   String expectedMessage = "Computers";
    WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Computers']"));
    String actualMessage= actualTestMessageElement.getText();

    //Validate actual and expected message
    Assert.assertEquals("computer",expectedMessage,actualMessage);

}
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on electronics tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a")).click();

        //verify the electronics
        String expectedMessage = "Electronics";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualMessage= actualTestMessageElement.getText();

        //Validate actual and expected message
        Assert.assertEquals("Actual catagory displayed",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        //click on Appareal tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).click();
        //verify the Apparel
        String expectedMessage = "Apparel";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualMessage= actualTestMessageElement.getText();

        //Validate actual and expected message
        Assert.assertEquals("Actual catagory displayed",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        //verify Digital downloads tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).click();
        //verify the Digital downloads
        String expectedMessage = "Digital downloads";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualMessage= actualTestMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Actual name displayed",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the books tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).click();
        //verify the Books text
        String expectedMessage = "Books";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualMessage= actualTestMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Actual text  displayed",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the Jewelry tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).click();
        //verify the Jewelry text
        String expectedMessage = "Jewelry";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualMessage= actualTestMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Actual text  displayed",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        //*	click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).click();
        //verify the gift cards text
        String expectedMessage = "Gift Cards";
        WebElement actualTestMessageElement= driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualMessage= actualTestMessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals("Actual text  displayed",expectedMessage,actualMessage);
    }
    @After
    public void testDown(){
       // closeBrowser();
    }
}
