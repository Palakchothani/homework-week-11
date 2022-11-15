package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Object creation
        WebDriver driver = new ChromeDriver();

        // Launch the URL
        driver.get(baseUrl);

        // Maximise Window
        driver.manage().window().maximize();

        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);


        // get current URL
        System.out.println("Current URl :" + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source : " + driver.getPageSource());

        // Navigate to login page
//        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
//        driver.navigate().to(loginUrl);

        // Navigate to log in page by clicking on log in link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // find the email field element
        // driver.findElement(By.id());
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        // Find the password field element
        //  driver.findElement(By.name(""));
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");

        // Close the browser automatically
        driver.close();



    }
}


