package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Defination {
	
	public static String url = "https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	@When("Enter Username {string}")
	public void enter_username(String string) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.get(url);
		
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys(string);
	}
	@And("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("i should see the title as {string}")
	public void i_should_see_the_title_as(String string) {
		String title= driver.getTitle();
	    Assert.assertEquals(string, title);
	    System.out.println("Title: " + title);
	   driver.quit();
	}
}
