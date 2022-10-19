Feature: Corporate with maker checker Customer 

Scenario Outline: Creating corporate customer with maker checker  
	When Enter maker username "<Username_m>" and password "<Password_m>" 
	And Click on login 
	Then Click on plus 
	And Click on User Admin 
	And Click on Customer Administration 
	And Click on Hamburger icon
	And Click on Customer Creation option  
	And Fill customer basic details "<Customer_name>" "<Description>" "<Customer_type>" 
	And Select Multi User Required CheckBox 	
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
	Then click on Resume button
 
	 
	
	##########
	#fill User Level Limits -> maker
	And Click on user level act link 
	And Select Currency DropDown "<Curreny_Dropdown>" 
	And Select Authorization Type DropDown "<Maker_Authorization_Dropdown>" 
	And Select Transaction DropDown "<Transaction_Dropdown>" 
	And Click on Limit Proceed Button 
	And Enter value in Upper Limit TextField "<Upper_Limit>" 
	And Select Override Flag DropDown "<Override_Dropdown>" 
	And Enter value in per Day Limit TextField "<Maker_per_Day_Limit>" 
	And Enter value in Future Transaction Limit TextField "<Maker_Future_Transaction>" 
	And Click on limit Submit Button 
	And Handle the pop-up box 
	Then click on Resume button 
	
	#fill User Level Limits -> Checker
	And Click on user level act link 
	And Select Currency DropDown "<Curreny_Dropdown>" 
	And Select Authorization Type DropDown "<Checker_Authorization_Dropdown>" 
	And Select Transaction DropDown "<Transaction_Dropdown>" 
	And Click on Limit Proceed Button 
	And Enter value in lower Limit Textfield "<Checker_lower_Limit>" 
	And Enter value in Upper Limit Textfield "<Checker_Upper_Limit>" 
	And Enter value in per Day Limit TextField "<Checker_Per_Day_Limit>" 
	And Enter value in Future Transaction Limit TextField "<Checker_Future_Transaction>" 
	And Click on limit Submit Button 
	And Handle the pop-up box 
	Then click on Resume button 
	
	#fill Authorization Matrix
	And Click on authorization matrix act link 
	And Select value in Transaction dropdown "<Auth_Transaction_Dropdown>" 
	And Select value from currency dropdown "<Curreny_Dropdown>" 
	And Enter value in Minimum transaction amount Textfield "<Minimum_transaction>" 
	And Enter value in Maximum transaction amount Textfield "<Maximum_transaction>" 
	And Click on authrization Proceed Button 
	And Enter value in Approvals TextField "<Approvals>" 
	And Select value in Repeat Flag DropDown "<Repeat_Flag_DropDown>" 
	And Select value level DropDown "<level_DropDown>" 
	And Click on Authorization Save Button 
	And Handle the pop-up box 
	Then click on Resume button 
	And click on Release Button 
	And Handle the pop-up box 
	
	#fill Grant Modules Tab
	Then Click on Grant Modules Tab 
	And Click on Digital option 
	And Click on Move Right Button 
	And Click on Grant Confirm Button 
	And Handle the pop-up box 
	#fill Grant Roles Tab
	And Click on Grant Roles Tab 
	And Click on Move Right Button 
	And Click on Grant Role Button
	#And Handle the pop-up box #if pool page is not appear then handle this pop up
	
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
	And Enter "<maker_login_ID>" in login ID TextField 
	And Enter "<First_Name>" in First Name TextField 
	And Enter "<Last_Name>" in Last Name TextField 
	And Select "<Country_DropDown>" in Country DropDown 
	And Select "<Number_Country>" in Phonen Number Country 
	And Enter "<Phone_Number>" in Phone Number TextField 
	And Enter "<maker_email_ID>" in email ID TextField 
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
	
	#Chacker User creation process 
	When Enter maker username "<Username_m>" and password "<Password_m>" 
	And Click on login 
	Then Click on plus 
	And Click on User Admin 
	And Click on Customer User Administration Icon 
	And Click on Hamburger Icon 
	And Select "<User_Category>" value in User Category DropDown 
	And Enter "<Checker_login_ID>" in login ID TextField 
	And Enter "<First_Name>" in First Name TextField 
	And Enter "<Last_Name>" in Last Name TextField 
	And Select "<Country_DropDown>" in Country DropDown 
	And Select "<Number_Country>" in Phonen Number Country 
	And Enter "<Phone_Number>" in Phone Number TextField 
	And Enter "<checker_email_ID>" in email ID TextField 
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
		|Username_m|   Password_m |Customer_name|Description|Customer_type|  Cif_no  |Curreny_Dropdown|Maker_Authorization_Dropdown|Transaction_Dropdown|Upper_Limit|Override_Dropdown|Maker_per_Day_Limit|Maker_Future_Transaction|Checker_Authorization_Dropdown|Checker_lower_Limit|Checker_Upper_Limit|Checker_Per_Day_Limit|Checker_Future_Transaction|Auth_Transaction_Dropdown|Minimum_transaction|Maximum_transaction|Approvals|Repeat_Flag_DropDown|      level_DropDown   |Remark|Username_c |Password_c   |User_Category|maker_login_ID  |First_Name|Last_Name|Country_DropDown|Number_Country|Phone_Number|  maker_email_ID     |Checker_login_ID  |checker_email_ID   |                    
		|BDBTELLER1| ChangePwd@123|  corp1317   | Automation|   Business  |  119445  |      BHD       |             Maker          |   All Financial    |   1000    |        Yes      |         1000      |          1000          |	       Checker              |         5         |       100         |          100        |           100            |        All Financial    |        5          |       1000        |   1     |          No        |CL1 ( 5.000 -  100.000)|okay  |BDBMANAGER1|ChangePwd@123|CUSTOMER USER|   corpm2128    |   Sonali |  Bamane |    Bahrain     |     973      |  12345678  |maker228973@gmail.com|   cropc71238     |corc12889@gmail.com|
		