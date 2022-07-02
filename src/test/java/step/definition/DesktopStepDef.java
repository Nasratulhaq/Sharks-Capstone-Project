package step.definition;

import org.junit.Assert;


import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObj;
import utilities.Util;

public class DesktopStepDef extends Base {
	DesktopPageObj desktop = new DesktopPageObj();
	// 1

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(desktop.isLogdisplayed());
//	Util.takeScreenShot();
		logger.info("user is in homepage");

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktoptab();
		logger.info("user clicked on desktop");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.clickOnShowAllDesktop();
		logger.info("user clicked on show all desktop");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		Assert.assertTrue(desktop.isDektopsLogoDisplayed());
		logger.info("user see all items under desktops");
		
	}

	// 2-HPLP3065--------------------------------------------------------------------

	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.userAddtoCartHP();
		logger.info("user Clicked on HP LP3065");
		Util.takeScreenShot(getBrowser());
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktop.userselectqty();

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickAddtoCart();
		logger.info("user clicked on add to cart button");
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		Assert.assertTrue(desktop.issuceesMessagedisplayed());
		logger.info("user see the success message");
		
		
		// 3-Cannon---------------------------------------------------------------------
	}

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	desktop.AddToCartCannon();
	logger.info("user clicked ad to cart on CANON EOS");
	
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktop.SelectRedfromDropDown();
		logger.info("user selected the red collor");
		

	}

	@When("User select quantity {int} here")
	public void user_select_quantity_here(Integer int1) {
		desktop.SelectQty1();
		logger.info("user selected 1 as quantity");
		

	}

	@When("User click add to Cart buttonn")
	public void user_click_add_to_cart_buttonn() {
    desktop.clickAddtoCartCannon(); 
    logger.info("user cliked on add to cart");
    
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	Assert.assertTrue(desktop.isSucessMessageDisplayed());
	logger.info("user see the success message");
	
	}
	
	
	
	// 4 Scenario: User add a review to Canon EOS 5D item in Desktops tab
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	desktop.clickOnEOSCam();		
    logger.info("user clicked on Canno EOS 5D Cammera"); 
    Util.takeScreenShot(getBrowser());
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	desktop.clickOnWriteReviewEOSCam();	
	logger.info("user clicked on write review");
	Util.takeScreenShot(getBrowser());
		

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
    desktop.sendKeyInputNameReviewCanonEOS();
    desktop.sendKeyTextAreaReviewCanonEOS();
    desktop.clickOnradioButtonCanonEOS5();
    logger.info("user wrote the reveiw and rating");
    Util.takeScreenShot(getBrowser());
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	desktop.clickOnContinueButtonCanonEOS ();
	logger.info("user clicked on continue EOS CAMERA button");
	Util.takeScreenShot(getBrowser());
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	Assert.assertTrue(desktop.isThankYouMessageDisplayed());
	logger.info("user see the thank you message");
	Util.takeScreenShot(getBrowser());
	}

}
