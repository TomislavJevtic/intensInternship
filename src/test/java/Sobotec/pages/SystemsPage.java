package Sobotec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SystemsPage extends BasePage{
    private By createBtn = By.id("createButton");
    private By threeDotsBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/button");
    private By addNewComponent = By.xpath("/html/body/div[4]/div[3]/ul/li[2]/div/div/p");
    private By categorySelect = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/input");
    private By estQty = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/input");
    private By subCategorySelect = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[3]/div/div/div/input");
    private By unitSelect = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[4]/div/div/div/input");
    private By componentSelect = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[5]/div/div/div/input");
    private By approvedCheckBox = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[6]/div/label/span[1]/input");
    private By dateApproved = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[8]/div/div/input");
    private By leadTime = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[10]/div/div/input");
    private By saveBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[1]/div[2]/button");
    private By discardBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/div[1]/div[1]/div/button");
    private By removeComponentBtn = By.xpath("/html/body/div[4]/div[3]/ul/li[6]/div/div/p");
    private By removeConfrBtn = By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[2]/button");
    private By successMessage = By.xpath("//div[contains(@class,'MuiAlert-message css-1xsto0d')]");


    public SystemsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCreateBtn() {
        return getDriver().findElement(createBtn);
    }

    public WebElement getThreeDotsBtn() {
        return getDriver().findElement(threeDotsBtn);
    }

    public WebElement getAddNewComponent() {
        return getDriver().findElement(addNewComponent);
    }

    public WebElement getCategorySelect() {
        return getDriver().findElement(categorySelect);
    }

    public WebElement getEstQty() { return getDriver().findElement(estQty); }

    public WebElement getSubCategorySelect() {
        return getDriver().findElement(subCategorySelect);
    }

    public WebElement getUnitSelect() { return getDriver().findElement(unitSelect); }

    public WebElement getComponentSelect() {
        return getDriver().findElement(componentSelect);
    }

    public WebElement getApprovedCheckBox() { return getDriver().findElement(approvedCheckBox); }

    public WebElement getDateApproved() { return getDriver().findElement(dateApproved); }

    public WebElement getLeadTime() { return getDriver().findElement(leadTime); }

    public WebElement getSaveBtn() { return getDriver().findElement(saveBtn); }

    public WebElement getDiscardBtn() { return getDriver().findElement(discardBtn); }

    public WebElement getRemoveComponentBtn() { return getDriver().findElement(removeComponentBtn); }

    public WebElement getRemoveConfrBtn() { return getDriver().findElement(removeConfrBtn); }

    public WebElement getSuccessMessage() { return getDriver().findElement(successMessage); }
    // //*[@id="root"]/div[2]/div[1]/div[4]/div/div/div/div/div/div[2]
    public void selectCategory(String categoryName) {
        getCategorySelect().click();
        getCategorySelect().sendKeys(categoryName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getCategorySelect().click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getCategorySelect().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void newComponent() {
        getThreeDotsBtn().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getAddNewComponent().click();
    }

    public void removeComponent() {
        getThreeDotsBtn().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getRemoveComponentBtn().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getRemoveConfrBtn().click();

    }

    public void insertEstQty(String numb) {
        getEstQty().sendKeys(numb);
    }

    public void selectSubCategory(String SubName) {
        getSubCategorySelect().click();
        getSubCategorySelect().sendKeys(SubName);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSubCategorySelect().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getSubCategorySelect().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectUnit(String UnitName) {
        getUnitSelect().click();
        getUnitSelect().sendKeys(UnitName);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getUnitSelect().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getUnitSelect().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectComponent(String ComponentName) {
        getComponentSelect().click();
        getComponentSelect().sendKeys(ComponentName);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getComponentSelect().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getComponentSelect().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void insertDateApproved(String Date) {
        getDateApproved().click();
        getDateApproved().sendKeys(Date);
    }

    public void insertLeadTime (String Text) {
        getLeadTime().sendKeys(Text);
    }


// driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl02_EditFormControl_rcbControllerType1_Input")).sendKeys("ValueTwo", Keys.ARROW_DOWN, Keys.ENTER)
}
