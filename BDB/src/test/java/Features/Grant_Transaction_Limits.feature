Feature: grant Transaction limits based on capability level

Scenario Outline:To verify whether business customer is able grant Transaction limits based on capability level opopo
	Given Enter maker username "<Username_m>" and password "<Password_m>" 
	And Click on login 
	Then Click on plus 
	And Click on User Admin 
	And Click on Customer User Administration Icon 
	And Select "<User_Category>" value in user management User Category DropDown 
	And Enter "<Checker_login_ID>" in Customer User Management login ID TextField  
	And Click on Search Button
	And Click on "<Checker_login_ID>" Login ID Link in Customer User Management
	And Click on Transaction Limit Tab
	And Select value from Customer Reference "<Customer_Reference>" DropDown
	And Select value from Transaction Type DropDown "<Transaction_Dropdown>"
	And Select value from Currency DropDown "<Curreny_Dropdown>"
	And Select value from Authorisation Type DropDown "<Authorization_Dropdown>"
	And Click on transaction limit Proceed Button
	And Enter value in Upper Limit Textfield "<Upper_Limit>" 
	And Enter value in per Day Limit TextField "<Per_Day_Limit>" 
	And Enter value in Future Transaction Limit TextField "<Future_Transaction>" 
	And Click on transaction limit Submit Button 
	 
	
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
		|Username_m|   Password_m |User_Category|Checker_login_ID|        Customer_Reference             |Transaction_Dropdown|Curreny_Dropdown|Authorization_Dropdown|Upper_Limit|Per_Day_Limit|Future_Transaction|Remark| Username_c|Password_c   |                    
		|  TGHALI  | ChangePwd@123|CUSTOMER USER|  cropc71289    |    M/S.AHMED MADAN ABDULLA MADAN      |    All Financial   |       BHD      |     Maker            |   1000    |     1000    |       1000       | okay |   STAQI   |ChangePwd@123|
		
		
		
		
		
		
		
		
		
		
		
		