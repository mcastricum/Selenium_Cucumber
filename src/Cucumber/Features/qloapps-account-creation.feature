Feature: QLoApps Account Creation

  Scenario: user can create an account
    Given an open browser with https://qloapps.coderslab.pl/pl/
    When click on zaloguj
    When an email testy@test.pl is entered in input field
    When gender selected
    When firstname filled
    When lastname filled
    When password filled
    When potwierdzenie formularza
    Then nazwa strony MY ACCOUNT
    And close web page