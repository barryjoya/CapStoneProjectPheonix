@tag
Feature: user on Retail Websitee

  @Demo
  Scenario Outline: Login to Test Environment Retail Page
    Given user is on retail website
    When user click on login button
    Then user enter userName '<userName>' and Password '<Password>'
    And user should see a success message

    Examples: 
      | userName              | Password |
      | sdet@tekschool.us     | sdet     |
      | consumer@tekschool.us | JBond    |
      | students@tekschool.us | TEST     |

      @Gmail
      Scenario: login into gmail account
      Given user enter userName <'baryalaijoyandah@gmail.com'>and password <'Rohina@22'>
      Then user see a success message
      
      @Amazon
      Scenario: User login to Amazon 
      Given user on amazon website 
      When user click on sign button
      Then user see userName <'bariallaijoyandah@gmail.com'> and password <'frozan222'>
      And user click on submit button 
      And user see a amazon success message