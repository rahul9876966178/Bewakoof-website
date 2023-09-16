package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProductPageTest {
    WebDriver driver;

    @Test
    void setProductPage()throws InterruptedException{

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.get("https://www.bewakoof.com/");
        driver.manage().window().maximize();
        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ProductPage productPage=new ProductPage(driver);
        productPage.checkProduct();

        Thread.sleep(5000);
        driver.quit();
    }
}
