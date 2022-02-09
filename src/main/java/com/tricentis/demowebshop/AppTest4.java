package com.tricentis.demowebshop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://demowebshop.tricentis.com/");

        WebElement webElement = driver.findElement(By.xpath(".//*[@class=\"column customer-service\"]/ul/li/a[text()=\"Blog\"]"));
        webElement.click();
        driver.findElement(By.xpath(".//*[@class=\"blog-details\"]/a[@href=\"/customer-service-client-service\"]")).click();
        driver.findElement(By.xpath(".//*[@id=\"AddNewComment_CommentText\"]")).click();
        driver.findElement(By.xpath(".//*[@id=\"AddNewComment_CommentText\"]")).sendKeys("new comment");
        driver.findElement(By.xpath(".//*[@class=\"button-1 blog-post-add-comment-button\"]")).click();
        //driver.findElement(By.xpath(".//*[@class=\"result\"]")); //проверить отображение сообщения
        driver.quit();
    }
}
