package utilities;

public class XXSozeller {
    /*
        - Cucumber : BDD davranis tabanli programlama. Yazdigimiz test case'lerin teknik olan veya
        olmayan herkes tarafindan rahatlikla anlasilmasini sagliyor.
        - Test case'lerin ilk asamasi olarak feature dosyasi olusturuyoruz. Feature dosyasinda Gherkin
        language yardimi ile test icin yaptigimiz her bir adimi bir method'a ceviriyoruz.
        Feature dosyasinda sozlu olarak yazdigimiz adimlari java kodlarina cevirmek icin, runner class'da
        dryRum=true yapip calistiriyoruz, cucumber bizim yerimize eksik step defininition'lari olustuyor.
        - Olusturulan bu step definiton'lari ilgili stepdefinition class'ina kopyalayip method'larin
        islevini yapmasi icin gerek java kodlarini ekliyoruz.
        - Kodlari yazarken locate'leri page sayfasindan, test datalarini
        configuration.properties'den aliyoruz.
        - Test icin gerekli kodlar bittiginde, testleri calistirmak icin Runner class'i kullaniyoruz.
        Runner class'da onemli olan tum ayarlamalari notastionlarla yapiyoruz.
        - Kullandigimiz ilk annotation @RunWith. Framework'umuzde JUnit kullanmamizin
        temel sebebi bu annotation'dir.
        - Kullandigimiz ikinci notasyon ise @CucumberOptions. Bu annotation ile framework'umuzdeki
        tum ayarlamalari yapabiliyoruz.
        - Runner class framework'deki java kodlarimiz ile gherkin language'de yazdigimiz
        noJava kodlari Package seviyesinde birlestirir (glue). Boyle feature paketinde herhangi bir dosyada
        yazilan nonjava kod, stepdefiniton paketindeki herhangi bir class'daki java kodlariyla uyustugunda,
        tekrar o kodu yazmamiza gerek kalmaz.
        - Eger istersek bir testi Feature dosyasindan da calistirabiliriz. Ancak bu durumda Runner class'da
        notasyonlarla yaptigimiz ayarlamalar devreye girmez.
        - Eger bir feature icinde birden fazla scenario varsa ve her scenario ayni adimlarla basliyorsa,
        ortak adimlari Background satisi altinda yazabiliriz.
        - Feature dosyasinda yazdigimiz adilmar String oldugu icin case sensitive'dir.
        Bir harf bile degisse adim icin yeni kod yazmak gerekir. Ancak istersek belli bolumleri " " icinde
        yazarak parametre haline donusturebiliriz.
        - Eger testimizi birden fazla deger icin calistirmak istersek Scenario Outline kullanmaliyiz.
        Bu durumda parametreleri "<>" icinde yazariz. En altta |Examples| olusturup, ilk satirinda
        parametre olarak yazdigimiz String'i ekleriz. Sonra bunun altina calistirmak istedigimiz
        tum degerleri | | arasinda yazariz.
        - Runner class'dan calistirmak istedigimiz TC veya Feature'lari tag'lar ile ayarlariz.
        Birden fazla tag kullanabilir, matematikteki mantiksal operatorlerle (or, and, not)
        bu taglari birlikte veya ayri ayri calistirabiliriz.
        - Feature dosyasinda comment yapmak istedigimiz satiri # ile isaretleriz.

        - Rapor almak istiyorsak cucumber class'indan degil "Runner" class'indan calistirmaliyiz.
        Rapor almak icin tag'lar olmalidir.
        - Cucumber'da herhangi bir adim failed olursa program calismayi durdurur.

        - Birden fazla Runner Class'i olusturma ;
        Cok fazla test yapacagimiz zaman bunlari birden fazla Runner'a paylastirip test surelerini
        kisaltabiliriz. Birden fazla Runner calistirdigimizda bilgisayar kasabilir hatta cokme noktasina
        gelebilir. O yuzden 2 ideal simdilik.
        Plugin'imizi 2. Runner class'inda "html:target\\cucumber-raporlar2.html", 2'yi ekliyorum
        cunku raporlari ayni yere kaydeder ve karisiklik olur.
        Tags'larda birbirinden farkli olmak zorundadir.
        pom.xml dosyamiza <build> altinda suanki pom'da olanlari yapistiriyoruz.
        Daha sonra intellijin terminaline mvn clean verify yazinca 2 browser ile calismaya basliyor.
        Daha ayrintili rapor icin : target -> cucumber-html-reports -> js -> overview-features.html
        Bu ayrintili raporun gelmesi icin sadece terminalden calistirilmasi gerekiyor. Normal run ile gelmez.
     */
}
