@smoke
  Feature: User could add product to Wishlist


    Scenario: success message is visible after adding The product to wishlist
      When user add product to Wishlist
      Then success message is visible



    Scenario: wishlist items was increased
      When user add product to Wishlist
      Then success message is visible
      And user get num of wishlist items after adding product
      Then num of wishlist items increased