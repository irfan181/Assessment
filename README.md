Part A – Conceptual Questions

1. Test Cases for Login Functionality?
A. i) Verify login with valid username and password → user should navigate to dashboard
   ii) Verify login with invalid credentials → error message should be displayed
   iii) Verify login with empty fields → validation message should appear
   iv) Verify password is masked
   v) Verify login button is clickable

2. Automation Approach for Mobile + Web?
A. I will use a common framework with:
   Selenium WebDriver for web
   Appium for mobile
   Approach:
   Create reusable test cases
   Maintain common utilities (like login methods)
   Run tests on different devices and browsers
   Use TestNG for execution and reporting

3. Automating Login using Appium?
A. Launch mobile browser (Chrome/Safari)
   Open URL
   Locate username and password fields
   Enter credentials
   Click login button
   Validate success message or next page
   
4. Automating UI + Mobile + API in One Framework?
A. Open browser using WebDriver
   Navigate to URL
   Locate elements using ID/XPath
   Enter username and password
   Click login
   Validate successful login

5. Feature Works on One Mobile but Not Another?
A. Use a hybrid framework
   UI → Selenium
   Mobile → Appium
   API → Rest Assured
   Use common reporting and test structure
   Integrate all tests in one pipeline
   
6. Feature Works on One Mobile but Not Another?
A. Approach:
   Check device compatibility
   Verify OS version differences
   Debug logs
   Check screen resolution issues
   Test on multiple real devices/emulators
   
7. Debug Failed Test Scenarios?
A. Check logs and error messages
   Use screenshots
   Re-run test
   Validate element locators
   Check environment issues
   
8. Database and API Testing Approach?
A. Validate API response (status, data)
   Use tools like Postman or automation
   Verify database values using queries
   Compare UI data with database data

