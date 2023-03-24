package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","/Users/german/chromedriver_mac_arm64 (1)");
        WebDriver driver = new ChromeDriver();
//        ChromeDriver driver = new ChromeDriver();
        // commit

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");




    }
}