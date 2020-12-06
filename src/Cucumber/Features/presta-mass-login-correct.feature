Feature: PrestaShop Account Login Mass

  Scenario Outline: user account login
    Given ChromeBrowser opened with https://prod-kurs.coderslab.pl/index.php
    When click sign in button
    When Login email enter <loginEmail>
    When Login password enter <loginPassword>
    Then Info on page Sign out
    And close ChromeBrowser

    Examples:
      |loginEmail|loginPassword|
      |ijb@ijb.pl|Password123|
      |ygv@ygv.pl|Password234|
      |rfb@rfb.pl|Password345|
      |plm@plm.pl|Password456|
      |okn@okn.pl|Password567|