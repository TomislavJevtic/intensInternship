package Sobotec.tests;

import org.testng.annotations.Test;

public class CreateInventoryComponentFromSystemTests extends BaseTest {

    @Test
    public void createComponent() {
        loginPage.login("darko.tot@intens.rs","mOnGz3@DNk0!6Jpm");
        driver.navigate().to("https://sobotec.azurewebsites.net/projects/d19fe85a-8c66-4b81-986f-da867aa4a2e0/systems?st=2&projectSystemId=b1bc1289-6b89-4d2c-8baa-1f64e2ac523c");

    }
}
