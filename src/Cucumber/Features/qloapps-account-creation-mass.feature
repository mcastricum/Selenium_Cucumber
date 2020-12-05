Feature: QLoApps Account Creation Mass

  Scenario Outline: user account creation
    Given browser opened with https://qloapps.coderslab.pl/pl/
    When click on login
    When an email <email> is entered in input field
    When gender is selected
    When FirstName <firstname> filled
    When LastName <lastname> filled
    When Password <password> filled
    When form submited
    Then page name MY ACCOUNT
    And close chrome

    Examples:
      |email|firstname|lastname|password|
      |asd@asd.pl|Adam|Adamski |Pass123 |
      |qwe@qwe.pl|Bogdan|Boganski|Pass234|
      |zxc@zxc.pl|Cezary|Cezarkowski|Pass345|