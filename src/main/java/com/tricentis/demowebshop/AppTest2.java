package com.tricentis.demowebshop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://demowebshop.tricentis.com/");

        WebElement webElement = driver.findElement(By.xpath(".//*[@class=\"list\"]/li/a[@href=\"/jewelry\"]"));
        webElement.click();
        driver.findElement(By.xpath(".//*[@href=\"http://demowebshop.tricentis.com/jewelry?price=0-500\"]")).click();
        driver.findElement(By.xpath(".//*[@selected=\"selected\"]")).click();
        driver.findElement(By.xpath(".//*[@id=\"products-orderby\"]/option[@value=\"http://demowebshop.tricentis.com/jewelry?price=0-500&orderby=5\"]")).click();
        driver.quit();
    }
}