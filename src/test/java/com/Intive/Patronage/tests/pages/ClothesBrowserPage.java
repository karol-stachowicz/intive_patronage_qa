package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ClothesBrowserPage {

    private static String AUTOMATION_PRACTISE_URL = "http://automationpractice.com/";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "block_top_menu")
    private WebElement categoryButtonBar;

    @FindBy(how = How.CLASS_NAME, using = "cat-name")
    private WebElement categoryHeader;

    @FindBy(how = How.ID, using = "ul_layered_id_attribute_group_3")
    private WebElement colorSelector;

    public ClothesBrowserPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPractisePage() {
        driver.get(AUTOMATION_PRACTISE_URL);
    }

    public WebElement getCategory(String category) {
        List<WebElement> listItems = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li"));
        for (WebElement listItem : listItems) {
            WebElement link = listItem.findElement(By.tagName("a"));
            if (link.getText().equalsIgnoreCase(category)){
                return link;
            }
        }
        return null;
    }

    public WebElement getColorItem(String color){
        List<WebElement> colorsLink = driver.findElements(By.xpath("//ul[@id='ul_layered_id_attribute_group_3']/li/label/a"));
        for (WebElement colorItem : colorsLink) {
            if (colorItem.getText().contains(color)){
                return colorItem;
            }
        }
        return null;
    }

    public WebElement getSizeItem(String size){
        List<WebElement> colorsLink = driver.findElements(By.xpath("//ul[@id='ul_layered_id_attribute_group_1']/li/label/a"));
        for (WebElement colorItem : colorsLink) {
            if (colorItem.getText().contains(size)){
                return colorItem;
            }
        }
        return null;
    }

    public WebElement getCategoryHeader() {
        return categoryHeader;
    }
}
