
@tag
Feature: Test login functionality for ILovePDF website and check if user is redirected to the proper landing page on successful login
  
  Background: 
  Given I landed on the proper website of ILovePDF
  
  @tag1
  Scenario Outline: Test login button name
    Given I am present on homepage
    When I check text of the Login button
    Then I verify the text of the Login button is equal to "Login" 
 
      
   @tag2
  Scenario Outline: Test login functionality with correct credentials
    Given I am present on login page "iLovePDF | Online PDF tools for PDF lovers"
    When I enter the "deyankur1995@gmail.com" and "canvas2.2" and click on login
    Then I should be logged in and redirected to the homepage
