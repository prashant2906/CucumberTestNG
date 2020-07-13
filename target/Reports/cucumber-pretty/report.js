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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Registration"
    }
  ]
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
  "line": 13,
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
      "line": 15,
      "id": "gillette-registration;registration-for-gillette;;1"
    },
    {
      "cells": [
        "Prashant",
        "Goel",
        "automationtest2906@gmail.com",
        "lkjhgfdsa@2",
        "lkjhgfdsa@2",
        "122001",
        "06",
        "1990"
      ],
      "line": 16,
      "id": "gillette-registration;registration-for-gillette;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9689872000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Registration for Gillette",
  "description": "",
  "id": "gillette-registration;registration-for-gillette;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Registration"
    }
  ]
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
  "name": "user fill \"Prashant\" and \"Goel\" and \"automationtest2906@gmail.com\" and \"lkjhgfdsa@2\" and \"lkjhgfdsa@2\" details",
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
  "duration": 118379800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.gillette_title_is_displayed_on_the_screen()"
});
formatter.result({
  "duration": 7430500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicked_on_Register_link()"
});
formatter.result({
  "duration": 673358700,
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
      "val": "automationtest2906@gmail.com",
      "offset": 37
    },
    {
      "val": "lkjhgfdsa@2",
      "offset": 72
    },
    {
      "val": "lkjhgfdsa@2",
      "offset": 90
    }
  ],
  "location": "StepDefinition.user_fill_and_and_and_and_details(String,String,String,String,String)"
});
formatter.result({
  "duration": 2797578700,
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
  "duration": 618123200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicked_on_create_your_profile_button()"
});
formatter.result({
  "duration": 2606959500,
  "status": "passed"
});
formatter.after({
  "duration": 27438200,
  "status": "passed"
});
formatter.after({
  "duration": 7234628800,
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
  "name": "Signin to Gillette India Website",
  "description": "",
  "id": "gillette-signin;signin-to-gillette-india-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@IndiaLogin"
    }
  ]
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
  "id": "gillette-signin;signin-to-gillette-india-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "gillette-signin;signin-to-gillette-india-website;;1"
    },
    {
      "cells": [
        "automationtest2906@gmail.com",
        "lkjhgfdsa@2"
      ],
      "line": 13,
      "id": "gillette-signin;signin-to-gillette-india-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 32237500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Signin to Gillette India Website",
  "description": "",
  "id": "gillette-signin;signin-to-gillette-india-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@IndiaLogin"
    }
  ]
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
  "name": "user enters \"automationtest2906@gmail.com\" and \"lkjhgfdsa@2\"",
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
  "duration": 3862036900,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.gillette_title_is_displayed_on_the_screen_Login()"
});
formatter.result({
  "duration": 75300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_link()"
});
formatter.result({
  "duration": 4302751100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automationtest2906@gmail.com",
      "offset": 13
    },
    {
      "val": "lkjhgfdsa@2",
      "offset": 48
    }
  ],
  "location": "loginStepDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 503530100,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_button()"
});
formatter.result({
  "duration": 10072280400,
  "status": "passed"
});
formatter.before({
  "duration": 32877300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Signin to Gillette Austria Website",
  "description": "",
  "id": "gillette-signin;signin-to-gillette-austria-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@FranceLogin"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is on Gillette France homepage Login",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user clicked on Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "Automationtest2906@gmail.com",
        "lkjhgfdsa@2"
      ],
      "line": 21
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDef.user_is_on_Gillette_France_homepage_Login()"
});
formatter.result({
  "duration": 2275770100,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_link()"
});
formatter.result({
  "duration": 72861900,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using class name\u003devent_profile_login\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027D-113181255\u0027, ip: \u0027192.168.42.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Utilities.PageUtil.click(PageUtil.java:560)\r\n\tat stepDefinitions.loginStepDef.user_clicked_on_Signin_link(loginStepDef.java:47)\r\n\tat ✽.When user clicked on Signin link(02login.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "loginStepDef.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
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
        "automationtest2906@gmail.com"
      ],
      "line": 14,
      "id": "gillette-forgotpassword;forgot-password-for-gillette-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 95004900,
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
  "name": "user enters \"automationtest2906@gmail.com\"",
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
  "duration": 61360200,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027D-113181255\u0027, ip: \u0027192.168.42.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\pr20145736\\AppData...}, goog:chromeOptions: {debuggerAddress: localhost:54053}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 97c955ca5ea523e887ab4c247678cf97\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat Utilities.PageUtil.navigateto(PageUtil.java:976)\r\n\tat stepDefinitions.loginStepDef.user_is_on_Gillette_homepage_Login(loginStepDef.java:37)\r\n\tat ✽.Given user is on Gillette homepage Login(03forgotPassword.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "loginStepDef.gillette_title_is_displayed_on_the_screen_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "forgotPasswordStepDef.user_clicks_on_forgot_password_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "automationtest2906@gmail.com",
      "offset": 13
    }
  ],
  "location": "forgotPasswordStepDef.user_enters(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "forgotPasswordStepDef.user_clicked_on_create_new_password_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("04resetPassword.feature");
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
  "name": "user should redirect to \"\u003cgmail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter the credentials \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click reset password button in email",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fill \"\u003cnewpass\u003e\" and \"\u003cconnewpass\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "try to login again using \"\u003cusername\u003e\" and \"\u003cnewpass\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "gillette-registration;registration-for-gillette;",
  "rows": [
    {
      "cells": [
        "gmail",
        "username",
        "password",
        "newpass",
        "connewpass"
      ],
      "line": 13,
      "id": "gillette-registration;registration-for-gillette;;1"
    },
    {
      "cells": [
        "https://mail.google.com",
        "Automationtest2906@gmail.com",
        "lkjhgfdsa@2",
        "lkjhgfdsa@2",
        "lkjhgfdsa@2"
      ],
      "line": 14,
      "id": "gillette-registration;registration-for-gillette;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 53656500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Registration for Gillette",
  "description": "",
  "id": "gillette-registration;registration-for-gillette;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user should redirect to \"https://mail.google.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter the credentials \"Automationtest2906@gmail.com\" and \"lkjhgfdsa@2\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click reset password button in email",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fill \"lkjhgfdsa@2\" and \"lkjhgfdsa@2\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "try to login again using \"Automationtest2906@gmail.com\" and \"lkjhgfdsa@2\"",
  "matchedColumns": [
    1,
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://mail.google.com",
      "offset": 25
    }
  ],
  "location": "resetPasswordStepDef.user_should_redirect_to(String)"
});
formatter.result({
  "duration": 29353500,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027D-113181255\u0027, ip: \u0027192.168.42.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\pr20145736\\AppData...}, goog:chromeOptions: {debuggerAddress: localhost:54053}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 97c955ca5ea523e887ab4c247678cf97\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat Utilities.PageUtil.navigateto(PageUtil.java:976)\r\n\tat stepDefinitions.resetPasswordStepDef.user_should_redirect_to(resetPasswordStepDef.java:29)\r\n\tat ✽.Given user should redirect to \"https://mail.google.com\"(04resetPassword.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automationtest2906@gmail.com",
      "offset": 23
    },
    {
      "val": "lkjhgfdsa@2",
      "offset": 58
    }
  ],
  "location": "resetPasswordStepDef.enter_the_credentials_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "resetPasswordStepDef.user_click_reset_password_button_in_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "lkjhgfdsa@2",
      "offset": 11
    },
    {
      "val": "lkjhgfdsa@2",
      "offset": 29
    }
  ],
  "location": "resetPasswordStepDef.user_fill_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Automationtest2906@gmail.com",
      "offset": 26
    },
    {
      "val": "lkjhgfdsa@2",
      "offset": 61
    }
  ],
  "location": "resetPasswordStepDef.try_to_login_again_using_new_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
});