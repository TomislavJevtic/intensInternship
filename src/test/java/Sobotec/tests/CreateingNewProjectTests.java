package Sobotec.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
;

public class CreateingNewProjectTests extends BaseTest {
    @Test
    public void creatingProjectWithAllValidAndRequiredFields() throws InterruptedException {

        Actions action = new Actions(driver);


        loginPage.login("tomislav.jevtic@intens.rs", "cF!nnrW&EBZR6w79");


        Thread.sleep(5000);
        driver.navigate().to("https://sobotec.azurewebsites.net/projects/all/overview");
        Thread.sleep(5000);
        action.moveToElement(projectPage.getCreateButton()).perform();
        Thread.sleep(3000);
        projectPage.getCreateButton().click();
        action.moveToElement(projectPage.getNewProjectButton()).perform();
        Thread.sleep(3000);
        projectPage.getNewProjectButton().click();
        Thread.sleep(1000);

        action.moveToElement(projectPage.getDropdownMenagers()).perform();
        Thread.sleep(1000);
        projectPage.getMenagersFied().click();
        action.scrollToElement(projectPage.getMyNameMenagers()).perform();
        action.moveToElement(projectPage.getMyNameMenagers()).perform();
        Thread.sleep(1000);
        projectPage.getMyNameMenagers().click();

        projectPage.getTeamField().click();
        Thread.sleep(1000);
        projectPage.getTeamField().sendKeys("black");
        action.moveToElement(projectPage.getTeamField()).perform();
        projectPage.getTeamField().sendKeys(Keys.ARROW_DOWN);
        projectPage.getTeamField().sendKeys(Keys.ENTER);

        projectPage.getProjectNameField().sendKeys("MyTestProject002");
        // projectPage.getProjectNumberField().sendKeys("PN006");
        projectPage.getEstimatorField().sendKeys("darko");
        Thread.sleep(500);
        action.moveToElement(projectPage.getEstimatorField());
        projectPage.getEstimatorField().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        projectPage.getEstimateNumberField().sendKeys("22");
        Thread.sleep(1000);
        projectPage.getEnCalcsProjectCheck().click();
        projectPage.getLeedProjectCheck().click();

        projectPage.GetProjectType().click();
        projectPage.GetProjectType().sendKeys("Architectural");
        Thread.sleep(1000);
        action.moveToElement(projectPage.GetProjectType()).perform();
        projectPage.GetProjectType().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        Thread.sleep(1000);
        projectPage.getLocation().click();
        Thread.sleep(500);
        projectPage.getLocation().sendKeys("t");
        Thread.sleep(1000);
        action.moveToElement(projectPage.getLocation()).perform();
        projectPage.getLocation().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

        projectPage.getProjectScope().click();
        projectPage.getProjectScope().sendKeys("supply and install");
        Thread.sleep(1000);
        action.moveToElement(projectPage.getProjectScope()).perform();
        projectPage.getProjectScope().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        projectPage.getOutsideQuotations().sendKeys("No requirements");
        Thread.sleep(1000);

        projectPage.getProjectStage().click();
        projectPage.getProjectStage().sendKeys("not");
        Thread.sleep(500);
        projectPage.getNotStartedStage().click();

        Thread.sleep(500);
        projectPage.getPrCreationDate().click();
        projectPage.getPrCreationDate().sendKeys("20231231");

        Thread.sleep(500);
        projectPage.getPrCompletionDate().click();
        projectPage.getPrCompletionDate().sendKeys("20241231");

        projectPage.getProjectStatus().sendKeys("active");
        Thread.sleep(500);
        action.moveToElement(projectPage.getProjectStatus()).perform();
        projectPage.getProjectStatus().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        projectPage.getSaveButton().click();

        String alertMessage = driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']")).getText();
        System.out.println(alertMessage);
        //driverWait.until(ExpectedConditions.textToBePresentInElement(alertMessage,"project created successfully."));
        // Thread.sleep(300);
        Assert.assertEquals(alertMessage, "project created successfully.");

    }

    @Test
    public void creatingProjectWithOnlyRequiredFields() throws InterruptedException {

        Actions action = new Actions(driver);


        loginPage.login("tomislav.jevtic@intens.rs", "cF!nnrW&EBZR6w79");


        Thread.sleep(5000);
        driver.navigate().to("https://sobotec.azurewebsites.net/projects/all/overview");
        Thread.sleep(5000);
        action.moveToElement(projectPage.getCreateButton()).perform();
        Thread.sleep(3000);
        projectPage.getCreateButton().click();
        action.moveToElement(projectPage.getNewProjectButton()).perform();
        Thread.sleep(3000);
        projectPage.getNewProjectButton().click();
        Thread.sleep(1000);

        action.moveToElement(projectPage.getDropdownMenagers()).perform();
        Thread.sleep(1000);
        projectPage.getMenagersFied().click();
        action.scrollToElement(projectPage.getMyNameMenagers()).perform();
        action.moveToElement(projectPage.getMyNameMenagers()).perform();
        Thread.sleep(1000);
        projectPage.getMyNameMenagers().click();

        projectPage.getTeamField().click();
        Thread.sleep(1000);
        projectPage.getTeamField().sendKeys("black");
        action.moveToElement(projectPage.getTeamField()).perform();
        projectPage.getTeamField().sendKeys(Keys.ARROW_DOWN);
        projectPage.getTeamField().sendKeys(Keys.ENTER);


        projectPage.GetProjectType().click();
        projectPage.GetProjectType().sendKeys("Architectural");
        Thread.sleep(1000);
        action.moveToElement(projectPage.GetProjectType()).perform();
        projectPage.GetProjectType().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        Thread.sleep(1000);


        projectPage.getProjectScope().click();
        projectPage.getProjectScope().sendKeys("supply and install");
        Thread.sleep(1000);
        action.moveToElement(projectPage.getProjectScope()).perform();
        projectPage.getProjectScope().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);



        projectPage.getProjectStage().click();
        projectPage.getProjectStage().sendKeys("not");
        Thread.sleep(500);
        projectPage.getNotStartedStage().click();

        Thread.sleep(500);
        projectPage.getPrCreationDate().click();
        projectPage.getPrCreationDate().sendKeys("20231231");



        projectPage.getProjectStatus().sendKeys("active");
        Thread.sleep(500);
        action.moveToElement(projectPage.getProjectStatus()).perform();
        projectPage.getProjectStatus().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        projectPage.getSaveButton().click();

        WebElement alertMessage = driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']"));

        String alertString = alertMessage.getText();
        System.out.println(alertString);
       // Thread.sleep(300);
        Assert.assertEquals(alertMessage.getText(), "project created successfully.");





    }
//    @Test
//    public void error() throws InterruptedException {}

}
