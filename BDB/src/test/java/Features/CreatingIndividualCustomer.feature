Feature: Individual customer


  Scenario Outline: Creating individual customer
    When Enter maker username "<Username_m>" and password "<Password_m>"
    And Click on login
    Then Click on plus
    And Click on User Admin
    And Click on Customer Administration
    And Click on Hamburger icon
    And Click on Customer Creation option
    And Fill customer basic details "<Customer_name>" "<Description>" "<Customer_type>"
    Then Click on Create button
    And Handle the pop-up box
    Then landing page will appear
    And Enter customer name "<Customer_name>"
    And click on search button
    And click on customer link "<Customer_name>"
    Then Customer maintance page will appear
    And Click on Customer Id Tab
    And Click on Attach Button
    #Customer Host ID Act Link
    And Click on Customer Host ID Act Link
    And Enter CIF number "<Cif_no>" in Host Customer Id TextField
    And Click on CustomerId Search Button
    And Click on Customer Radio Button
    And Click on Customer Confirm Button
    And Handle the pop-up box
    #Account Selection Act Link
    Then click on Resume button
    And click on Account Selection Act Link
    And Click on Account Confirm Button
    And Handle the pop-up box
    #Parameters Setting Act Link
    Then click on Resume button
    And Click on Parameters Setting Act Link
    And Click on Parameter Submit Button
    And Handle the pop-up box
    And click on Resume button
    Then click on Release Button
    And Handle the pop-up box
    #Grant Modules Tab
    Then Click on Grant Modules Tab
    And Click on Digital option
    And Click on Move Right Button
    And Click on Grant Confirm Button
    And Handle the pop-up box
    #Grant Roles Tab
    Then Click on Grant Roles Tab
    And select USER option "<User_option>" and added to right side
    And Click on single move right button
    And Click on Grant Role Button
    #And Handle the pop-up box
    #if pool page is not appear then handle this pop up
    #If pool page is appear -------
    Then click on Pool radio button and enter remark "<Remark>"
    And click on submit button
    And fetch the reference number
    And Handle the pop-up box
    Then click on logout button
    When Enter checker username "<Username_c>" and password "<Password_c>"
    And Click on login
    Then Click on plus
    And Click on User Admin
    And click on Authorization queue icon
    And Click on pool queue button
    And enter the reference number and click on search button
    And click on reference number link
    And click on approve radio button and enter remark "<Remark>"
    And fetch pop-up box text click on ok button
    Then click on logout button
 
   #Maker User creation process
    When Enter maker username "<Username_m>" and password "<Password_m>"
    And Click on login 
    Then Click on plus
    And Click on User Admin
    And Click on Customer User Administration Icon
    And Click on Hamburger Icon
    And Select "<User_Category>" value in User Category DropDown
    And Enter "<login_ID>" in login ID TextField
    And Enter "<First_Name>" in First Name TextField
    And Enter "<Last_Name>" in Last Name TextField
    And Select "<Country_DropDown>" in Country DropDown
    And Select "<Number_Country>" in Phonen Number Country
    And Enter "<Phone_Number>" in Phone Number TextField
    And Enter "<email_ID>" in email ID TextField
    Then Click on Customer search Button
    And Enter "<Customer_name>" in Customer Name TextField
    And Click on Search Button
    And Click on customer Radio Button
    And Click on Proceed Button
    And Click on Save Button
    
    #Pool Queue Assignment
    And  click on Pool radio button and enter remark "<Remark>"
    And click on submit button
    And fetch the reference number
    And Handle the pop-up box
    Then click on logout button
    
    #login with Checker for approve
    When Enter checker username "<Username_c>" and password "<Password_c>"
    And Click on login 
    Then Click on plus
    And Click on User Admin
    And click on Authorization queue icon
    And Click on pool queue button
    And enter the reference number and click on search button
    And click on reference number link
    And click on approve radio button and enter remark "<Remark>"
    And fetch pop-up box text click on ok button
    Then click on logout button   


    Examples: 
      | Username_m | Password_m    | Username_c  | Password_c    | Customer_name      | Description | Customer_type | Cif_no | User_option | Remark | User_Category | login_ID    | First_Name | Last_Name |Country_DropDown|Number_Country|Phone_Number|email_ID        |  
      | BDBTELLER1 | ChangePwd@123 | BDBMANAGER1 | ChangePwd@123 | pro1278            | Automation  | Retail        | 119696 | RETAIL USER | OK     | CUSTOMER USER | Autopro172  | Akshay     | Bhamare   | Bahrain        | 973          | 21345679   | pro78@gmail.com|

      
      
      