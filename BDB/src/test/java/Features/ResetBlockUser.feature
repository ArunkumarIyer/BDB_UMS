Feature: grant Transaction limits based on capability level

  Scenario Outline: To verify whether business customer is able reset password and block user
    Given Enter maker username "<Username_m>" and password "<Password_m>"
    And Click on login
    Then Click on plus
    And Click on User Admin
    And Click on Customer User Administration Icon
    And Select "<User_Category>" in Customer User Management
    And Enter "<Checker_login_ID>" in Customer User Management login ID TextField
    And Click on Search Button
    And Click on "<Checker_login_ID>" Login ID Link in Customer User Management
    And Click on Reset Password Tab
    And Enter "<Remark>" in Remark
    And Click on Confirm Button
   
    #Pool Queue Assignment
    And click on Pool radio button and enter remark "<Remark>"
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
    # For Block user
    And Enter maker username "<Username_m>" and password "<Password_m>"
    And Click on login
    Then Click on plus
    And Click on User Admin
    And Click on Customer User Administration Icon
    And Select "<User_Category>" in Customer User Management
    And Enter "<Checker_login_ID>" in Customer User Management login ID TextField
    And Click on Search Button
    And Click on "<Checker_login_ID>" Login ID Link in Customer User Management
    And Click on Block User
    And Enter "<Remark>" in Other Details
    And Click on Block user Confirm Button
   
    #Pool Queue Assignment
    Then click on Pool radio button and enter remark "<Remark>"
    And click on submit button
    And fetch the reference number
    And Handle the pop-up box
    Then click on logout button
   
    #Checker login for approve
    And Enter maker username "<Username_c>" and password "<Password_c>"
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
      | Username_m | Password_m    | User_Category | Checker_login_ID | Remark | Username_c | Password_c    |
      | TGHALI     | ChangePwd@123 | CUSTOMER USER | SONALIID1181     | OKAY   | STAQI      | ChangePwd@123 |
