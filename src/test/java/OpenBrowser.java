
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
    }

}
