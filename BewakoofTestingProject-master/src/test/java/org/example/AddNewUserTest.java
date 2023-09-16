package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AddNewUserTest{

    WebDriver driver;
    AddNewUser newUser;

    @Test
    void setNewUser() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.bewakoof.com/signup");
        driver.manage().window().maximize();
        newUser=new AddNewUser(driver);

        newUser.validate_NewUser();

        Thread.sleep(5000);
        driver.quit();
    }
}
