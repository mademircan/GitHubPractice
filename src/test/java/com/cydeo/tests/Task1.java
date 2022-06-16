package com.cydeo.tests;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void OpenBrowser(){
        Driver.getDriver().get("https://www.etsy.com");

        
    }

}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */