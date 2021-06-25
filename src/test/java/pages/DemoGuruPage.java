package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {
    public DemoGuruPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String istenenHucreBilgisiniDondur(int satirNo, int sutunNo) {
        String istenenHucredekiYazi="";
        // Dinamik olmayan xpath = ((//tbody//tr)[4]//td)[3]
        // Dinamik olmasi icin  = ((//tbody//tr)[   4   ] //td)[   3   ]
        String dinamikXpath = "((//tbody//tr)["+satirNo+"]//td)["+sutunNo+"]";
        istenenHucredekiYazi = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

        return istenenHucredekiYazi;
    }
}
