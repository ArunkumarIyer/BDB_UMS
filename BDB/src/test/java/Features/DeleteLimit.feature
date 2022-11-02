Feature: Delete limit 

Scenario Outline: To verify whether user is able to Delete transaction limit details - Maker level 
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
	And Click on delete link 
	And fetch pop-up box text click on ok button 
	Then click on logout button 
	Examples: 
		| Username_m | Password_m    | Username_c  | Password_c    | Customer_name | 
		| TGHALI     | ChangePwd@123 | STAQI       | ChangePwd@123 |    sonali2014 |
		
		
		