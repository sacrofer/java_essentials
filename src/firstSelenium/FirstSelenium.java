package firstSelenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

    public static void main(String[] args) {
    	//System.setProperty("webdriver.chrome.driver", "C:\\testautomation\\libs\\drivers\\chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver", "C:\\testautomation\\libs\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String expectedTitle = "Welcome: Mercury Tours";
        driver.get("http://newtours.demoaut.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}

