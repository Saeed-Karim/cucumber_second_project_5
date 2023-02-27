Feature: SmartBear Functionality

  Background:
    Given user is on “http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx”

    Scenario:
      When user enters username as “abcd”
      And user enters password as “abcd1234”
      And user clicks on Login button
      Then user should see “Invalid Login or Password.” message
