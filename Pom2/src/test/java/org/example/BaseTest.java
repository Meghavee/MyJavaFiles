package org.example;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {


        @BeforeMethod
        public void openBrowser(){

            driver.get("https://demo.nopcommerce.com/");

        }
        @AfterMethod
        public void closeBrowser(ITestResult result){
            driver.quit();
        }



    }


