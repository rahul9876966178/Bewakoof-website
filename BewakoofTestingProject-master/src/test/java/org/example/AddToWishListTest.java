package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToWishListTest {
    WebDriver driver;
    AddToWishList addWish;

  @Test
    void setAddWish() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.bewakoof.com/login");
        driver.manage().window().maximize();

        addWish=new AddToWishList(driver);
        addWish.addToFavourite();
        Thread.sleep(5000);
        driver.quit();
    }

}