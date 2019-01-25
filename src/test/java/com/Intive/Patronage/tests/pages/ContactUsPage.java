package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactUsPage {

    private static String AUTOMATION_PRACTISE_URL = "http://automationpractice.com/";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "contact-link")
    private WebElement contactUsButton;

    @FindBy(how = How.ID, using = "submitMessage")
    private WebElement sendButton;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    private WebElement errorMessage;

    @FindBy(how = How.ID, using = "message")
    private WebElement messageTextArea;

    @FindBy(how = How.ID, using = "id_order")
    private WebElement orderReferenceTextArea;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailTextArea;

    @FindBy(how = How.ID, using = "id_contact")
    private WebElement subjectSelector;

    @FindBy(how = How.ID, using = "desc_contact1")
    private WebElement subjectInfo1;

    @FindBy(how = How.ID, using = "desc_contact2")
    private WebElement subjectInfo2;

    @FindBy(how = How.ID, using = "fileUpload")
    private WebElement uploadFileButton;

    @FindBy(how = How.CLASS_NAME, using = "filename")
    private WebElement fileName;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement successMessage;


    public ContactUsPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPractisePage() {
        driver.get(AUTOMATION_PRACTISE_URL);
    }

    public String getErrorMessageText() {
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']/p")).getText();
    }

    public String getDetailErrorMessageInfo() {
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getMessageTextArea(){
        return messageTextArea;
    }

    public WebElement getOrderReferenceTextArea(){
        return orderReferenceTextArea;
    }

    public WebElement getEmailTextArea() {
        return emailTextArea;
    }

    public WebElement getSubjectSelector() {
        return subjectSelector;
    }

    public void selectSubject(String subject) {
        Select dropdown= new Select(subjectSelector);
        dropdown.selectByVisibleText(subject);
    }

    public WebElement getSubjectInfo1() {
        return subjectInfo1;
    }

    public WebElement getSubjectInfo2() {
        return subjectInfo2;
    }

    public WebElement getUploadFileButton() {
        return uploadFileButton;
    }

    public WebElement getFileName() {
        return fileName;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
