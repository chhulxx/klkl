$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "login feat",
  "description": "",
  "id": "login-feat",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "user on facebook page",
  "description": "",
  "id": "login-feat;user-on-facebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": ": Enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": ": user enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": ": click the login btn",
  "keyword": "Then "
});
formatter.match({
  "location": "Logic.enter_the_url()"
});
formatter.result({
  "duration": 19628961547,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_enter_the_username_and_password()"
});
formatter.result({
  "duration": 570265973,
  "status": "passed"
});
formatter.match({
  "location": "Logic.click_the_login_btn()"
});
formatter.result({
  "duration": 3497010826,
  "status": "passed"
});
});