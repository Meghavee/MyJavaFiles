package org.example;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils extends BasePage {
    public void testing(String name) {

    }
    // method for Webdriver wait
    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        //wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // method to select from drop down by value
    public static void selectFromDropDownByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    // method to select from drop down by index
    public static void selectFromDropDownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    // method to select from drop down by visibletext
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
}