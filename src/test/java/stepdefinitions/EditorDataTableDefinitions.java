package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.EditorDataTablePage;
import utilities.Driver;

public class EditorDataTableDefinitions {

    EditorDataTablePage editorDataTablePage = new EditorDataTablePage();
    Faker faker = new Faker();
    String firstName= faker.name().firstName();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorDataTablePage.newButonu.click();
    }

    @Then("Tum bilgileri girer")
    public void tum_bilgileri_girer() {
        editorDataTablePage.firstNameBox.sendKeys(faker.name().firstName() + Keys.TAB);
        editorDataTablePage.lastNameBox.sendKeys(faker.name().lastName() + Keys.TAB);
        editorDataTablePage.positionBox.sendKeys(faker.job().position() + Keys.TAB);
        editorDataTablePage.officeBox.sendKeys(faker.beer().name() + Keys.TAB);
        editorDataTablePage.extensionBox.sendKeys(faker.address().city() + Keys.TAB);
        editorDataTablePage.startDateBox.sendKeys("2006-01-07" + Keys.TAB);
        editorDataTablePage.salaryBox.sendKeys(faker.number().digits(5));
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorDataTablePage.createButton.click();
    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {

    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

    }

}
