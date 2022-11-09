package StepDefinitions;

import Utils.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import sun.swing.PrintingStatus;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void before(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        System.out.println("Before Method  ");

    }

@After
    public void after(){

        Driver.closeDriver();
        System.out.println("After method  ");

    }


}
