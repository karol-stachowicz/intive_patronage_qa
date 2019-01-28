package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ContactUsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;

public class ContactUsSteps extends DriverFactory {

    private ContactUsPage contactUsPage = new ContactUsPage(driver);

    @Given("^User is on automationpractice page$")
    private void user_Is_On_AutomationPractise_Page()  {
        contactUsPage.openAutomationPractisePage();
    }

    @When("^I click contact us button$")
    public void i_Click_Contact_Us_Button(){
        contactUsPage.getContactUsButton().click();
    }

    @And("^I select \"([^\"]*)\" subject$")
    public void i_select_subject_in_selector(String suject)  {
        contactUsPage.selectSubject(suject);
    }

    @And("^I fill order reference section with text \"([^\"]*)\"$")
    public void i_fill_order_reference_section_with_text(String orderReference)  {
        contactUsPage.getOrderReferenceTextArea().sendKeys(orderReference);
    }

    @And("^I fill e-mail section with text \"([^\"]*)\"$")
    public void i_fill_email_section_with_text(String email)  {
        contactUsPage.getEmailTextArea().sendKeys(email);
    }

    @And("^I fill message section with text \"([^\"]*)\"$")
    public void i_fill_message_section_with_text(String messageText)  {
        contactUsPage.getMessageTextArea().sendKeys(messageText);
    }

    @And("^I click send button$")
    public void i_Click_Send_Button() {
        contactUsPage.getSendButton().click();
    }

    @Then("^I can see following info \"([^\"]*)\" below selector$")
    public void i_Can_See_selected_subject_info(String subjectInfo)  {
        boolean isSubject1Info = contactUsPage.getSubjectInfo1().getText().equals(subjectInfo);
        boolean isSubject2Info = contactUsPage.getSubjectInfo2().getText().equals(subjectInfo);
        assertThat("User should see info", isSubject1Info || isSubject2Info);
    }

    @Then("^I can see error message with \"([^\"]*)\" error$")
    public void i_Can_See_Error_Message(String numberOfErrors)  {
        assertThat("User should see error message", contactUsPage.getErrorMessage().isDisplayed());
        assertThat(String.format("Error message should contain info about %s error", numberOfErrors),
                contactUsPage.getErrorMessageText().contains(String.format("%s error", numberOfErrors)));
    }

    @And("^There are following details: \"([^\"]*)\"$")
    public void i_Can_See_Detail_Info(String detailInfo)  {
        assertThat(String.format("Detail message should contain following info: %s", detailInfo),
                contactUsPage.getDetailErrorMessageInfo().contains(detailInfo));
    }

    @And("^I back to \"([^\"]*)\" subject$")
    public void i_Back_To_Subject(String subject) {
        contactUsPage.selectSubject(subject);
    }

    @Then("^I don't see any info$")
    public void i_DonT_See_Any_Info() {
        boolean isSubject1Info = contactUsPage.getSubjectInfo1().isDisplayed();
        boolean isSubject2Info = contactUsPage.getSubjectInfo2().isDisplayed();
        assertThat("User should see info", !isSubject1Info && !isSubject2Info);
    }

    @And("^I upload file \"([^\"]*)\"$")
    public void i_Upload_File(String filePath) throws URISyntaxException {
        URL url = getClass().getClassLoader().getResource(filePath);
        File file = new File(url.toURI());
        contactUsPage.getUploadFileButton().sendKeys(file.getAbsolutePath());
    }

    @Then("^I see file: \"([^\"]*)\" text$")
    public void i_See_File_Text(String fileName) {
        assertThat(String.format("File name is: %s", fileName), contactUsPage.getFileName().getText().equals(fileName));
    }

    @Then("^I see success message: \"([^\"]*)\" text$")
    public void i_See_Success_Message_Text(String successMessage) {
        assertThat("Success message is visible", contactUsPage.getSuccessMessage().getText().equals(successMessage));
    }
}
