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
  "duration": 15017440400,
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
  "duration": 105775300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.gillette_title_is_displayed_on_the_screen()"
});
formatter.result({
  "duration": 6344200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicked_on_Register_link()"
});
formatter.result({
  "duration": 10071827000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#phdesktopbody_0_grs_consumer\\[lastname\\]\"}\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027D-113181255\u0027, ip: \u0027192.168.42.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\pr20145736\\AppData...}, goog:chromeOptions: {debuggerAddress: localhost:57526}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5320dcc31f620bc2bf50da909eb2791a\n*** Element info: {Using\u003did, value\u003dphdesktopbody_0_grs_consumer[lastname]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Utilities.PageUtil.click(PageUtil.java:560)\r\n\tat stepDefinitions.StepDefinition.user_clicked_on_Register_link(StepDefinition.java:108)\r\n\tat ✽.When user clicked on Register link(01registration.feature:7)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicked_on_create_your_profile_button()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 33978000,
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
  "duration": 4746229900,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.gillette_title_is_displayed_on_the_screen_Login()"
});
formatter.result({
  "duration": 88700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_link()"
});
formatter.result({
  "duration": 2197086900,
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
  "duration": 458229700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicked_on_Signin_button()"
});
formatter.result({
  "duration": 9026127400,
  "status": "passed"
});
});