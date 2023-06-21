package Sobotec.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testing extends BaseTest {
    @Test
    public void creatingProject() throws InterruptedException {

        loginPage.login("tomislav.jevtic@intens.rs","cF!nnrW&EBZR6w79");
        Thread.sleep(3000);

        Actions action = new Actions(driver);


       // new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.urlContains("https://sobotec.azurewebsites.net/dashboard"));
        Thread.sleep(10000);

        action.moveToElement(projectPage.getProjectTab()).perform();
       action.click(projectPage.getOverview()).perform();
       // driver.findElement(By.className("mainnav-menu-items.active")).click();

//         new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".mainnav-menu-items.active"))));
//
//
//        driver.findElement(By.className("mainnav-menu-items.active")).click();

      //  projectPage.getOverview().click();

    }

}
