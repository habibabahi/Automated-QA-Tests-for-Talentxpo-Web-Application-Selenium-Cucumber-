package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.HashMap;

public class BrowserFactory {
    //todo: to configure browsers
    static WebDriver factoryDriver;
    private static HashMap<String,String> configuration = propertiesFile.read("src/test/resources/Environnement/config.properties");
    static String WebBrowserType = configuration.get("browser");
    //static boolean headless =  Boolean.parseBoolean(configuration.get("headless"));
    public static WebDriver getFactoryDriver(){
        String driversPath = "src/test/resources/Drivers/";
        switch (WebBrowserType){
            case "chrome":
                // Configuration de la propriété système pour spécifier l'emplacement du fichier chromedriver.
                System.setProperty("webdriver.chrome.driver", driversPath + "chromedriver.exe");
                ChromeOptions options1 = new ChromeOptions();
                options1.addArguments("--start-maximized");
                options1.addArguments("--ignore-certificate-errors");
                options1.addArguments("--disable-popup-blocking");
                options1.addArguments("--incognito");
                //options1.addArguments("--headless");

                // Initialisation du WebDriver en tant qu'instance de ChromeDriver pour ouvrir le navigateur Chrome.
                factoryDriver = new ChromeDriver(options1);
                break;

            case "ie":
                System.setProperty("webdriver.ie.driver", driversPath + "IEDriverServer.exe");
                // Initialisation du WebDriver en tant qu'instance de ChromeDriver pour ouvrir le navigateur ie.
                factoryDriver = new InternetExplorerDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", driversPath + "geckodriver.exe");
                factoryDriver = new FirefoxDriver();
                break;

            default:
                break;
        }
        return factoryDriver;
    }
}
