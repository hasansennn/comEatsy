package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue={"stepdefinitions"},
        tags= "@wip",
        dryRun =true
)

public class Runner {

}
    /*
    Runner class'i testlerimizi tekli veya toplu olarak calistirmamizi saglar
    Runner class'i bos bir class'dir
    burada asil isi yapan 2 tane notasyondur
    ve iclerine yazdigimiz argumentlerdir

    @cucumberOptions icerisine yazacagimiz degerler bu runner class'inin
    calistiracagi
    -feature dosyalari
    -feature dosyalarina ait Java methodlarinin nerede oldugu
    -ve bu feature dosyalari icerisinde olusturulan Scenario veya
    Fature' larin hangilerinin calistirilacagini belirler.


    dryRun : default degeri olan "false" oldugunda
            feature dosyasina run tusuna bastigimiz gibi calistirir
            stepdefinition i olusturulan adimlari calistirir
            stepdefinition'i olmayan ilk adimda, eksik adimlari bize raporlar

            Ancak bu tur calistirmada gereksiz calistirilan adimlar olur
            bunun yerine

            "true" degerini verirseniz
            testi calistirmayi denemez
            sadece adimlari kontrol eder ve eksik adim varsa kodlari olusturur
            EKSIK ADIM YOKSA hic bir adimi calistirmadan TEST PASSED der
            buradaki test passed EKSİK ADIM YOK" anlamina gelmektedir



   */
