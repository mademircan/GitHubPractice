package com.cydeo.tests;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task2_hanife {

    //Practice: Checkboxes
    @Test
    public void task2_hanife(){
        //1. Go to http://practice.cydeo.com/checkboxes
        Driver.getDriver().get("https://practice.cydeo.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        //WebElement checkbox1 =
        //3. Confirm checkbox #2 is SELECTED by default.
        //4. Click checkbox #1 to select it.
        //5. Click checkbox #2 to deselect it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected

    }

}
