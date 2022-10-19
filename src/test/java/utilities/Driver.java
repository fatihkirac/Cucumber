package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;  // static olmalı cunku getDriver() ve closeDriver() methodu static

    /*
    Testlerimizi calistirdigimizde her seferinde yeni driver olusturdugu icin her test methodu icin
    yeni bir pencere(driver) aciyor. Eger driver'a bir deger atanmamışsa yani driver==null ise
    bir kere driver'ı calistir diyerek bir kere if icini calistiracak ve driver artik bir kere calistigi icin
    ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz ayni pencere(driver)
    uzerinde calisacak
     */


    public static WebDriver getDriver(){  // void yapmıyoruz cunku biz driver ile methodlari çalıştıracağız. Bize driver
        if (driver==null){             // dondurmesi lazim ki, getDriver() methodundan sonra driver methodlarina ulasabilelim
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case"hadles-chrome":  //hiç chrome açmadan testleri çalıştırmak için
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default: //yukardakilerden hiçbirisi çalışmazssa chrome çalışssın
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


                    //    .diğer tarayıcılari da bu sekilde ekleyebiliriz
                    //    .
                    //    .
                    //


            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){  //driver'a deger atanmışsa
            driver.close();
            driver=null; // kapandıktan sonraki acmalari garanti almak icin driver'ı tekrar null yaptik
       }

    }
    public static void quitDriver(){
        if (driver==null){
            driver.quit();
            driver=null;
        }

    }
}
