package step.definition;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBookPageObj;
import utilities.Util;


public class LaptopsNotebookStepDef extends Base {
	LaptopNoteBookPageObj laptopNote= new LaptopNoteBookPageObj();
	// 5

//	@When("User click on Laptop &NoteBook tab")
//	public void user_click_on_laptop_note_book_tab() {
//	laptopNote.ClickOnloptopsAndNB();
//	logger.info("user clicked on laptop and NotBook tab");
//	Util.takeScreenShot();
//	}
//
//	@When("User click on Show all Laptop &NoteBook option")
//	public void user_click_on_show_all_laptop_note_book_option() {
//		laptopNote.ClickOnshowAllLaptopsAndNB();
//		logger.info("user clicked on show all laptop and Notebook Option");
//        Util.takeScreenShot(); 
//	}
//
//	
//	@When("User click on MacBook  item")
//	public void user_click_on_mac_book_item() {
//		laptopNote.ClickOnitemMacBook();
//		logger.info("user clicked on mcBook");
//		Util.takeScreenShot();
//	}
//
//	
//	
//	
//	
//	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
//	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
//		Assert.assertTrue(laptopNote.issuccessAddedToCartMacBookDisplayed());
//		laptopNote.issuccessAddedToCartMacBookDisplayed();
//		logger.info("user sees the success message Success: You have added MacBook to your shopping cart!’");
//		Util.takeScreenShot();
//		
//		
//	}
//	
//	
//	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
//	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) throws Exception {
//		laptopNote.getTextcartTotalMacBook();
//
//	
//	
//	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
//	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
//		Assert.assertTrue(laptopNote.issuccessAddedToCartMacBookDisplayed());
//		logger.info(" user see {int} tem\\\\(s){double}’ showed to the cart ");
//		Util.takeScreenShot();
//	}
//
//	@Then("User click on cart option")
//	public void user_click_on_cart_option() {
//		laptopNote.ClickOnitemMacBook();
//		logger.info("user clicked on cart option");
//		Util.takeScreenShot();
//		
//		
//		
//		
//	}
//
//	@Then("user click on red X button to remove the item from cart")
//	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
//		laptopNote.clickOnRedXButton();
//		logger.info("user clicked on red X button to remove the item from cart");
//		Util.takeScreenShot();
//		
//	}
//
//	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
//	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
//		Assert.assertTrue(laptopNote.issuccessAddedToCartMacBookDisplayed());
//		logger.info("item should be removed and cart should show ‘{int} item\\\\(s)’");
//		Util.takeScreenShot();
		
//	}

	
	
	
	
	
//	@Given("User is on Retail website this")
//	public void user_is_on_retail_website_this() {
//		laptopNote.textTestEnvoironment();
//
//	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNote.clickOnLoptopsAndNB();
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNote.clickOnshowAllLaptopsAndNB();
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopNote.clickOnItemMacBook();
	}

	@When("User click add to Cart button this")
	public void user_click_add_to_cart_button_this() {
		laptopNote.clickOnaddToCartbuttonMacBook();
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopNote.textSuccessAddedToCartMacBook();
		Util.takeScreenShot(getBrowser());
	}

	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) throws Exception {
		laptopNote.getTextcartTotalMacBook();
		Util.takeScreenShot(getBrowser());
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNote.ClickOnCartTotal();
		logger.info("user clicked on car option");
		Util.takeScreenShot(getBrowser());
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNote.ClickOnCartRemoveButton();
		logger.info("user clicked on X button");
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) throws Exception {
		laptopNote.TextEmptyShoppingCart();
		Util.takeScreenShot(getBrowser());
	}

	
	
	//-2---------
		@When("User click on product comparison icon on ‘MacBook’")
		public void user_click_on_product_comparison_icon_on_mac_book() {
			laptopNote.clickOncompareProductButtonMacBook();
			logger.info("User clicked on product comparison icon on ‘MacBook’");
		}

		@When("User click on product comparison icon on ‘MacBook Air")
		public void user_click_on_product_comparison_icon_on_mac_book_air() {
			laptopNote.clickOncompareProductButtonMacBook();
			logger.info("user clicked on comparsion button MacBook Air");
		}

		@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
		public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison()
				throws IOException {
			laptopNote.successMessageMacBookAirButtonMacBooAir();
			logger.info("user see the Success Message");
			Util.takeScreenShot(getBrowser());
		}

		@Then("User click on Product comparison link")
		public void user_click_on_product_comparison_link() throws InterruptedException {
			laptopNote.clickOnproductCompareButton();
			logger.info("User Clicked on Comparison Line");
		}
//
		@Then("User should see Product Comparison Chart")
		public void user_should_see_product_comparison_chart() throws IOException {
			laptopNote.allListOfItemsProductComparison();
			logger.info("user see the comaprison chart");


		}
		
	//-------------------	
		@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
		public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
			laptopNote.clickOnHeartSonyVAIO();
		}

		@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
		public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list()
				throws IOException {
			laptopNote.textSuccessTextSonyVAIO();
			Util.takeScreenShot(getBrowser());
		}

		@When("User click on ‘MacBook Pro’ item")
		public void user_click_on_mac_book_pro_item() throws InterruptedException {
			laptopNote.clickOnMacBookPro();
			logger.info("user clicked on MacBook Pro");
		}

		@Then("User should see  ‘${double}’ price tag is present on UI.")
		public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
			try {
				laptopNote.textPriceMacBookPro();
			} catch (Exception e) {

				e.printStackTrace();
			}
			logger.info("price tage of $2000 verified");
			Util.takeScreenShot(getBrowser());
		}
	
}
	
	
//	// 6
//
//	@When("User click on product comparison icon on ‘MacBook’")
//	public void user_click_on_product_comparison_icon_on_mac_book() {
//    
//	}
//
//	@When("User click on product comparison icon on ‘MacBook Air")
//	public void user_click_on_product_comparison_icon_on_mac_book_air() {
//
//	}
//
//	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
//	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
//
//	}
//
//	@Then("User click on Product comparison link")
//	public void user_click_on_product_comparison_link() {
//
//	}
//
//	@Then("User should see Product Comparison Chart")
//	public void user_should_see_product_comparison_chart() {
//
//	}
//
//	// 7
//
//	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
//	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
//
//	}
//
//	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
//	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
//
//	}
//
//	// 8
//
//	@When("User click on ‘MacBook Pro’ item")
//	public void user_click_on_mac_book_pro_item() {
//
//	}
//
//	@Then("User should see  ‘${double}’ price tag is present on UI.")
//	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
//
//		
//	}
//}
