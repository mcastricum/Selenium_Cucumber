Feature: PrestaShop Account Login Mass

  Scenario Outline: user account login failure
    Given ChromeBrowser opened with https://prod-kurs.coderslab.pl/index.php
    When click sign in button
    When Login email enter <failureEmail>
    When Login password enter <failurePassword>
    Then Fail info Authentication failed.
    And close ChromeBrowser

    Examples:
      |failureEmail|failurePassword|
      |ijb@ijb.pl    |Password098|
      |ygv@ygv.pl    |Password987|
      |rfb@rfb.pl    |Password876|
      |plm@plm.pl    |Password765|
      |okn@okn.pl    |Password654|
      |dfhkjs@djal.pl|sdjalkjd   |
      |ijb@ijb.com   |Password123|