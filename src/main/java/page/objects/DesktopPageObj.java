package page.objects;

import java.awt.desktop.UserSessionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPageObj extends Base{

	public DesktopPageObj() {
		PageFactory.initElements(driver, this);}
	
		
		@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
		private WebElement logo;
		
		@FindBy(xpath="//a[text()='Desktops']")
		private WebElement desktopstab;
		
		@FindBy(xpath="//a[text()='Show All Desktops']")
		private WebElement showAllDesktop;
		
		@FindBy(xpath="//h2[text()='Desktops']")
		private WebElement userShouldSeeAllDesktopItems;
		
		public boolean isLogdisplayed() {
			if(logo.isDisplayed())
				return true;
			else
				return false;
		}
		
		public void clickOnDesktoptab() {
			desktopstab.click();
		}
		
		public void clickOnShowAllDesktop() {
			showAllDesktop.click();
		}
		
		
		public boolean isDektopsLogoDisplayed() {
			if (userShouldSeeAllDesktopItems.isDisplayed())
				return true;
			else
				return false;
		}
	
	
	//2
	
	@FindBy(xpath="//button[@onclick=\"cart.add('47', '1');\"]")	
	private WebElement UserClickAddToCart;
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement usreSelectQty1;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement userClickAddToCartBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement userShoulSeeSuccessMessage;
	
	
	public void userAddtoCartHP() {
		UserClickAddToCart.click();
	}
	
	public void userselectqty() {
		usreSelectQty1.clear();
		usreSelectQty1.sendKeys("1");
	
	}
	
	public void clickAddtoCart() {
		userClickAddToCartBtn.click();
		
	}
	
	public boolean issuceesMessagedisplayed() {
		if(userShoulSeeSuccessMessage.isDisplayed())
			return true;
		else
			return false;
		
		
	}
	
	
//3
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement ClickaddtoCartCanonEOS5D;
	
	
//	@FindBy(xpath="//select[@id='input-option226']")
//	private WebElement ClcikDropDown;
	
	@FindBy(xpath="//*[@id=\"input-option226\"]/option[2]")
	private WebElement ClickOnRedFromDropDown;
//	Select select=new Select(ClickOnRedFromDropDown);
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement userSelectQty;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement userClickAddtoCartBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessageCannon;
	
	
	
	
	public void AddToCartCannon() {
		ClickaddtoCartCanonEOS5D.click();	
	}
	
	public void SelectRedfromDropDown() {
		ClickOnRedFromDropDown.click();
	}
	
	
	public void SelectQty1() {
		userSelectQty.clear();
		userSelectQty.sendKeys("1");
	}
	
	public void clickAddtoCartCannon() {
		userClickAddtoCartBtn.click();
	}
	
	public boolean isSucessMessageDisplayed() {
		if(SuccessMessageCannon.isDisplayed())
			return true;
		else
			return false;
	}
	
	// 4
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement CannonEOSCam; // click
	
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement WriteReviewEOSCam;// click
	
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement YourNameInWriteReviewEOSCam;
	
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement YourReivewInWriteReview;
	
	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	private WebElement radioButtonCanonEOS1;
	@FindBy(xpath = "//div[4]//div[1]//input[2]")
	private WebElement radioButtonCanonEOS2;
	@FindBy(xpath = "//div[4]//div[1]//input[3]")
	private WebElement radioButtonCanonEOS3;
	@FindBy(xpath = "//div[4]//div[1]//input[4]")
	private WebElement radioButtonCanonEOS4;
	@FindBy(xpath = "//div[4]//div[1]//input[5]")
	private WebElement radioButtonCanonEOS5;
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement ContinueBtnEOS;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankYouMessageCanonEOS;
	
	
	public void clickOnEOSCam() {
		CannonEOSCam.click();
	}
	
	public void clickOnWriteReviewEOSCam() {
		WriteReviewEOSCam.click();
	}
	
	public void sendKeyInputNameReviewCanonEOS() {
		
		YourNameInWriteReviewEOSCam.sendKeys("Nasratulhaq Fazli");
	}
	
	public void sendKeyTextAreaReviewCanonEOS() {
		YourReivewInWriteReview.sendKeys("Great! easy to use!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public void clickOnradioButtonCanonEOS1() {
		radioButtonCanonEOS1.click();
	}

	public void clickOnradioButtonCanonEOS2() {
		radioButtonCanonEOS2.click();
	}

	public void clickOnradioButtonCanonEOS3() {
		radioButtonCanonEOS3.click();
	}

	public void clickOnradioButtonCanonEOS4() {
		radioButtonCanonEOS4.click();
	}

	public void clickOnradioButtonCanonEOS5() {
		radioButtonCanonEOS5.click();
	}
	
	public void clickOnContinueButtonCanonEOS () {
		ContinueBtnEOS.click();
	}
	
	public boolean isThankYouMessageDisplayed() {
		if(thankYouMessageCanonEOS.isDisplayed())
			return true;
		else
			return false;
	}
}
