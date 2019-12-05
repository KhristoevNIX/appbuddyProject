package com.appbuddy;

import org.junit.Test;
import org.openqa.selenium.By;

public class PgdevLogin extends WebDriverSettings {

    @Test
    public void pgdevLogin() throws InterruptedException {
        driver.manage().window().maximize();

        driver.get("https://pgdev.processgridappqa.com");
        driver.findElement(By.cssSelector(".mainContainer [type=email]")).sendKeys("sf.qa+DevSA@appbuddy.com");
        driver.findElement(By.cssSelector(".mainContainer [type=password]")).sendKeys("Test@1111");

        driver.findElement(By.cssSelector("div [type=submit]")).click(); // login button
    }
}
