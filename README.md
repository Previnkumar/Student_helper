## Student Helper

### Usage Description

This is a project for student management. 
User can student details, his/her profile pic and semester marks
Through this application user can sent mail to all his/her students very easily
This can be customized to all departments by simply changing the credit point for subjects
It will calculate GPA, CGPA (with number of backlogs and all clears)

All the details in the application can be exported at anytime to excel sheets. 
And also marks don't need to be added for each entry. It can be imported if it is already in an excel file



### Technical Description

#### System Requirements

This project is made in java-swing
For running the application, it demands java installation

To store the records, you need mysql server to be running in your system

Easy way for mysql and other server installations is by using Xampp Control panel
Software Download Link: https://www.apachefriends.org/download.html

#### Classes

helper.java   - Main class (Database presence is tested here, If not exist it will be created)

helper1.java  - Login Frame

helper2.java  - Main Frame

TableColumnAdjuster - To align table contents

