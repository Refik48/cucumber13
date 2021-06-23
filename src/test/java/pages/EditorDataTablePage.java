package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDataTablePage {
    public EditorDataTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//button[@type='button'])[1]")
    public WebElement newButonu;

    @FindBy (id = "input#DTE_Field_first_name")
    public WebElement firstNameBox;

    @FindBy (id = "input#DTE_Field_last_name")
    public WebElement lastNameBox;

    @FindBy (id = "input#DTE_Field_position")
    public WebElement positionBox;

    @FindBy (id = "input#DTE_Field_office")
    public WebElement officeBox;

    @FindBy (id = "input#DTE_Field_extn")
    public WebElement extensionBox;

    @FindBy (id = "input#DTE_Field_start_date")
    public WebElement startDateBox;

    @FindBy (id = "input#DTE_Field_salary")
    public WebElement salaryBox;

    @FindBy (xpath = "//button[@class='btn']")
    public WebElement createButton;

}
