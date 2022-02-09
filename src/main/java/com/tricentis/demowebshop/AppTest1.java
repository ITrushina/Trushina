package com.tricentis.demowebshop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://demowebshop.tricentis.com/");

        WebElement webElement = driver.findElement(By.xpath(".//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]/li/a[@href=\"/books\"]"));
        webElement.click();
        driver.findElement(By.xpath(".//*[@class=\"product-title\"]/a[@href=\"/computing-and-internet\"]")).click();
        driver.findElement(By.xpath(".//*[@id=\"add-to-cart-button-13\"]")).click();
        // driver.findElement(By.xpath(".//*[text()= \"(1)\"]")); //проверить количество
        driver.findElement(By.xpath(".//*[@class=\"ico-cart\"]/span[@class=\"cart-label\"]")).click();
        driver.findElement(By.xpath(".//*[@name=\"removefromcart\"]")).click();
        driver.findElement(By.xpath(".//*[@name=\"updatecart\"]")).click();
        driver.quit();
    }
}
