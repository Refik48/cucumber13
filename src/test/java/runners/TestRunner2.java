package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-raporlar2.html", // TestRunner class'inda 2 yoktu.
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},

        features="src/test/resources/features",
        glue="stepdefinitions",

        tags="@rapor2",

        dryRun=false


)
public class TestRunner2 {

}