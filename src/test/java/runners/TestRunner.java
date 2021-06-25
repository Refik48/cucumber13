package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    // Runner Class'i sadece class'lari birbirine baglamiyor.
    // Package'lari birbirine bagliyor.

    @RunWith(Cucumber.class) //@RunWith ve @CucumberOptions annotation'lari sayesinden bizim
    @CucumberOptions(       // cucumberla beraber JUnit kullandigimizi anlayabiliriz.
            plugin={"html:target\\cucumber-raporlar.html", // rapor olusturulmasini saglar.
                    "json:target/json-reports/cucumber.json", // ss'li rapor almamizi sagliyor.
                    "junit:target/xml-report/cucumber.xml"},
            // 1) Bu annotation'in gorevu feature dosyalarim ile stepdefinition dosyalarini birlestirmek.
            features="src/test/resources/features", // "features" package'n path'i
            glue="stepdefinitions", // "stepdefinitions" package'n path'i
            // features ve glue ile package'lari birbirine baglamis olduk.
            // Yani java olan kodlarla java olmayanlari birlestirmemize yariyor.
            // Bu iki package altinda kac tane class olursa olsun,
            // herhangi bir class'da yazilan her adim diger class'lardaki adimlarla
            // uyusursa yeni adim olusturmaya gerek kalmaz.

            tags="@wip", // work in progress
            // 2-  @ testNG'degi group gibi calisir
            // eger sadece 1 Feature veya 1 Scenario calistiracaksak, gidip feature dosyasindan calistirabiliriz
            // birden fazla Feature veya Scenario calistirmak istedigimizde
            // calistiracagimiz F veya S 'lara ortak bir tag atamamiz ve bu tag'i
            // runner'da belirtmemiz gerekir
            // and dendiginde yazilan taglarin tamamina sahip olanlar calistirilir
            // or dedigimde yazilan taglardan herhangi birine veya daha fazlasina sahip olanlar calisir
            // EGER TUM TEST CASE'leri calistirmak isterseniz tag'i yorum haline getirmeniz yeterli olur.

            // tag'larin calisma mantigi :
            // Eger burada hangi tag yazili ise tag'in icerisine yazilan annotation'lar calisir.
            // annotation'larin ne oldugu onemli degildir isterseniz @ali yazalim, istersek @bardak yazalim.
            // Baska yerde bu annotation varsa o annotation calisir.

            dryRun=false
            // true oldugunda test case'leri calistirmayi denemeden sadece eksik olan step'leri bana verir
            // false oldugunda test case'leri calistirmayi dener eksik step' bulursa onu rapor eder

    )
    public class TestRunner {

    }