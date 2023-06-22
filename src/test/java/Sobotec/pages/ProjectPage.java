package Sobotec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage extends BasePage {

    private By projectTab = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div/div/ul/li[3]/div/div[1]/a");

    private By overview = By.className("mainnav-menu-items.active");
    ///html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]
    private By teamField = By.xpath
            ("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]");

    private By createButton = By.cssSelector("div[id='createButton'] button[type='button']");
    private By newProjectButton = By.xpath("//body/div[5]//ul[@role='menu']/li[@role='menuitem']//div[@class='text-menu']");

    private By projectNameField = By.name("projectName");
    private By projectNumberField = By.name("projectNumber");
    private By estimateNumberField = By.name("estimateNumber");
    //button[normalize-space()='SAVE']
    private By saveButton = By.xpath("//button[normalize-space()='SAVE']");

    private By estimatorField = By.xpath
            ("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]");


    private By dropdownMenagers = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/button[2]");
    private By myName = By.xpath("//div[@title='Tomislav Jevtić']");
    private By menagersField = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
    private By pType = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/input[1]");
    private By location = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/input[1]");
    private By pScope = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[11]/div/div/div/input");
    private By outsideQuotations = By.name("additionalNotes");
    private By engineeringCalcsProjectCheck = By.name("engineeringCalcsProject");
    private By leedProjectCheck = By.name("leedProject");

    //engineeringCalcsProject
    private By pStage = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private By creationDate = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[2]/div[1]/div[1]/input[1]");
    private By completionDate = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[3]/div[1]/div[1]/input[1]");
    private By pStatus = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[4]/div[1]/div[1]/div[1]/input[1]");
    private By notStartedStage = By.xpath("//div[@title='Not Started']");


//    public WebElement getProjectTab() {return getDriver().findElement(projectTab);}
//
//    public WebElement getOverview() {
//        return getDriver().findElement(overview);
//    }

    public WebElement getCreateButton() {
        return getDriver().findElement(createButton);
    }

    public WebElement getNewProjectButton() {
        return getDriver().findElement(newProjectButton);
    }

    public WebElement getMenagersFied() {
        return getDriver().findElement(menagersField);
    }

    public WebElement getMyNameMenagers() {return getDriver().findElement(myName);}

    public WebElement getDropdownMenagers() {
        return getDriver().findElement(dropdownMenagers);
    }

    public WebElement getTeamField() {
        return getDriver().findElement(teamField);
    }

    public WebElement getProjectNameField() {
        return getDriver().findElement(projectNameField);
    }

    public WebElement getProjectNumberField() {
        return getDriver().findElement(projectNumberField);
    }
    public WebElement getEstimateNumberField() {
        return getDriver().findElement(estimateNumberField);
    }


    public WebElement GetProjectType() {
        return getDriver().findElement(pType);
    }
    public WebElement getLocation() {
        return getDriver().findElement(location);
    }
    public WebElement getProjectScope() {
        return getDriver().findElement(pScope);
    }
    public WebElement getOutsideQuotations() {
        return getDriver().findElement(outsideQuotations);
    }
    public WebElement getEnCalcsProjectCheck() {
        return getDriver().findElement(engineeringCalcsProjectCheck);
    }
    public WebElement getLeedProjectCheck() {
        return getDriver().findElement(leedProjectCheck);
    }

    public WebElement getProjectStage() {
        return getDriver().findElement(pStage);
    }
    public WebElement getPrCreationDate() {
        return getDriver().findElement(creationDate);
    }
    public WebElement getPrCompletionDate() {
        return getDriver().findElement(completionDate);
    }
    public WebElement getProjectStatus() {
        return getDriver().findElement(pStatus);
    }

    public WebElement getEstimatorField() {
        return getDriver().findElement(estimatorField);
    }
    public WebElement getNotStartedStage() {
        return getDriver().findElement(notStartedStage);
    }
    public WebElement getSaveButton(){ return getDriver().findElement(saveButton);}

    public ProjectPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
