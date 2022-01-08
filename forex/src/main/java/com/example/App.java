package com.example;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    

    public static void main( String[] args ) throws InterruptedException 
    {
        String articles = "//table/tbody/tr/td[1]";
        System.setProperty("webdriver.chrome.driver", "C:/repos/forexGrow/forex/src/resources/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();

        driver.get("https://rf-start.com");

        driver.manage().window().maximize();

        driver.findElements(By.xpath(articles))

        Thread.sleep(5000);
        driver.quit();
        driver.close();
        // Car newCar1 = new Car();
        // Car newCar2 = new Car();

        // newCar2.color = "red";

        // System.out.println( newCar1.color);
        // System.out.println( newCar1.fuel);
        // newCar1.availebleDistance();

        // System.out.println("");


        // System.out.println( newCar2.color);
        // System.out.println( newCar2.fuel);
        // newCar2.availebleDistance();

    }

    //@Test
    public void firstTest() throws InterruptedException{
        
    }
}
