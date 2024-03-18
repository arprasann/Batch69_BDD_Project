$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Amazon_Invalid_LoginPage.feature");
formatter.feature({
  "name": "Amazon Invalid LoginPage Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Invalid LoginPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Amazon_InvalidLoginPage"
    }
  ]
});
formatter.step({
  "name": "Chrome Browser Open",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definations.LoginPage.chrome_Browser_Open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.enter_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move to Hello Sigin In Element",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.move_to_Hello_Sigin_In_Element()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sigin In Button",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.click_on_Sigin_In_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Mobile Number or Email ID",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.enter_Mobile_Number_or_Email_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Continue Button",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.click_on_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Invalid Password",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.enter_Invalid_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Error Msg",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definations.LoginPage.validate_Error_Msg()"
});
formatter.result({
  "status": "passed"
});
});