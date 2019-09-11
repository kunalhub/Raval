package Kunal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Automation1 {
 protected static WebDriver driver;

 public String getaemail(String startvalue){

     String email = startvalue.concat(new Date().toString() );
     // your code
     return email;
 }
  public static String randomDate()
  {
      DateFormat format=new SimpleDateFormat("ddMMyyHHmmss");
      return format.format(new Date());

  }

 @BeforeMethod
         public void openBrowser () {
     System.setProperty("webdriver.chrome.driver", "src\\main\\Resourse\\BrowserDriver\\chromedriver.exe");

     // open the driver
     driver = new ChromeDriver();
     // maximise the brower window screen
     driver.manage().window().fullscreen();
     // set implicitywait for driver object
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }

     //AfterMethod
             public void closebrowser(){
        driver.quit();
     }

 @Test
       public void userShouldBeRegisterSuccessfully (){

     // open the website
     driver.get("https://demo.nopcommerce.com/");
     // click on register button
     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
     // enter firstname
     driver.findElement(By.id("FirstName")).sendKeys("Kunal");
     // enter lastname
     driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Raval");
     // enter email
     driver.findElement(By.name("Email")).sendKeys("kunalraval"+randomDate()+"@gmail.com");
     // enter password
     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
     // confirm password
     driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("love007");
     // click on register
     driver.findElement(By.xpath("//input[@id='register-button']")).click();
     String ActualMassage = "Your registration completed";
     String ExpectedMassage=driver.findElement(By.xpath("//div[@class='result']")).getText();
     Assert.assertEquals(ActualMassage, ExpectedMassage);
 }

 @Test
        public void userShouldBeAbleToReferProductToFriend () {

     // open the website
     driver.get("https://demo.nopcommerce.com/");
     // click on register button
     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
     // enter firstname
     driver.findElement(By.id("FirstName")).sendKeys("Kunal");
     // enter lastname
     driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Raval");
     // enter email
     driver.findElement(By.name("Email")).sendKeys("kunalraval"+randomDate()+"@gmail.com");
     // enter password
     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
     // confirm password
     driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("love007");
     // click on register
     driver.findElement(By.xpath("//input[@id='register-button']")).click();
     // click on continue
     driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
     // click on apple macbook pro 13-inch
     driver.findElement(By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
     // click in email a friend
     driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
     // click on enter friend's email
     driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("kunalraval73@gmail.com");
     // type massage
     driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("please check this");
     // click on send email
     driver.findElement(By.xpath("//input[@name='send-email']")).click();
     String ActualMassage = "Your message has been sent.";
     String ExpectedMassage=driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
     Assert.assertEquals(ActualMassage, ExpectedMassage);
 }

  @Test
      public void userShouldBeAbleToNavigateCameraAndPhoto () {
      // open the website
      driver.get("https://demo.nopcommerce.com/");
      // click on register button
      driver.findElement(By.xpath("//a[@class='ico-register']")).click();
      // enter firstname
      driver.findElement(By.id("FirstName")).sendKeys("Kunal");
      // enter lastname
      driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Raval");
      // enter email
      driver.findElement(By.name("Email")).sendKeys("kunalraval" + randomDate() + "@gmail.com");
      // enter password
      driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
      // confirm password
      driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("love007");
      // click on register
      driver.findElement(By.xpath("//input[@id='register-button']")).click();
      // click on continue
      driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
      // click on Electronics
      driver.findElement(By.xpath("//h2//a[@title=\"Show products in category Electronics\"]")).click();
      // click on camera & photo
      driver.findElement(By.xpath("//h2//a[@href=\"/camera-photo\"]")).click();
      String ActualMassage = "Camera & photo";
      String ExpectedMassage=driver.findElement(By.xpath("//h1")).getText();
      Assert.assertEquals(ExpectedMassage, ActualMassage);
  }

   @Test
        public void userShouldBeAbleToAddTwoBooksToCheckList () {
       // open the website
       driver.get("https://demo.nopcommerce.com/");
       // click on register button
       driver.findElement(By.xpath("//a[@class='ico-register']")).click();
       // enter firstname
       driver.findElement(By.id("FirstName")).sendKeys("Kunal");
       // enter lastname
       driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Raval");
       // enter email
       driver.findElement(By.name("Email")).sendKeys("kunalraval" + randomDate() + "@gmail.com");
       // enter password
       driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
       // confirm password
       driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("love007");
       // click on register
       driver.findElement(By.xpath("//input[@id='register-button']")).click();
       // click on continue
       driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
       // click on books
       driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
       // click on add to chart
       driver.findElement(By.xpath("//input[contains(@onclick,'37/1/1')]")).click();
       // click on books
       driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
       // click on add to chart
       driver.findElement(By.xpath("//input[contains(@onclick,'39/1/1')]")).click();
       // click on shopping cart
       driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
       String ActualMassage = "Shopping cart";
       String ExpectedMassage=driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).getText();
       Assert.assertEquals(ExpectedMassage, ActualMassage);
   }

@Test
      public void userShouldBeAbleToFilterTheJewelry ()
{
    // open the website
    driver.get("https://demo.nopcommerce.com/");
    // click on register button
    driver.findElement(By.xpath("//a[@class='ico-register']")).click();
    // enter firstname
    driver.findElement(By.id("FirstName")).sendKeys("Kunal");
    // enter lastname
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Raval");
    // enter email
    driver.findElement(By.name("Email")).sendKeys("kunalraval" + randomDate() + "@gmail.com");
    // enter password
    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("love007");
    // confirm password
    driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("love007");
    // click on register
    driver.findElement(By.xpath("//input[@id='register-button']")).click();
    // click on continue
    driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
    // click on jewelery
    driver.findElement(By.linkText("Jewelry")).click();
    // click on price rang
    driver.findElement(By.xpath("//a[contains(@href,\"700-3000\")]")).click();
    //check the Expected result
    String Expectedresult="$700.00 - $3,000.00";
    //check the Actual result
    String Actualresult= driver.findElement(By.xpath("//span[@class='item']")).getText();
    //compare the result
    Assert.assertEquals(Actualresult,Expectedresult);
    String Productprice=driver.findElement(By.xpath("//span[@class='price actual-price']")).getText();
    String price1=String.valueOf(Productprice.replace("$",""));
    String price2=String.valueOf(price1.replace(",",""));
    double price=Double.valueOf(price2);
    //check the result
    Assert.assertTrue(price>=700 && price<=3000);









}








    }

