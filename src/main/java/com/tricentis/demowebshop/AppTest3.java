package com.tricentis.demowebshop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://demowebshop.tricentis.com/");

        WebElement webElement = driver.findElement(By.xpath(".//*[@id=\"pollanswers-2\"]"));
        webElement.click();
        driver.findElement(By.xpath(".//*[@id=\"vote-poll-1\"]")).click();
        //driver.findElement(By.xpath(".//*[@id=\"block-poll-vote-error-1\"]")); //проверить сообщение
        driver.quit();
    }
}
