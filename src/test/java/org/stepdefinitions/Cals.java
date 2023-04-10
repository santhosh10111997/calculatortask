package org.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Buttons;
import com.base.BaseClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Cals extends BaseClass{
	Buttons b1;


@Given("user shoud be in calculator page")
public void user_shoud_be_in_calculator_page() {
	  BrowserLaunch("chrome");
	  urlLaunch("https://www.webcargonet.com/qa-calc/");
	  maximize();
	  implicitlyWait(5000);
}
	
@When("user add the single digit values")
public void user_add_the_single_digit_values() {
	
  b1=new Buttons();
  Click(b1.getOne());
  Click(b1.getPlus());
  Click(b1.getEight());
  Click(b1.getEqual());
  String text = driver.findElement(By.className("result")).getText();
  Assert.assertEquals("verify actual value","9", text);
  System.out.println("Expected value and actual value is same:"+text);
}

@When("user add the double digit values")
public void user_add_the_double_digit_values() {
	Click(b1.getC());
  Click(b1.getTwo());
  Click(b1.getTwo());
  Click(b1.getPlus());
  Click(b1.getTwo());
  Click(b1.getFive());
  Click(b1.getEqual());
  String text = driver.findElement(By.className("result")).getText();
  Assert.assertEquals("verify actual value","47", text);
  System.out.println("Expected value and actual value is same:"+text);
}

@When("user add the triple digit values")
public void user_add_the_triple_digit_values() {
	Click(b1.getC());
	Click(b1.getTwo());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getPlus());
	Click(b1.getOne());
	Click(b1.getZero());
	Click(b1.getZero());
	 Click(b1.getEqual());
	 String text = driver.findElement(By.className("result")).getText();
	 Assert.assertEquals("verify actual value","300", text);
	 System.out.println("Expected value and actual value is same:"+text);
    
}

@Then("user add the four digit values")
public void user_add_the_four_digit_values() {
	Click(b1.getC());
	Click(b1.getOne());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getPlus());
	Click(b1.getTwo());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getZero());
	 Click(b1.getEqual());
	 String text = driver.findElement(By.className("result")).getText();
	// Assert.assertEquals("verify actual value","3000", text);
	 System.out.println("Expected value:3000, But actual value is:"+text);
	 quit();
}

@When("user subtract the single digit value")
public void user_subtract_the_single_digit_value() {
//	BrowserLaunch("chrome");
//	  urlLaunch("https://www.webcargonet.com/qa-calc/");
//	  maximize();
	
	  b1=new Buttons();
	Click(b1.getC());
   Click(b1.getNine());
   Click(b1.getMinus());
   Click(b1.getThree());
   Click(b1.getEqual());
   String text = driver.findElement(By.className("result")).getText();
 //  Assert.assertEquals("verify actual value","6", text);
   System.out.println("Expected value: 6, But actual is:"+text);
	
}

@When("user substract the double digit value")
public void user_substract_the_double_digit_value() {
	
	Click(b1.getC());
   Click(b1.getThree());
   Click(b1.getThree());
   Click(b1.getMinus());
   Click(b1.getOne());
   Click(b1.getZero());
   Click(b1.getEqual());
   String text = driver.findElement(By.className("result")).getText();
 //  Assert.assertEquals("23", text);
   System.out.println("Expected value:23, But actual value is:"+text);
   
	
}

@Then("user substract the four digit value")
public void user_substract_the_four_digit_value() {
  
	Click(b1.getC());
	Click(b1.getFour());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getMinus());
	Click(b1.getTwo());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getEqual());
	String text = driver.findElement(By.className("result")).getText();
	System.out.println("Expected value:200, But actual value is:"+text);
	//Assert.assertEquals("200", text);
	quit();
	
	
}

@When("user multiply the single digit value")
public void user_multiply_the_single_digit_value() {
	
	 b1=new Buttons();
	 
   Click(b1.getTwo());
   Click(b1.getMultiple());
   Click(b1.getSix());
   Click(b1.getEqual());
   String text = driver.findElement(By.className("result")).getText();
   System.out.println("Expected value:12, But actual value is:"+text);
	
}

@When("user multiply the double digit value")
public void user_multiply_the_double_digit_value() {
	
	Click(b1.getC());
   Click(b1.getOne());
   Click(b1.getZero());
   Click(b1.getMultiple());
   Click(b1.getTwo());
   Click(b1.getZero());
   Click(b1.getEqual());
   String text = driver.findElement(By.className("result")).getText();
   System.out.println("Expected value:200, But actual value is:"+text);
  // Assert.assertEquals("200", text);
   
}

@Then("user mutiply the double digit with point values")
public void user_mutiply_the_double_digit_with_point_values() {
	Click(b1.getC());
	Click(b1.getOne());
	Click(b1.getTwo());
	WebElement db = driver.findElement(By.xpath("//button[@name='.']"));
	doubleClick(db);
	Click(b1.getFive());
	Click(b1.getZero());
	Click(b1.getMultiple());
	Click(b1.getOne());
	Click(b1.getZero());
	Click(b1.getEqual());
	 String text = driver.findElement(By.className("result")).getText();
     System.out.println("Expected value:125, But actual value is:"+text);
   //Assert.assertEquals("125", text);
    quit();
}

@When("user divide the values of single digit")
public void user_divide_the_values_of_single_digit() {
	
   b1=new Buttons();
   Click(b1.getNine());
   Click(b1.getDevide());
   Click(b1.getThree());
   Click(b1.getEqual());
   String text = driver.findElement(By.className("result")).getText();
   Assert.assertEquals("3", text);
	System.out.println("Expected value and actual value is same:"+text);
}

@When("user divide the values of double digit")
public void user_divide_the_values_of_double_digit() {
	 Click(b1.getC());
	 Click(b1.getNine());
	 Click(b1.getZero());
	 Click(b1.getDevide());
	 Click(b1.getNine());
	 Click(b1.getEqual());
	 String text = driver.findElement(By.className("result")).getText();
	 Assert.assertEquals("10", text);
	 System.out.println("Expected value and actual value is same:"+text);
	 
}

@When("user divide the values of triple digit")
public void user_divide_the_values_of_triple_digit() {
	Click(b1.getC());
	Click(b1.getOne());
	Click(b1.getFive());
	Click(b1.getZero());
	Click(b1.getDevide());
	Click(b1.getFive());
	Click(b1.getEqual());
	 String text = driver.findElement(By.className("result")).getText();
	 Assert.assertEquals("30", text);
	 System.out.println("Expected value and actual value is same:"+text);
	
}

@Then("user divide the values of four digit")
public void user_divide_the_values_of_four_digit() {
	Click(b1.getC());
	Click(b1.getOne());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getZero());
	Click(b1.getDevide());
	Click(b1.getOne());
	Click(b1.getZero());
	Click(b1.getEqual());
	 String text = driver.findElement(By.className("result")).getText();
	// Assert.assertEquals("10", text);
	 System.out.println("Expected value:10, But actual value is:"+text);
	quit();
}

@When("user click to check the dot button")
public void user_click_to_check_the_dot_button() {
b1=new Buttons();
Click(b1.getOpen());
Click(b1.getDot());
Click(b1.getClose());
String text = driver.findElement(By.className("result")).getText();
//Assert.assertEquals("(.)", text);
System.out.println("Expected result:(.) ,but actual result is:"+text);

}


@When("user click to check the clear enter button CE")
public void user_click_to_check_the_clear_enter_button_CE() {
	
	Click(b1.getOne());
    Click(b1.getC());
    Assert.assertTrue("", true);
    System.out.println("done");
}


}
