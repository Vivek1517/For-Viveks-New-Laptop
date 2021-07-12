package automationPractice.StepDefs;

import automationPractice.Pages.BasePage;
import automationPractice.Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
    @Before
    public void setUp(){
        BrowserFactory.startBrowser();
    }

    @After
    public void cleanUp(){
        BrowserFactory.stopBrowser();
    }
}
