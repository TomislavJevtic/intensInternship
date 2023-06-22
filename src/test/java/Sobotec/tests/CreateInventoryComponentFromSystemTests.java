package Sobotec.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateInventoryComponentFromSystemTests extends BaseTest {

    @AfterMethod
    public void afterMethodSetup() {
        driver.quit();
    }

    //Verify that user can add component to system with existing component information - Happy Flow
    @Test
    public void createComponent() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.login("darko.tot@intens.rs","mOnGz3@DNk0!6Jpm");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().to("https://sobotec.azurewebsites.net/projects/d19fe85a-8c66-4b81-986f-da867aa4a2e0/systems?st=2&projectSystemId=b1bc1289-6b89-4d2c-8baa-1f64e2ac523c");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().newComponent();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().selectCategory("Elect");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().insertEstQty("3");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().selectSubCategory("Connect");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().selectUnit("piece");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSystemsPage().getApprovedCheckBox().click();
        getSystemsPage().insertDateApproved("20230618");
        getSystemsPage().insertLeadTime("As Soon As Possible.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSystemsPage().selectComponent("FVD21");
        getSystemsPage().getSaveBtn().click();

        getDriverWait().until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@class,'MuiAlert-message css-1xsto0d')]"),"system component created successfully."));
        String expectedResultMessage = "system component created successfully.";
        String actualResultMessage = getSystemsPage().getSuccessMessage().getText();
        //System.out.println(actualResultMessage);
        Assert.assertTrue(actualResultMessage.contains(expectedResultMessage));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Verify that user can add component to system by filling only the required fields
    @Test
    public void createComponentWithRequiredFields() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.login("darko.tot@intens.rs","mOnGz3@DNk0!6Jpm");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().to("https://sobotec.azurewebsites.net/projects/d19fe85a-8c66-4b81-986f-da867aa4a2e0/systems?st=2&projectSystemId=b1bc1289-6b89-4d2c-8baa-1f64e2ac523c");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().newComponent();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().selectCategory("Shop");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().insertEstQty("20");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().selectSubCategory("Silicon");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().selectUnit("piece");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSystemsPage().selectComponent("SIL004");
        getSystemsPage().getSaveBtn().click();

        getDriverWait().until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@class,'MuiAlert-message css-1xsto0d')]"),"system component created successfully."));
        String expectedResultMessage = "system component created successfully.";
        String actualResultMessage = getSystemsPage().getSuccessMessage().getText();
        Assert.assertTrue(actualResultMessage.contains(expectedResultMessage));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //Verify that user can't add component to system by leaving all fields empty
    @Test
    public void createComponentByLeavingFieldsEmpty() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.login("darko.tot@intens.rs","mOnGz3@DNk0!6Jpm");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().to("https://sobotec.azurewebsites.net/projects/d19fe85a-8c66-4b81-986f-da867aa4a2e0/systems?st=2&projectSystemId=b1bc1289-6b89-4d2c-8baa-1f64e2ac523c");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getSystemsPage().newComponent();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSystemsPage().getSaveBtn().click();

        getDriverWait().until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@class,'MuiAlert-message css-1xsto0d')]"),"Please provide all required data before trying to save"));
        String expectedResultMessage = "Please provide all required data before trying to save";
        String actualResultMessage = getSystemsPage().getSuccessMessage().getText();
        Assert.assertTrue(actualResultMessage.contains(expectedResultMessage));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSystemsPage().getDiscardBtn().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
