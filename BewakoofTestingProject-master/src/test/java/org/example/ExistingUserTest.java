package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExistingUserTest {
    WebDriver driver;

    @Test

    void setExistingUser() throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.get("https://www.bewakoof.com/login/email");
        driver.manage().window().maximize();
        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ExistingUser existingUser=new ExistingUser(driver);
        existingUser.valid_details();
        Thread.sleep(5000);
        driver.quit();
    }
}
