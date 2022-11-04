Feature: User wants to login into their account
  Scenario: User should be able to login successfully with valid credentials
    Given an existing user
    When user open browser with www.kmail.com
    And fill in with valid username
    And fill in with valid password
    Then click on login button
    Then user should be able to login successfully

    Scenario: User should not be able to login with valid username and invalid password
      Given an existing user
      When user open browser www.kmail.com
      And go to login page
      Then enter a valid username 
      And enter an invalid password
      And click login button
      Then user will not be able to login successfully

      Scenario: User should not be able to login with invalid user name and valid password
        Given and existing user
        When user open browser www.kmail.com
        And go to login page
        Then enter invalid username
        And enter valid password
        And click login button
        Then user should not be able to login successfully

        Scenario: User should not be able to login with invalid credentials
          Given an existing user
          When user open the browser www.kmail.com
          And got to login page
          Then enter invalid username and password
          And clicl login button
          Then user should not be able to login successfully