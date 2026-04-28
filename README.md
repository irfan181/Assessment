 QA Assignment

 Part A – Conceptual Questions


1)	Write test cases for Login functionality?
A)	Positive Cases:-
Valid login:- Enter correct username & password → User logs in successfully
Login with enter key:- Press Enter instead of button → Login should work
B)	 Negative Cases:-
Wrong Password:- Correct username + wrong password → Show error message
Wrong user name:- Wrong username + correct password → Show error
Empty fields:- Leave both fields blank → Show “Required” messages
C)	Validation Cases:-
Invalid email format:-Example: user.com -> Show “invalid email”.
Short password:-.Enter very short password -> Show validation error
D)	UI Cases:- 
Password hidden:-Password should show as dots(****)
Tab navigation:-Tab key should move correctly between fields
E)	Security cases:-
Multiple Wrong attempts:-After many wrong tries -> Account should lock or show warning
F)	Functional Cases:-
Forget password:- Click link -> Should go to reset page
Logout:- User should not access dashboard

2)	If an organization has both mobile and web applications like Rengy, how would you approach automation?
A)	If an organization has both web and mobile applications, I would start with API automation because it is common for both platforms and helps validate the main business logic. After that, I would do web automation using Selenium for browser testing and mobile automation using Appium for Android and iOS apps. Then I would cover end-to-end scenarios by combining API and UI flows, such as creating a user through API and verifying login on both web and mobile. Finally, I would integrate everything into a CI/CD pipeline so that tests run automatically on every build.

3)	How do you automate Login functionality using Appium?
A)	To automate login functionality using Appium, I would follow a simple step-by-step approach.
B)	First, I set up the Appium environment by starting the Appium server and connecting a real device or emulator. Then I inspect the mobile app using Appium Inspector to find element locators like id, x path, or accessibility id for username field, password field, and login button.
C)	After that, I write the automation script using Java (or any supported language). I create desired capabilities to launch the app then locate elements and perform actions like entering username, entering password, and clicking the login button.
D)	Example flow:
E)	Open the app using Appium driver
F)	Find username field and enter value (example: testuser)
G)	Find password field and enter value (example: Test@123)
H)	Click on login button
I)	Validate successful login by checking dashboard element or home screen title
J)	Finally, I add assertions to verify expected results and run the script on a real device or emulator. I can also extend it with negative cases like invalid login or empty fields.

4)	How do you automate Login functionality using Selenium?
A)	To automate login functionality using Selenium, I first identify the login page elements such as username field, password field, and login button using locators like id, name, xpath, or css selector.
B)	Then I write a test script in Java (or any language supported by Selenium). In the script, I launch the browser, open the application URL, enter valid username and password, and click the login button.
C)	After clicking login, I verify whether the login is successful by checking an element on the home page like dashboard text, profile icon, or logout button.
D)	Example flow:
E)	Open browser (Chrome/Firefox)
F)	Navigate to login page URL
G)	Enter username (example: testuser@example.com)
H)	Enter password (example: Test@123)
I)	Click login button
J)	Validate successful login by checking dashboard element
K)	For negative testing, I also try invalid credentials, empty fields, and verify proper error messages are displayed.
L)	Finally, I close the browser after test execution.

5)	How would you automate UI + Mobile + API in a single framework?
A)	To automate UI, Mobile, and API in a single framework, I would create a hybrid framework with separate modules for each layer. I would use API automation as the base, Selenium for web UI, and Appium for mobile testing. Finally, I would integrate everything with common utilities and run it through CI/CD for unified execution.

6)	if a feature works fine on one mobile but not on another, what is your approach?
A)	I would first try to reproduce the issue on both devices to confirm the problem. Then I would check differences like OS version, device model, or app version and analyse logs to find the root cause. After that, I would report it to the developer and include that device in future testing.

7)	How do you debug failed test scenarios?
A)	I first check the error logs, screenshots, and reports to understand why the test failed. Then I try to reproduce the issue to confirm whether it is a script, application, or environment problem. Finally, I fix the script or report it as a bug if it is an application issue.

8)	Explain your approach to database and API testing?
A)	For API testing, I check requests and responses, status codes, and data correctness using tools like Postman or Rest Assured.
For database testing, I run SQL queries to verify data is correctly stored, updated, or deleted.
I also compare API data with database data to ensure everything is consistent.
