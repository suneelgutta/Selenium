

@sample
Feature: Gmail_registration

Scenario Outline: Gmail_regestration

Given user launches <url> registration page
When user enters info field of <site>
#Then error message should be displayed in <site>
Examples: 
| url | site|
| https://accounts.google.com/SignUp?service=mail&amp;continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en|gmail|
| https://www.facebook.com/ |facebook|



