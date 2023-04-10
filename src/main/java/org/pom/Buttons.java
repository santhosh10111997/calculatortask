package org.pom;



import com.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Buttons extends BaseClass {
	
	public Buttons () {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//button[@name='1']")
	private WebElement one;
	
	@FindBy(xpath="//button[@name='2']")
	private WebElement two;
	
	@FindBy (xpath="//button[@name='3']")
	private WebElement three;
	
	@FindBy (xpath="//button[@name='4']")
	private WebElement four;
	
	@FindBy(xpath="//button[@name='5']")
	private WebElement five;
	
	@FindBy(xpath="//button[@name='6']")
	private WebElement six;
	
	@FindBy (xpath="//button[@name='7']")
	private WebElement seven;
	
	@FindBy (xpath="//button[@name='8']")
	private WebElement eight;
	
	@FindBy(xpath="//button[@name='9']")
	private WebElement nine;
	
	@FindBy(xpath="//button[@name='0']")
	private WebElement zero;
	
	@FindBy (xpath="//button[@name='C']")
	private WebElement C;
	
	@FindBy (xpath="//button[@name='CE']")
	private WebElement CE;
	
	@FindBy(xpath="//button[@name='+']")
	private WebElement plus;
	
	@FindBy(xpath="//button[@name='=']")
	private WebElement equal;
	
	@FindBy (xpath="//button[@name='(']")
	private WebElement open;
	
	@FindBy (xpath="//button[@name=')']")
	private WebElement close;
	

	@FindBy(xpath="//button[@name='.']")
	private WebElement dot;
	
	
	@FindBy(xpath="//button[@name='-']")
	private WebElement minus;
	
	@FindBy (xpath="//button[@name='*']")
	private WebElement multiple;
	
	@FindBy (xpath="//button[@name='/']")
	private WebElement devide;

	public WebElement getOne() {
		return one;
	}

	public WebElement getTwo() {
		return two;
	}

	public WebElement getThree() {
		return three;
	}

	public WebElement getFour() {
		return four;
	}

	public WebElement getFive() {
		return five;
	}

	public WebElement getSix() {
		return six;
	}

	public WebElement getSeven() {
		return seven;
	}

	public WebElement getEight() {
		return eight;
	}

	public WebElement getNine() {
		return nine;
	}

	public WebElement getZero() {
		return zero;
	}

	public WebElement getC() {
		return C;
	}

	public WebElement getCE() {
		return CE;
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getEqual() {
		return equal;
	}

	public WebElement getOpen() {
		return open;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getDot() {
		return dot;
	}

	public WebElement getMinus() {
		return minus;
	}

	public WebElement getMultiple() {
		return multiple;
	}

	public WebElement getDevide() {
		return devide;
	}

	
}
