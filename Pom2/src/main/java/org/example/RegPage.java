package org.example;

import org.openqa.selenium.By;


//import org.openqa.selenium.support.ui.Select;


public class RegPage extends Utils {

    public void enterRegisterationDetails() {

            LoadProperty loadProperty = new LoadProperty();
            private By register = By.linkText("Register");
            private By firstName = By.id("FirstName");
            private By lastName = By.id("LastName");
            private By dateOfBirth = By.name("DateOfBirthDay");
            private By monthOfBirth = By.name("DateOfBirthMonth");
            private By yearOfBirth = By.name("DateOfBirthYear");
            private By emailId = By.xpath("//input[@id='Email']");
            private By companyName = By.xpath("//input[@id='Company']");
            private By password = By.id("Password");
            private By confirmPassword = By.name("register-button");

            public void enterRegisterationDetails()
    {
                // timestamp for current time - to cr
                // create unique value each time we run the program
               Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                // wait before clicking on Register button
                waitForClickable (register,3000);
                //select gender
                clickOnElement(By.xpath("//input[@id='gender-male']"));
                // type first name
                enterText(firstName,loadProperty.getProperty("firstname") );
                // type last name
                enterText(lastName,loadProperty.getProperty("lastname"));
                // select date of birth
                selectFromDropDownByValue(dateOfBirth,loadProperty.getProperty("dateofbirth"));
                // select month of birth
                selectFromDropdownByVisibleText(monthOfBirth,loadProperty.getProperty("monthofbirth"));
                // select year of birth
                selectFromDropDownByValue(yearOfBirth,loadProperty.getProperty("yearofbirth"));
                // type email id
                enterText(emailId, loadProperty.getProperty("emailId")+timestamp.getTime()+"@test.com");
                // type company name
                enterText(companyName,loadProperty.getProperty("companyname"));
                // click on the checkbox of Newsletter
                clickOnElement(By.xpath("//input[@type = 'checkbox12']"));
                // type password
                enterText(password, loadProperty.getProperty("password"));
                // retype password
                enterText(confirmPassword, loadProperty.getProperty("confirmpassword"));
                // click on Register Button
                clickOnElement(By.name("register-button"));
            }

        }









}

