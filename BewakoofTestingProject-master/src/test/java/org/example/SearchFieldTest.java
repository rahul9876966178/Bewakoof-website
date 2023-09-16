package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchFieldTest {
    WebDriver driver;
@Test
    void setSearchField(){

        WebDriverManager.edgedriver().setup();
        driver =new EdgeDriver();

        driver.get("https://www.bewakoof.com/");
        driver.manage().window().maximize();
    //noinspection deprecation
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SearchField searchField=new SearchField(driver);
        searchField.checkSearch_product();

        driver.quit();
    }
}
