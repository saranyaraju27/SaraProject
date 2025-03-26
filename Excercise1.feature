Feature: Launching application demo

@TC_001
Scenario: Launch the application

Given Verify the title of the page
And Click on my account dropdown
And Click register from dropdown
Then Verify the register account Page
And Click on the continue button
Then Verify the warning message 
And enter the personal deatils 
And enter the address details 
And enter the newsletter details
Then Verify the view order history


#1. Enter data in 'First Name' text box  
#
#2. Verify if 33 characters can be entered in 'First Name' text box by clicking on 'Continue' button.  
#
#3. If not, verify error message.  
#
#4. Enter data in 'Last Name' text box  
#
#5. Verify if 33 characters can be entered in 'First Name' text box by clicking on 'Continue' button.  
#
#6. If not, verify error message.  
#
#7. Enter valid 'E-mail'.  

#8. Enter 'Telephone' which must be between 3 and 32 characters.  

 