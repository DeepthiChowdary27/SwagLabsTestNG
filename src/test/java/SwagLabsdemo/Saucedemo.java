package SwagLabsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Saucedemo {
public static	
  WebDriver driver;
  @Test(priority=1)
  void OpenApp()
  {
	  driver=new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  void Login()
  {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
  }
  @Test(priority=3)
  void HomePage()
  {
	//dropdown
		Select filter=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
	    filter.selectByIndex(0);
  }
  @Test(priority=4)
  void Addtocart()
  {
	//addtocart
	    driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
  }
  @Test(priority=5)
  void OpenCart()
  {
	  //Open Cart
	    driver.findElement(By.id("shopping_cart_container")).click();
  }
  @Test(priority=6)
  void continueshopping()
  {
	  //continue shopping
	    driver.findElement(By.id("continue-shopping")).click();
  }
  @Test(priority=7)
  void addtocartonemoreitem()
  {
	  //addtocart onemore item
	    driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
  }
  @Test(priority=8)
  void OpenCart1()
  {
	  //Open Cart
	    driver.findElement(By.id("shopping_cart_container")).click();
  }
  @Test(priority=9)
  void checkout()
  {
	//checkout
	    driver.findElement(By.id("checkout")).click();
	    driver.findElement(By.id("first-name")).sendKeys("Lakshmi");
	    driver.findElement(By.id("last-name")).sendKeys("M");
	    driver.findElement(By.id("postal-code")).sendKeys("500073");
  }
  @Test(priority=10)
  void continue1()
  {
	  //continue
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("finish")).click();
  }
  @Test(priority=11)
  void BackHome()
  {
	  //BackHome
	    driver.findElement(By.id("back-to-products")).click();
  }
  @Test(priority=12)
  void logout()
  {
	//logout
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	    
	    driver.findElement(By.id("logout_sidebar_link")).click();
  }
  @Test(priority=13)
   void CloseApp() {
	  driver.close();  }
  
}
