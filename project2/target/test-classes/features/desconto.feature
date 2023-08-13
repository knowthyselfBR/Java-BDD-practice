# language: en
  Feature: search on webpage for text in list
    Scenario: logging search on mu webpage
      Given that I am on webpage
      When I search for each item in list
      Then I show log status for each item in list