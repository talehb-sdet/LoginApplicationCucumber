Feature: Login both applications

  Scenario Outline: Login app positive scenario
    Given user launch a browser "<browser>"
    And  Amazon is launched
    When user navigates to sign in page
    And user enters "<username>" and "<password>" and clicks on login button
    Then verify user is on Homepage

    Examples:
    |browser|username|password|
    |https://www.amazon.com/  |      |    |
    #| www.amazon.com  | btaleh123@gmail.com   |   |


  Scenario Outline: Login app negative scenario
    Given user launch a browser "<browser>"
    And  Amazon is launched
    When user navigates to sign in page
    And user enters "<username>" and "<password>" and clicks on login button
    Then verify user is not on Homepage

    Examples:
      |browser|username|password|
      |https://www.amazon.com/  |      |    |
    #| www.amazon.com  | btaleh123@gmail.com   |   |