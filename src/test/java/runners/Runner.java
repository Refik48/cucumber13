package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class) //@RunWith annotation'i sayesinden bizim cucumber kullandigimizi anlayabiliriz.
    @CucumberOptions(
            // 1) Bu annotation'in gorevu feature dosyalarim ile stepdefinition dosyalarini birlestirmek.
            features="src/test/resources/features",
            glue="stepdefinitions folder path",
            // Boylece package'lari birbirine bagliyoruz.
            // Bu iki paket altinda kac tane class olursa olsun,
            // herhangi bir class'da yazilan her adim diger class'lardaki adimlarla
            // uyusursa yeni adim olusturmaya gerek kalmaz.
            tags="@wip", // work in progress
            dryRun=false)
    public class Runner {
}
