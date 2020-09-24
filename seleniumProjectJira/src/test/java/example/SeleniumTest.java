package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTest {
    WebDriver driver;
    @Test
    public void testMethod() {
        System.setProperty("webdriver.chrome.driver", "D:\\programforQA\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jira.hillel.it/secure/Dashboard.jspa");
        driver.findElement(By.cssSelector("input[id='login-form-username']")).sendKeys("erzovkostya");
        driver.findElement(By.cssSelector("input[id='login-form-password']")).sendKeys("Wolf@@@666");
        WebElement element = driver.findElement(By.cssSelector("input[id='login']"));
        element.click();
        List<WebElement> elements = driver.findElements(By.cssSelector("div.rc"));
        for(WebElement el: elements){
           System.out.println(el.getText());
        }
    }
    // Если нужно сразу закрыть браузер просто раскоментить 30-32 
   // @AfterClass
   // public void afterMethod(){
   //     driver.quit();
    }
//}

