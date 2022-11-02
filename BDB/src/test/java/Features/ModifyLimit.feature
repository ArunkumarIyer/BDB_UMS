Feature: Modify limit

  Scenario Outline: To verify whether user is able to modify transaction limit details -Maker level

    When Enter maker username "<Username_m>" and password "<Password_m>"
    And Click on login
    Then Click on plus
    And Click on User Admin
    And Click on Customer Administration
    And Enter customer name "<Customer_name>"
    And click on search button
    And click on customer link "<Customer_name>"
    Then Customer maintance page will appear
    And Click on Customer Id Tab
    And Click on Customer Host ID link
    And Click on User level limits tab
    And Select User level limits option
    And Click on modift link
    And Update upper limit value "<Upper_Limit>"
    And Click on submit button
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

    Examples: 
      | Username_m | Password_m    | Username_c | Password_c    | Customer_name | Upper_Limit |Remark|
      | TGHALI     | ChangePwd@123 | STAQI      | ChangePwd@123 | sonali2014    |        1000 |OK    |
