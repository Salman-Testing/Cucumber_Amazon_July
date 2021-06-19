$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality of the given application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Facebook"
    }
  ]
});
formatter.scenario({
  "name": "To verify the login functionality with invalid username and valid password for facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will hit the URl",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_will_hit_the_URl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the username and password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Selenium",
        "Java"
      ]
    },
    {
      "cells": [
        "SQL",
        "SQL @123"
      ]
    },
    {
      "cells": [
        "Python",
        "Python@123"
      ]
    },
    {
      "cells": [
        "SeleniumAuto",
        "JavaPython"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.user_will_enter_the_and(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_will_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed with error MSG",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_should_be_displayed_with_error_MSG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed the different URL",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeDisplayedTheDifferentURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed with Home Page",
  "keyword": "But "
});
formatter.match({
  "location": "StepDefinition1.user_should_be_displayed_with_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login functionality with valid username and valid password for Instagram",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will hit the url of app",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.user_will_hit_the_url_of_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_will_enter_the_Username_and_Password()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.steps.StepDefinition2.user_will_enter_the_Username_and_Password(StepDefinition2.java:21)\r\n\tat ✽.User will enter the Username and Password(file:src/test/resources/login.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User will click the LogIn button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.user_will_click_the_LogIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be displayed with Error MSG",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.user_should_be_displayed_with_Error_MSG()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/login1.feature");
formatter.feature({
  "name": "To validate the login functionality of the given applicatioN",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Instagram"
    }
  ]
});
formatter.scenario({
  "name": "To verify the login functionality with invalid username and valid password for INStagram",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Instagram"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will hit the Url of app",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_will_hit_the_Url_of_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the Username anD Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_will_enter_the_Username_anD_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the LogIn buttoN",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_will_click_the_LogIn_buttoN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed with Error MsG",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.user_should_be_displayed_with_Error_MsG()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});