package com.revature.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(glue = "com.revature.steps", features = "src/test/java/com/revature/features/login.feature")
public class TestRunner extends AbstractTestNGCucumberTests {
 public static WebDriver driver;

 @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rev2.force.com/revature/s/login/");
    }

    @AfterMethod
    public void tearDown(){
     driver.quit();
    }

}
