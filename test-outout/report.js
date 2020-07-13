$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01registration.feature");
formatter.feature({
  "line": 1,
  "name": "Gillette Registration",
  "description": "User want to register new user to Gillette website",
  "id": "gillette-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Registration for Gillette",
  "description": "",
  "id": "gillette-registration;registration-for-gillette",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Gillette homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Gillette title is displayed on the screen",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicked on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fill \"\u003cFIRSTNAME\u003e\" and \"\u003cLASTNAME\u003e\" and \"\u003cEMAIL\u003e\" and \"\u003cPASSWORD\u003e\" and \"\u003cCONFIRMPASSWORD\u003e\" details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user select the \"\u003cMONTH\u003e\" and \"\u003cYEAR\u003e\" DOB and \"\u003cZIPCODE\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicked on create your profile button",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "gillette-registration;registration-for-gillette;",
  "rows": [
    {
      "cells": [
        "FIRSTNAME",
        "LASTNAME",
        "EMAIL",
        "PASSWORD",
        "CONFIRMPASSWORD",
        "ZIPCODE",
        "MONTH",
        "YEAR"
      ],
      "line": 14,
      "id": "gillette-registration;registration-for-gillette;;1"
    },
    {
      "cells": [
        "Prashant",
        "Goel",
        "abc123@gmail.com",
        "abc123@1",
        "abc123@1",
        "122001",
        "06",
        "1990"
      ],
      "line": 15,
      "id": "gillette-registration;registration-for-gillette;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11539512500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Registration for Gillette",
  "description": "",
  "id": "gillette-registration;registration-for-gillette;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Gillette homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Gillette title is displayed on the screen",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicked on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fill \"Prashant\" and \"Goel\" and \"abc123@gmail.com\" and \"abc123@1\" and \"abc123@1\" details",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user select the \"06\" and \"1990\" DOB and \"122001\"",
  "matchedColumns": [
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicked on create your profile button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Gillette_homepage()"
});
formatter.result({
  "duration": 115680900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.gillette_title_is_displayed_on_the_screen()"
});
formatter.result({
  "duration": 92434600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicked_on_Register_link()"
});
formatter.result({
  "duration": 4872457500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prashant",
      "offset": 11
    },
    {
      "val": "Goel",
      "offset": 26
    },
    {
      "val": "abc123@gmail.com",
      "offset": 37
    },
    {
      "val": "abc123@1",
      "offset": 60
    },
    {
      "val": "abc123@1",
      "offset": 75
    }
  ],
  "location": "StepDefinition.user_fill_and_and_and_and_details(String,String,String,String,String)"
});
formatter.result({
  "duration": 1132092400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "06",
      "offset": 17
    },
    {
      "val": "1990",
      "offset": 26
    },
    {
      "val": "122001",
      "offset": 41
    }
  ],
  "location": "StepDefinition.user_select_the_and_DOB_and(String,String,String)"
});
formatter.result({
  "duration": 867144000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicked_on_create_your_profile_button()"
});
formatter.result({
  "duration": 4881241400,
  "status": "passed"
});
formatter.uri("02login.feature");
formatter.feature({
  "line": 1,
  "name": "Gillette Signin",
  "description": "User want to Signin to Gillette website with Username and Password",
  "id": "gillette-signin",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Signin to Gillette Website",
  "description": "",
  "id": "gillette-signin;signin-to-gillette-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Gillette homepage Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Gillette title is displayed on the screen Login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicked on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicked on Signin button",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "gillette-signin;signin-to-gillette-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "gillette-signin;signin-to-gillette-website;;1"
    },
    {
      "cells": [
        "abc123@gmail.com",
        "abc123@1"
      ],
      "line": 13,
      "id": "gillette-signin;signin-to-gillette-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21314000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Signin to Gillette Website",
  "description": "",
  "id": "gillette-signin;signin-to-gillette-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Gillette homepage Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Gillette title is displayed on the screen Login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicked on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"abc123@gmail.com\" and \"abc123@1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicked on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDef.user_is_on_Gillette_homepage_Login()"
});
formatter.result({
  "duration": 22625100,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.gillette_title_is_displayed_on_the_screen_Login()"
});
formatter.result({
  "duration": 71900,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_link()"
});
formatter.result({
  "duration": 2897112000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123@gmail.com",
      "offset": 13
    },
    {
      "val": "abc123@1",
      "offset": 36
    }
  ],
  "location": "loginStepDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 450966700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_button()"
});
formatter.result({
  "duration": 10384481100,
  "status": "passed"
});
formatter.uri("03forgotPassword.feature");
formatter.feature({
  "line": 1,
  "name": "Gillette ForgotPassword",
  "description": "User wants to check forgot password flow want to Signin to Gillette website with Username and Password",
  "id": "gillette-forgotpassword",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Forgot password for Gillette Website",
  "description": "",
  "id": "gillette-forgotpassword;forgot-password-for-gillette-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Gillette homepage Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Gillette title is displayed on the screen Login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicked on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on forgot password link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cemailid\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicked on create new password button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "gillette-forgotpassword;forgot-password-for-gillette-website;",
  "rows": [
    {
      "cells": [
        "emailid"
      ],
      "line": 13,
      "id": "gillette-forgotpassword;forgot-password-for-gillette-website;;1"
    },
    {
      "cells": [
        "abc123@gmail.com"
      ],
      "line": 14,
      "id": "gillette-forgotpassword;forgot-password-for-gillette-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 27797900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Forgot password for Gillette Website",
  "description": "",
  "id": "gillette-forgotpassword;forgot-password-for-gillette-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Gillette homepage Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Gillette title is displayed on the screen Login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicked on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on forgot password link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters \"abc123@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicked on create new password button",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDef.user_is_on_Gillette_homepage_Login()"
});
formatter.result({
  "duration": 19073700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.gillette_title_is_displayed_on_the_screen_Login()"
});
formatter.result({
  "duration": 94000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_link()"
});
formatter.result({
  "duration": 3309453600,
  "status": "passed"
});
formatter.match({
  "location": "forgotPasswordStepDef.user_clicks_on_forgot_password_link()"
});
formatter.result({
  "duration": 2608888900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123@gmail.com",
      "offset": 13
    }
  ],
  "location": "forgotPasswordStepDef.user_enters(String)"
});
formatter.result({
  "duration": 240594700,
  "status": "passed"
});
formatter.match({
  "location": "forgotPasswordStepDef.user_clicked_on_create_new_password_button()"
});
formatter.result({
  "duration": 2750544800,
  "status": "passed"
});
});