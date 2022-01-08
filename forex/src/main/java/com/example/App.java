package com.example;

import java.util.List;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    

    public static void main( String[] args ) throws InterruptedException 
    {
        String articles = "//table/tbody/tr/td[1]";
        String OS_Linux = "Linux";
        String OS_Windows = "Windows";
        String OS;

        OS = OS_Linux;
        if(OS==OS_Windows){
            System.setProperty("webdriver.chrome.driver", "./forex/src/resources/chromedriver.exe");
        }

        if(OS==OS_Linux){
            System.setProperty("webdriver.chrome.driver", "./forex/src/resources/chromedriver");
        }
         
        WebDriver driver = new ChromeDriver();

        driver.get("https://rf-start.com");

        driver.manage().window().maximize();

        List<WebElement> listOfElements = driver.findElements(By.xpath(articles));

        for (WebElement webElement : listOfElements) {
            String text = webElement.getText();
            System.out.println(text);
            Assert.isTrue(!webElement.getText().contains("Taras"), "String doesn't contain specific text");
        }

        Thread.sleep(10000);
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

    @Test
    public void firstTest() throws InterruptedException{
       
    }
}
