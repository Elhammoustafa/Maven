@smoke

  Feature: user could search in home page

    Scenario Outline: user could search by product name
      When user click on search field
      And user search with "<productName>"
      And user click on search button
      Then user could find "<productName>" relative result

      Examples:
      |productName|
      |book|
      |laptop|
      |nike|

    Scenario Outline: user could search by product sku
      When user click on search field
      And user search with "<sku>"
      And user click on search button
      And user click on product
      Then validate that the sku shown in page "<sku>"

      Examples:
        |sku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|

