import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork1 {
    WebDriver wd;


   @BeforeMethod
    public void preCondition(){
    wd=new ChromeDriver();
    wd.navigate.to("https://contacts-app.tobbymarshall815.vercel.app/login");
   }

    @Test
    public void foundElements(){
       //tag
        List<WebElement>elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
        wd.findElement(By.tagName("meta"));
        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("link"));
        wd.findElement(By.tagName("script"));
        wd.findElement(By.tagName("body"));
        wd.findElement(By.tagName("h1"));
        //class
        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("active"));
        wd.findElement(By.className("login_login__3EHKB"));
        //text
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.linkText("PHONEBOOK"));
        //partialLinkText
        wd.findElement(By.partialLinkText("LO"));
        wd.findElement(By.partialLinkText("IN"));
        wd.findElement(By.partialLinkText("PHO"));
        wd.findElement(By.partialLinkText("HOM"));
        wd.findElement(By.partialLinkText("ABO"));


    }
    @AfterMethod
    public void postCondition(){
       wd.quit();


    }

}
