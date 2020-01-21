
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.thread.IThreadWorkerFactory;

import java.awt.*;
import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenBrowser {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abhij\\IdeaProjects\\seleniumpractice\\src\\executables\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://www.netflix.com");
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.xpath(".//input[@name='userLoginId']")).clear();
        driver.findElement(By.xpath(".//input[@name='userLoginId']")).sendKeys("abhishekmandal2014@gmail.com");
        driver.findElement(By.xpath(".//input[@name='password']")).clear();
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("Iphone@18");
        driver.findElement(By.xpath(".//button[@class='btn login-button btn-submit btn-small']")).click();
        driver.findElement(By.linkText("ABHISHEK")).click();
        driver.findElement(By.xpath(".//span[@class='icon-search']")).click();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("No of links on the page = "+links.size());
        for(int i=1;i<links.size();i++)
            System.out.println("Link "+i+" is "+driver.findElement(By.tagName("a")));
        driver.findElement(By.xpath("/html//div[@id='appMountPoint']/div/div//div[@class='bd dark-background']//div[@class='pinning-header-container']/div[@role='navigation']//input")).sendKeys("Tanu Weds Manu 2");

    }

}
