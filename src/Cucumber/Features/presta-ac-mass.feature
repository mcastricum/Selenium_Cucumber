Feature: PrestaShop Account Creation Mass

  Scenario Outline: user account creation
    Given browser opened with https://prod-kurs.coderslab.pl/index.php
    When click on sign in
    When click on create
    When gender selection
    When FirstName <prestaFirstName> entered
    When LastName <prestaLastName> entered
    When email <prestaEmail> entered
    When Password <prestaPassword> entered
    #When submit account
    Then Page shown Sign out
    And close WebBrowser

    Examples:
      |prestaEmail|prestaFirstName|prestaLastName|prestaPassword|
      |ijb@ijb.pl|Adam  |Adamski    |Password123|
      |ygv@ygv.pl|Bogdan|Boganski   |Password234|
      |rfb@rfb.pl|Cezary|Cezarkowski|Password345|
      |plm@plm.pl|Damian|Damiencki  |Password456|
      |okn@okn.pl|Edward|Edwardowski|Password567|
